package FranguinhoDaOnda;

import FranguinhoDaOnda.view.Login;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
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
    } 
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        
         Login janela = new Login();
        janela.setVisible(true);
       
    }
       
        
        
        
        
       /* Connection c;
        c = ConnectionFactory.getConnection();
       

        // Coletar clientes
        ClienteDAO clientesDAO = new ClienteDAO();
        List<Cliente> clientes = new ArrayList<>();
        clientes = clientesDAO.listarClientes();

        //Exibir lista clientes
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = new Cliente();
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());

        }
        Cliente cliente = new Cliente();
        cliente.setNome("José");
        cliente.setCpf("123456789");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());*/
    }
}
