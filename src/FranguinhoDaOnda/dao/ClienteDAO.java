package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Cliente;
import FranguinhoDaOnda.model.Endereco;
import FranguinhoDaOnda.model.Telefone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        String sql = "INSERT INTO Clientes(cpf,nome,numero_residencial,complemento,Enderecos_cep) "
                + "VALUES(?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            if (conexao.isClosed()) {
                conexao = ConnectionFactory.getConnection();
            }
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

    // MÉTODO ALTERAR
    public boolean alterarCliente(Cliente cliente) {
        boolean resultado = false;
        String sql = "UPDATE clientes SET cpf = ?, nome = ?, numero_residencial = ?, complemento = ? WHERE cpf = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getNumero_residencial());
            stmt.setString(4, cliente.getComplemento());
            stmt.setString(5, cliente.getCpf());
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

    public boolean verificarCPF(String cpf) {

        boolean resultado = false;
        String sql = "SELECT cpf FROM franguinho_da_onda.clientes WHERE cpf = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                resultado = true;
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
        return resultado;
    }
    
    // Validar CPF
    public boolean checkCPF(String cpf) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000")
                || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0         
                // (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
}
