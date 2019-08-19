
import FranguinhoDaOnda.dao.ClienteDAO;
import FranguinhoDaOnda.dao.EnderecoDAO;
import FranguinhoDaOnda.dao.MotoboyDAO;
import FranguinhoDaOnda.dao.TelefoneDAO;
import FranguinhoDaOnda.model.Cliente;
import FranguinhoDaOnda.model.Endereco;
import FranguinhoDaOnda.model.Motoboy;
import FranguinhoDaOnda.model.Telefone;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sala302b
 */
public class FranguinhoDaOndaInserirCliente {
    
    @Test
    public void testInserirCliente() {

        /* ==================== Montagem do cenário ==================== */
        // Criar EnderecoDAO, ClienteDAO e TelefoneDAO:
        EnderecoDAO enddao = new EnderecoDAO();
        ClienteDAO cldao = new ClienteDAO();
        TelefoneDAO teldao = new TelefoneDAO();
        // Criar Motoboy:
        Endereco end = new Endereco();
        Cliente cl = new Cliente();
        Telefone tel = new Telefone();
        /* ==================== FIM Montagem do cenário ==================== */

        
        /* ==================== Execução ==================== */
        // Adiciona Cliente:
        cl.setCpf("123");
        cl.setNome("Nome Teste");
        cl.setNumero_residencial("123");
        cl.setComplemento("Perto dali");
        // Adiciona Endereço do Cliente:
        tel.setNumero("123");
        cl.setTel(tel);       
        // Adiciona Telefone do Cliente:
        end.setCep("123");
        end.setRua("Rua Tal");
        end.setBairro("Bairro Tal");
        cl.setEnd(end);     
        /* ==================== FIM Execução ==================== */
        // Insere endereço, cliente e telefone:
        boolean inserirEnd = enddao.inserirEndereco(end);
        boolean inserirCl = cldao.inserirCliente(cl);
        boolean inserirTel = teldao.inserirTelefone(cl);
        
        /* ==================== Verificação ==================== */
        // Verificar se cliente foi inserido com sucesso:
        assertThat(inserirEnd, is(true));
        assertThat(inserirCl, is(true));
        assertThat(inserirTel, is(true));
        /* ==================== FIM Verificação ==================== */

    }    
}