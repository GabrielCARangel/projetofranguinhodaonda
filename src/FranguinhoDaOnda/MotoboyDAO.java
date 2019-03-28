package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

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
    public void listarMotoboys() {

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
