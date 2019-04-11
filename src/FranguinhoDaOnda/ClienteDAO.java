package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public ClienteDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(Cliente clientes) {
        // Comando SQL = INSERT INTO Cliente (cpf, nome, numero_residencia, complemento)
        //               VALUES (?, ?, ?, ?)
        String sql = "INSERT INTO Clientes(cpf,nome,numero_residencial,complemento,Enderecos_cep,Cartoes_numero) "
                + "VALUES(?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientes.getCpf());
            stmt.setString(2, clientes.getNome());
            stmt.setString(3, clientes.getNumero_residencial());
            stmt.setString(4, clientes.getComplemento());
            stmt.setString(5, clientes.getEnd().getCep());
            stmt.setString(6, clientes.getCart().getNumero());
            stmt.execute();
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    // MÉTODO LISTAR
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        // Comando SQL = SELECT * FROM Cliente ORDER BY nome"
        String sql = "SELECT * FROM Clientes ORDER BY nome";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNumero_residencial(rs.getString("numero_residencia"));
                cliente.setComplemento(rs.getString("complemento"));
                clientes.add(cliente);
            }
            stmt.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return clientes;
    }

    public void pesquisarClientes() {

    }

    // MÉTODO ALTERAR
    public void alterarClientes() throws SQLException {
        // COMANDO SQL
        String sql = "UPDATE Clientes set num_point = ? where nome = ?";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNumero_residencial(rs.getString("numero_residencia"));
                cliente.setComplemento(rs.getString("complemento"));
                stmt.close();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        // MÉTODO EXCLUIR
    public void excluirClientes() {

    }
}
