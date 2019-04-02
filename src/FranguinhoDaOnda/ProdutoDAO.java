package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public ProdutoDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirProduto(Produto produtos) {
        // Comando SQL = INTER INTO produtos (codigo, nome, preco)
        //               VALUES (?, ?, ?)
        String sql = "INSERT INTO Produtos(codigo,nome,preco) "
                + "VALUES(?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, (int) produtos.getCodigo());
            stmt.setString(2, produtos.getNome());
            stmt.setDouble(3, (double) produtos.getPreco());
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    // MÉTODO LISTAR
    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        // Comando SQL = SELECT * FROM Produtos ORDER BY nome"
        String sql = "SELECT * FROM Produtos ORDER BY nome";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Produto prd = new Produto();
            while (rs.next()) {
                prd.setCodigo(Integer.parseInt(rs.getString("codigo")));
                prd.setNome(rs.getString("nome"));
                prd.setPreco(Double.parseDouble(rs.getString("preco")));
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

        return produtos;

    }

    // MÉTODO PESQUSIAR
    public void pesquisarProdutos() {

    }

    // MÉTODO ALTERAR
    public void alterarProdutos() {

    }

    // MÉTODO EXCLUIR
    public void excluirProdutos() {

    }

}
