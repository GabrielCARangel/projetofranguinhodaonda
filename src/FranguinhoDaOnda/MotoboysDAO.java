package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class MotoboysDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public MotoboysDAO() {
        Connection conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirCliente(Motoboys motoboys) {
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
            java.util.logging.Logger.getLogger(MotoboysDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

}
