package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    private Connection conexao;

    // MÉTODO CONSTRUTOR
    public ProdutoDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirProduto(Produto produto) {
        boolean resultado = false;
        String sql = "INSERT INTO produtos(codigo,nome,preco,descricao) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, produto.getCodigo());
            stmt.setString(2, produto.getNome());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getDescricao());
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

    // MÉTODO LISTAR
    public ArrayList<Produto> getlist() {
        ArrayList<Produto> arrayProdutos = new ArrayList<>();
        // Comando SQL = SELECT * FROM Produtos ORDER BY nome"
        String sql = "SELECT * FROM produtos ORDER BY nome";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(rs.getString("codigo")));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(Double.parseDouble(rs.getString("preco")));
                produto.setDescricao(rs.getString("descricao"));
                arrayProdutos.add(produto);
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
        return arrayProdutos;
    }

    public ArrayList<Produto> getlistByNome(String nome) {
        nome = "%" + nome.trim() + "%";
        ArrayList<Produto> arrayProdutos = new ArrayList<>();
        String sql = "SELECT * FROM produtos WHERE nome LIKE ? ORDER BY nome";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(rs.getString("codigo")));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(Double.parseDouble(rs.getString("preco")));
                produto.setDescricao(rs.getString("descricao"));
                arrayProdutos.add(produto);
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
        return arrayProdutos;
    }

    // MÉTODO ALTERAR
    public boolean alterarProduto(Produto produto) {
        boolean resultado = false;
        String sql = "UPDATE produtos SET nome = ?, preco = ?, descricao = ? WHERE codigo = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setString(3, produto.getDescricao());
            stmt.setInt(4, produto.getCodigo());
            stmt.executeUpdate();
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

    // MÉTODO EXCLUIR
    public boolean excluirProduto(Produto produto) {
        boolean resultado = false;
        String sql = "DELETE FROM produtos WHERE codigo = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, (int) produto.getCodigo());
            stmt.executeUpdate();
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
