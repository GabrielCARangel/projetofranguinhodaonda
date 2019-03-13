package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public static Connection getcoConnection() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/franguinho_da_onda");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao tentar conexão"
                    + ex.getMessage());
        }
        return conexao;

    }
}
