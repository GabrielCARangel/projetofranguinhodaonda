package FranguinhoDaOnda.dao;

import FranguinhoDaOnda.model.Motoboy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class MotoboyDAO {

    private Connection conexao;

    // MÉTODO CONSTRUTOR
    public MotoboyDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirMotoboy(Motoboy motoboys) {
        boolean resultado = false;
        String sql = "INSERT INTO motoboys(placa,nome,cpf,numero) "
                + "VALUES(?,?,?,?)";
        PreparedStatement stmt;
        try {
            if (conexao.isClosed()) {
                conexao = ConnectionFactory.getConnection();
            }
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, motoboys.getPlaca());
            stmt.setString(2, motoboys.getNome());
            stmt.setString(3, motoboys.getCpf());
            stmt.setString(4, motoboys.getNumero());
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
    public ArrayList<Motoboy> getlist() {
        ArrayList<Motoboy> arrayMotoboys = new ArrayList<>();
        // Comando SQL = SELECT * FROM Motoboys ORDER BY nome"
        String sql = "SELECT * FROM motoboys ORDER BY nome";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Motoboy motoboy = new Motoboy();
                motoboy.setCpf(rs.getString("cpf"));
                motoboy.setNome(rs.getString("nome"));
                motoboy.setPlaca(rs.getString("placa"));
                motoboy.setNumero(rs.getString("numero"));
                arrayMotoboys.add(motoboy);
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
        return arrayMotoboys;
    }

    public ArrayList<Motoboy> getlistByNome(String nome) {
        nome = "%" + nome.trim() + "%";
        ArrayList<Motoboy> arrayMotoboys = new ArrayList<>();
        String sql = "SELECT * FROM motoboys WHERE nome LIKE ? ORDER BY nome";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Motoboy motoboy = new Motoboy();
                motoboy.setCpf(rs.getString("cpf"));
                motoboy.setNome(rs.getString("nome"));
                motoboy.setPlaca(rs.getString("placa"));
                motoboy.setNumero(rs.getString("numero"));
                arrayMotoboys.add(motoboy);
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
        return arrayMotoboys;
    }

    // MÉTODO ALTERAR
    public boolean alterarMotoboy(Motoboy motoboy) {
        boolean resultado = false;
        String sql = "UPDATE motoboys SET cpf = ?, nome = ?, placa = ?, numero = ? WHERE cpf = ?";
        try {
            if (conexao.isClosed()) {
                conexao = ConnectionFactory.getConnection();
            }
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, motoboy.getCpf());
            stmt.setString(2, motoboy.getNome());
            stmt.setString(3, motoboy.getPlaca());
            stmt.setString(4, motoboy.getNumero());
            stmt.setString(5, motoboy.getCpf());
            stmt.executeUpdate();
            System.out.println("TESTE DAO");
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
    public boolean excluirMotoboy(Motoboy motoboy) {
        boolean resultado = false;
        String sql = "DELETE FROM motoboys WHERE cpf = ?";
        try {
            if (conexao.isClosed()) {
                conexao = ConnectionFactory.getConnection();
            }
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, motoboy.getCpf());
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

    public boolean verificarCPF(String cpf) {

        boolean resultado = false;
        String sql = "SELECT cpf FROM franguinho_da_onda.motoboys WHERE cpf = ?";
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
    public boolean checarCPF(String cpf) {
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
