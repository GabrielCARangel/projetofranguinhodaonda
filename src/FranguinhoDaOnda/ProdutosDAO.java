package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutosDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public ProdutosDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirProduto(Produtos produtos) {
        // Comando SQL = INTER INTO produtos (codigo, nome, preco)
        //               VALUES (?, ?, ?, ?)
        String sql = "INSERT INTO Produtos(codigo,nome,preco) "
                + "VALUES(?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, (int) produtos.getCodigo());
            stmt.setString(2, produtos.getNome());
            stmt.setDouble(3, (double) produtos.getPreco());
            status = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    // MÉTODO LISTAR
    public void listarProdutos() {

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
