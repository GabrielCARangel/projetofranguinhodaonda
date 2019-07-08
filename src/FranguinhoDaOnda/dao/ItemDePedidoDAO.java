package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.ItemDePedido;
import FranguinhoDaOnda.model.Pedido;
import FranguinhoDaOnda.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class ItemDePedidoDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public ItemDePedidoDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(ItemDePedido itemdepedido) {
        String sql = "INSERT INTO ItensDePedidos(codigo, quantidade, Pedidos_numero, Produtos_codigo) "
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
        // MÉTODO LISTAR
    public ArrayList<ItemDePedido> getlist() {
        ArrayList<ItemDePedido> arrayItensDePedidos = new ArrayList<>();
        String sql = "SELECT "
                + "FROM franguinho_da_onda.itensdepedidos AS idp, franguinho_da_onda.produtos AS prd, franguinho_da_onda.pedidos AS pe"
                + "WHERE pe.numero = idp.Pedidos_numero";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ItemDePedido itemdepedido = new ItemDePedido();
                Produto produto = new Produto();
                Pedido pedido = new Pedido();
                itemdepedido.setCodigo(rs.getLong("codigo"));
                itemdepedido.setQuantidade(rs.getInt("quantidade"));
                produto.setCodigo(rs.getInt("codigo"));
                pedido.setNumero(rs.getInt("numero"));
                itemdepedido.setPrd(produto);
                itemdepedido.setPe(pedido);
                arrayItensDePedidos.add(itemdepedido);
            }
            stmt.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao banco de dados - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão - " + ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
        return arrayItensDePedidos;
    }  
}
