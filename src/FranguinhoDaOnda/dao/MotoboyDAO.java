package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Motoboy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MotoboyDAO {

    private Connection conexao;

    // MÉTODO CONSTRUTOR
    public MotoboyDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirMotoboy(Motoboy motoboys) {
        boolean resultado = false;
        String sql = "INSERT INTO motoboys(placa,nome,cpf,numero) "
                + "VALUES(?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, motoboys.getPlaca());
            stmt.setString(2, motoboys.getNome());
            stmt.setString(3, motoboys.getCpf());
            stmt.setString(4, motoboys.getNumero());
            stmt.execute();
            stmt.close();
            resultado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao banco de dados - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        return resultado;
    }

    // MÉTODO LISTAR
    public ArrayList<Motoboy> getlist() {
        ArrayList<Motoboy> arrayMotoboys = new ArrayList<>();
        // Comando SQL = SELECT * FROM Motoboys ORDER BY nome"
        String sql = "SELECT * FROM motoboys ORDER BY nome";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Motoboy motoboy = new Motoboy();
                motoboy.setCpf(rs.getString("cpf"));
                motoboy.setNome(rs.getString("nome"));
                motoboy.setPlaca(rs.getString("placa"));
                motoboy.setNumero(rs.getString("numero"));
                arrayMotoboys.add(motoboy);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao banco de dados - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        return arrayMotoboys;
    }

    public ArrayList<Motoboy> getlistByNome(String nome) {
        nome = "%" + nome.trim() + "%";
        ArrayList<Motoboy> arrayMotoboys = new ArrayList<>();
        String sql = "SELECT * FROM motoboys WHERE nome LIKE ? ORDER BY nome";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Motoboy motoboy = new Motoboy();
                motoboy.setCpf(rs.getString("cpf"));
                motoboy.setNome(rs.getString("nome"));
                motoboy.setPlaca(rs.getString("placa"));
                motoboy.setNumero(rs.getString("numero"));
                arrayMotoboys.add(motoboy);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao banco de dados - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        return arrayMotoboys;
    }

    // MÉTODO ALTERAR
    public boolean alterarMotoboy(Motoboy motoboy) {
        boolean resultado = false;
        String sql = "UPDATE motoboys SET cpf = ?, nome = ?, placa = ?, numero = ? WHERE cpf = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, motoboy.getCpf());
            stmt.setString(2, motoboy.getNome());
            stmt.setString(3, motoboy.getPlaca());
            stmt.setString(4, motoboy.getNumero());
            stmt.setString(5, motoboy.getCpf());
            stmt.executeUpdate();
            stmt.close();
            resultado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao banco de dados - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        return resultado;
    }

    // MÉTODO EXCLUIR
    public boolean excluirMotoboy(Motoboy motoboy) {
        boolean resultado = false;
        String sql = "DELETE FROM motoboys WHERE cpf = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, motoboy.getCpf());
            stmt.executeUpdate();
            stmt.close();
            resultado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao banco de dados - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        return resultado;
    }
}
