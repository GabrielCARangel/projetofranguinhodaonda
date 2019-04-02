package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MotoboyDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public MotoboyDAO() {
        Connection conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirMotoboy(Motoboy motoboys) {
        String sql = "INSERT INTO Motoboys(placa,nome,cpf,numero) "
                + "VALUES(?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, motoboys.getPlaca());
            stmt.setString(2, motoboys.getNome());
            stmt.setString(3, motoboys.getCpf());
            stmt.setString(4, motoboys.getNumero());
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MotoboyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    // MÉTODO LISTAR
    public List<Motoboy> listarMotoboys() {
        List<Motoboy> motoboys = new ArrayList<>();
        // Comando SQL = SELECT * FROM Cliente ORDER BY nome"
        String sql = "SELECT * FROM Clientes ORDER BY nome";
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
                motoboys.add(motoboy);
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

        return motoboys;

    }

    // MÉTODO PESQUSIAR
    public void pesquisarMotoboys() {

    }

    // MÉTODO ALTERAR
    public void alterarMotoboys() {

    }

    // MÉTODO EXCLUIR
    public void excluirMotoboys() {

    }

}
