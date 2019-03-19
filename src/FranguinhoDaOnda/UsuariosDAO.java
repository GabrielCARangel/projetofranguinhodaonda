package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class UsuariosDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public UsuariosDAO() {
        Connection conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(Usuarios usuarios) {
        String sql = "INSERT INTO Usuarios(login,senha,tipo) "
                + "VALUES(?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuarios.getUsuario());
            stmt.setString(2, usuarios.getSenha());
            stmt.setString(3, usuarios.getTipo());
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
    // MÉTODO LISTAR

    public void listarUsuarios() {

    }

    // MÉTODO PESQUSIAR
    public void pesquisarUsuarios() {

    }

    // MÉTODO ALTERAR
    public void alterarUsuarios() {

    }

    // MÉTODO EXCLUIR
    public void excluirUsuarios() {

    }

}