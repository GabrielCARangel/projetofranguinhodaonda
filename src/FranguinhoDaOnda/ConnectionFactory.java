package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public static Connection getConnection() {
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost/franguinho_da_onda";
            String user = "root";
            String pass = "123456";
            conexao = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "'Erro ao conectar ao tentar conexão '"
                    + ex.getMessage());
        }
        return conexao;

    }
}
