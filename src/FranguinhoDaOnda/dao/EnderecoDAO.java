package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EnderecoDAO {

    private Connection conexao;

    // MÉTODO CONSTRUTOR
    public EnderecoDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirEndereco(Endereco endereco) {
        boolean resultado = false;
        String sql = "INSERT INTO enderecos(cep,rua,bairro) "
                + "VALUES(?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, endereco.getCep());
            stmt.setString(2, endereco.getRua());
            stmt.setString(3, endereco.getBairro());
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
    public boolean alterarEndereco(Endereco endereco) {
        boolean resultado = false;

        String sql = "UPDATE enderecos SET cep = ?, rua = ?, bairro = ? WHERE cep = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, endereco.getCep());
            stmt.setString(2, endereco.getRua());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCep());
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
    public boolean excluirEndereco(Endereco endereco) {
        boolean resultado = false;
        String sql = "DELETE FROM enderecos WHERE cep = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, endereco.getCep());
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
