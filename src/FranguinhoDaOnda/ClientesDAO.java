package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientesDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public ClientesDAO() {
        Connection conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(Clientes clientes) {
        // Comando SQL = INTER INTO Clientes (cpf, nome, numero_residencia)
        //               VALUES (?, ?, ?, ?)
        String sql = "INSERT INTO Clientes(cpf,nome,numero_residencial,complemento) "
                + "VALUES(?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientes.getCpf());
            stmt.setString(2, clientes.getNome());
            stmt.setString(3, clientes.getNumero_residencial());
            stmt.setString(4, clientes.getComplemento());
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    // MÉTODO LISTAR
    public List<Clientes> listarClientes() {
        List<Clientes> clientes = new ArrayList<>();
        // Comando SQL = SELECT * FROM Clientes ORDER BY nome"
        String sql = "SELECT * FROM clientes ORDER BY nome";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Clientes cliente = new Clientes();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNumero_residencial(rs.getString("numero_residencial"));
                cliente.setComplemento(rs.getString("complemento"));
                clientes.add(cliente);
            }
            stmt.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return clientes;
    }

    public void pesquisarClientes() {

    }

    // MÉTODO ALTERAR
    public void alterarClientes() {

    }

    // MÉTODO EXCLUIR
    public void excluirClientes() {

    }
}
