package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Cliente;
import FranguinhoDaOnda.model.Endereco;
import FranguinhoDaOnda.model.Telefone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {

    private Connection conexao;

    // MÉTODO CONSTRUTOR
    public ClienteDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(Cliente cliente) {
        boolean resultado = false;
        String sql = "INSERT INTO Clientes(cpf,nome,numero_residencial,complemento,Enderecos_cep,Cartoes_numero) "
                + "VALUES(?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getNumero_residencial());
            stmt.setString(4, cliente.getComplemento());
            stmt.setString(5, cliente.getEnd().getCep());
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
    public ArrayList<Cliente> getlist() {
        ArrayList<Cliente> arrayClientes = new ArrayList<>();
        String sql = "SELECT cpf, nome, t.numero FROM franguinho_da_onda.clientes c\n"
                + "INNER JOIN Telefones t ON c.cpf = t.Clientes_cpf"
                + "SELECT * FROM Clientes WHERE nome LIKE ? ORDER BY nome";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                Telefone telefone = new Telefone();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                telefone.setNumero(rs.getString("numero"));
                cliente.setTel(telefone);
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

    public ArrayList<Cliente> getlistByNome(String nome) {
        nome = "%" + nome.trim() + "%";
        ArrayList<Cliente> arrayClientes = new ArrayList<>();
        String sql = "SELECT c.*, t.numero, e.*, car.* FROM franguinho_da_onda.clientes c\n"
                + "INNER JOIN Telefones t ON c.cpf = t.Clientes_cpf\n"
                + "INNER JOIN Enderecos e ON e.cep = c.Enderecos_cep\n"
                + "INNER JOIN Cartoes car ON car.numero = c.Cartoes_numero WHERE nome LIKE ?";
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

    // MÉTODO ALTERAR
    public boolean alterarCliente(Cliente cliente) {
        boolean resultado = false;
        String sql = "UPDATE clientes SET cpf = ?, nome = ?, numero_residencial = ?, complemento = ?, WHERE cpf = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getNumero_residencial());
            stmt.setString(4, cliente.getComplemento());
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

    // MÉTODO EXCLUIR
    public boolean excluirCliente(Cliente cliente) {
        boolean resultado = false;
        String sql = "DELETE FROM Clientes WHERE cpf = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
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
