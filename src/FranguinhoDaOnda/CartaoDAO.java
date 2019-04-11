package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class CartaoDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public CartaoDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCartao(Cartao cartoes) {
        String sql = "INSERT INTO Cartoes(numero,bandeira,validade,debcred)"
                + "VALUES(?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cartoes.getNumero());
            stmt.setString(2, cartoes.getBandeira());
            stmt.setString(3, cartoes.getValidade());
            stmt.setInt(4, (int) cartoes.getDebcred());
            stmt.execute();
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CartaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
    // MÉTODO LISTAR

    public void listarCartoes() {

    }

    // MÉTODO PESQUSIAR
    public void pesquisarCartoes() {

    }

    // MÉTODO ALTERAR
    public void alterarCartoes() {

    }
}
