package FranguinhoDaOnda;

import FranguinhoDaOnda.view.Login;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProjetoIntegrador {

    public static void main(String[] args) {

        Connection c;
        c = ConnectionFactory.getConnection();
        Login janela = new Login();
        janela.setVisible(true);

        // Coletar clientes
        ClientesDAO clientesDAO = new ClientesDAO();
        List<Clientes> clientes = new ArrayList<>();
        clientes = clientesDAO.listarClientes();

        //Exibir lista clientes
        for (int i = 0; i < clientes.size(); i++) {
            Clientes cliente = new Clientes();
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());

        }
        Clientes cliente = new Clientes();
        cliente.setNome("José");
        cliente.setCpf("123456789");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
    }
}
