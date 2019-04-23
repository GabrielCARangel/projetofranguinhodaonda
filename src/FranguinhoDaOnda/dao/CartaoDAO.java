package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Cartao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CartaoDAO {

    private Connection conexao;

    // MÉTODO CONSTRUTOR
    public CartaoDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCartao(Cartao cartao) {
        boolean resultado = false;
        String sql = "INSERT INTO Cartoes(numero,bandeira,validade,debcred)"
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cartao.getNumero());
            stmt.setString(2, cartao.getBandeira());
            stmt.setString(3, cartao.getValidade());
            stmt.setInt(4, (int) cartao.getDebcred());
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

    // MÉTODO ALTERAR
    public boolean alterarCartao(Cartao cartao) {
        boolean resultado = false;
        String sql = "UPDATE Cartoes set numero = ?, bandeira = ?, validade = ?, debcred = ? WHERE numero = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cartao.getNumero());
            stmt.setString(2, cartao.getBandeira());
            stmt.setString(3, cartao.getValidade());
            stmt.setInt(4, (int) cartao.getDebcred());
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

    // MÉTODO EXCLUIR
    public boolean excluirCartao(Cartao cartao) {
        boolean resultado = false;
        String sql = "DELETE FROM Cartoes WHERE numero = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cartao.getNumero());
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
