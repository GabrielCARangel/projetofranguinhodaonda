package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection conexao;

    // MÉTODO CONSTRUTOR
    public UsuarioDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirUsuario(Usuario usuario) {
        boolean resultado = false;
        String sql = "INSERT INTO usuarios(login,senha,tipo) "
                + "VALUES(?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getTipo());
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
    public boolean alterarUsuario(Usuario usuario) {
        boolean resultado = false;
        String sql = "UPDATE usuarios SET login = ?, senha = ? tipo= ?, where login = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getTipo());
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
    public boolean excluirUsuario(Usuario usuario) {
        boolean resultado = false;
        String sql = "DELETE FROM usuarios WHERE usuario = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
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

    public Usuario fazerLogin(String login, String senha) {
        String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
        Usuario usuario = null;
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
            }
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            try {
                this.conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        return usuario;
    }
}
