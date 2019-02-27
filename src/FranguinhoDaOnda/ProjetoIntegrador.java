package FranguinhoDaOnda;

import FranguinhoDaOnda.view.Login;
import javax.swing.ImageIcon;

public class ProjetoIntegrador {

    public static void main(String[] args) {
        Login janela = new Login();
        ImageIcon img = new ImageIcon("./images/icon.png");
        janela.setIconImage(img.getImage());
        janela.setVisible(true);

    }
}
