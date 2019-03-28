package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class TelefoneDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public TelefoneDAO() {
        Connection conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirTelefone(Telefone telefones) {
        String sql = "INSERT INTO Telefones(numero) "
                + "VALUES(?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, telefones.getNumero());
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
    // MÉTODO LISTAR

    public void listarTelefones() {

    }

    // MÉTODO PESQUSIAR
    public void pesquisarTelefones() {

    }

    // MÉTODO ALTERAR
    public void alterarTelefones() {

    }

    // MÉTODO EXCLUIR
    public void excluirTelefones() {

    }

}
