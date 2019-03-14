package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class EnderecosDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public EnderecosDAO() {
        Connection conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(Enderecos enderecos) {
        String sql = "INSERT INTO Enderecos(cep,rua,bairro) "
                + "VALUES(?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, enderecos.getCep());
            stmt.setString(2, enderecos.getRua());
            stmt.setString(3, enderecos.getBairro());
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EnderecosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    // MÉTODO LISTAR
    public void listarEnderecos() {

    }

    // MÉTODO PESQUSIAR
    public void pesquisarEnderecos() {

    }

    // MÉTODO ALTERAR
    public void alterarEnderecos() {

    }

    // MÉTODO EXCLUIR
    public void excluirEnderecos() {

    }
}
