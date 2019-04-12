package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class ItemDePedidoDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public ItemDePedidoDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(ItemDePedido itemdepedido) {
        String sql = "INSERT INTO ItemDePedido(quantidade) "
                + "VALUES(?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, (int) itemdepedido.getQuantidade());
            stmt.execute();
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ItemDePedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
