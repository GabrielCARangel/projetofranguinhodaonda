package FranguinhoDaOnda;

import FranguinhoDaOnda.view.Login;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ProjetoIntegrador {

    public static void main(String[] args) {

        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());

            Login janela = new Login();
            janela.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {

            Login janela = new Login();
            janela.setVisible(true);

        }
    }
}
