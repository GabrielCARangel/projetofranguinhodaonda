package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.ItemDePedido;
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
        String sql = "INSERT INTO ItemDePedido(codigo, quantidade, Pedidos_numero, Produtos_cdigo) "
                + "VALUES(?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setLong(1, itemdepedido.getCodigo());
            stmt.setInt(2, itemdepedido.getQuantidade());
            stmt.setInt(3, itemdepedido.getPrd().getCodigo());
            stmt.setLong(4, itemdepedido.getPe().getNumero());
            stmt.execute();
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ItemDePedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
