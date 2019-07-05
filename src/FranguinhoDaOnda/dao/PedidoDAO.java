/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Cliente;
import FranguinhoDaOnda.model.Endereco;
import FranguinhoDaOnda.model.ItemDePedido;
import FranguinhoDaOnda.model.Motoboy;
import FranguinhoDaOnda.model.NotaFiscal;
import FranguinhoDaOnda.model.Pedido;
import FranguinhoDaOnda.model.Telefone;
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
        String sql = "SELECT numero, preco_final, situacao, formapagamento, m.placa FROM franguinho_da_onda.motoboys"
                + "INNER JOIN Motoboys m ON p.cpf = t.Motoboys_placa"
                + "INNER JOIN "
                + "INNER JOIN "
                + "SELECT * FROM Clientes WHERE nome LIKE ? ORDER BY nome";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                Motoboy motoboy = new Motoboy();
                NotaFiscal notafiscal = new NotaFiscal();
                Cliente cliente = new Cliente();
                pedido.setNumero(rs.getLong("numero"));
                pedido.setPreco_final(rs.getDouble("precofinal"));
                pedido.setSituacao(rs.getString("situacao"));
                pedido.setFormapagamento(rs.getString("formapagamento"));
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

    public ArrayList<Cliente> getlistByNome(String nome) {
        nome = "%" + nome.trim() + "%";
        ArrayList<Cliente> arrayClientes = new ArrayList<>();
        String sql = "SELECT c.*, t.numero, e.* FROM franguinho_da_onda.clientes c\n"
                + "INNER JOIN Telefones t ON c.cpf = t.Clientes_cpf\n"
                + "INNER JOIN Enderecos e ON e.cep = c.Enderecos_cep\n"
                + "WHERE nome LIKE ?"; 
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                Telefone telefone = new Telefone();
                Endereco endereco = new Endereco();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                telefone.setNumero(rs.getString("numero"));
                endereco.setCep(rs.getString("cep"));
                endereco.setRua(rs.getString("rua"));
                cliente.setNumero_residencial(rs.getString("numero_residencial"));
                endereco.setBairro(rs.getString("bairro"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setTel(telefone);
                cliente.setEnd(endereco);
                arrayClientes.add(cliente);
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
        return arrayClientes;
    }  
}
