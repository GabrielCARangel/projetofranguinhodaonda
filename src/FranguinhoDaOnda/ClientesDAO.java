package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

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
        String sql = "INSERT INTO Clientes(cpf,nome,numero_residencial,complemento,Enderecos_cep,Cartao_numero,Usuarios_login) "
                + "VALUES(?,?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientes.getCpf());
            stmt.setString(2, clientes.getNome());
            stmt.setString(3, clientes.getNumero_residencial());
            stmt.setString(4, clientes.getComplemento());
            stmt.setString(5, clientes.getEnderecos_cep());
            stmt.setString(6, clientes.getCartao_numero());
            stmt.setString(7, clientes.getUsuarios_login());
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    // MÉTODO LISTAR
    public void listarProdutos() {
        //String sql = "SELECT cpf,nome,cep FROM Clientes WHERE codigo > / ORDER BY codigo";
        //PreparedStatement stmt;
        // MÉTODO PESQUSIAR
    }

    public void pesquisarProdutos() {

    }

    // MÉTODO ALTERAR
    public void alterarProdutos() {

    }

    // MÉTODO EXCLUIR
    public void excluirProdutos() {

    }
}
