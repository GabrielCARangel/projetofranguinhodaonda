/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Cliente;
import FranguinhoDaOnda.model.ItemDePedido;
import FranguinhoDaOnda.model.Motoboy;
import FranguinhoDaOnda.model.NotaFiscal;
import FranguinhoDaOnda.model.Pedido;
import FranguinhoDaOnda.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class PedidoDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public PedidoDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirPedido(Pedido pedido) {
        String sql = "INSERT INTO pedido(numero, preco_final, situacao, formapagamento, Motoboys_placa, NotaFiscal_nnf, Clientes_cpf) "
                + "VALUES(?,?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setLong(1, pedido.getNumero());
            stmt.setDouble(2, pedido.getPreco_final());
            stmt.setString(3, pedido.getSituacao());
            stmt.setString(4, pedido.getFormapagamento());
            stmt.setString(5, pedido.getMot().getPlaca());
            stmt.setString(6, pedido.getNf().getNnf());
            stmt.setString(7, pedido.getCl().getCpf());
            stmt.execute();
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ItemDePedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    // MÉTODO LISTAR
    public ArrayList<Pedido> getlist() {
        ArrayList<Pedido> arrayPedidos = new ArrayList<>();
        String sql = "SELECT p.numero, p.preco_final, p.situacao, p.formapagamento, m.placa, nf.nnf, cl.cpf, idp.codigo, idp.quantidade, prd.codigo "
                + "FROM franguinho_da_onda.pedidos AS p, franguinho_da_onda.motoboys AS m, franguinho_da_onda.notasfiscais AS nf, franguinho_da_onda.clientes AS cl, "
                + "franguinho_da_onda.itensdepedidos AS idp, franguinho_da_onda.produtos AS prd "
                + "WHERE m.placa = p.Motoboys_placa AND nf.nnf = p.NotasFiscais_nnf AND cl.cpf = p.Clientes_cpf AND "
                + "p.numero = idp.Pedidos_numero AND prd.codigo = idp.Produtos_codigo";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                Motoboy motoboy = new Motoboy();
                NotaFiscal notafiscal = new NotaFiscal();
                Cliente cliente = new Cliente();
                Produto produto = new Produto();
                ItemDePedido itemdepedido = new ItemDePedido();
                pedido.setNumero(rs.getLong("numero"));
                pedido.setPreco_final(rs.getDouble("precofinal"));
                pedido.setSituacao(rs.getString("situacao"));
                pedido.setFormapagamento(rs.getString("formapagamento"));
                motoboy.setPlaca(rs.getString("placa"));
                notafiscal.setNnf(rs.getString("nnf"));
                cliente.setCpf(rs.getString("cpf"));
                itemdepedido.setCodigo(rs.getLong("codigo"));
                itemdepedido.setQuantidade(rs.getInt("quantidade"));
                produto.setCodigo(rs.getInt("codigo"));
                pedido.setMot(motoboy);
                pedido.setNf(notafiscal);
                pedido.setCl(cliente);
                itemdepedido.setPrd(produto);
                itemdepedido.setPe(pedido);
                arrayPedidos.add(pedido);
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
        return arrayPedidos;
    }

    // MÉTODO ALTERAR
    public boolean alterarPedido(Pedido pedido) {
        boolean resultado = false;
        String sql = "UPDATE pedidos SET situacao = ? WHERE numero = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, pedido.getSituacao());
            stmt.setLong(2, pedido.getNumero());
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
}
