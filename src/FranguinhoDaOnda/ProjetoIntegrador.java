package FranguinhoDaOnda;

import FranguinhoDaOnda.view.Login;
import java.sql.Connection;


public class ProjetoIntegrador {

    public static void main(String[] args) {

        Connection c;
        c = ConnectionFactory.getcoConnection();
        Login janela = new Login();
        janela.setVisible(true);

    }
}
