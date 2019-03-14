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
        Connection conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(ItemDePedido itemdepedido) {
        String sql = "INSERT INTO ItemDePedido(Pedidos_numero,Produtos_codigo,quantidade) "
                + "VALUES(?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, (int) itemdepedido.getPedidos_numero());
            stmt.setInt(2, (int) itemdepedido.getProdutos_codigo());
            stmt.setInt(3, (int) itemdepedido.getQuantidade());
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ItemDePedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

}
