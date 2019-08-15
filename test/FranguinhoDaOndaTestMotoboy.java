
import FranguinhoDaOnda.dao.MotoboyDAO;
import FranguinhoDaOnda.model.Motoboy;
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
public class FranguinhoDaOndaTestMotoboy {

    @After
    public void deletar(){
    MotoboyDAO motdao = new MotoboyDAO();    
    }
    
    @Test
    public void testPesquisarMotoboy() {
        
        /* ==================== Montagem do cenário ==================== */
        // Criar MotoboyDAO:
        MotoboyDAO motdao = new MotoboyDAO();
        /* ==================== FIM Montagem do cenário ==================== */
       
        
        /* ==================== Execução ==================== */
        // Chamar método de listagem:
        motdao.getlist();
        /* ==================== FIM Execução ==================== */
        
        
        /* ==================== Verificação ==================== */
        
        System.out.println();
        /* ==================== FIM Verificação ==================== */
        
    }
    

    @Test
    public void testInserirMotoboy() {

        /* ==================== Montagem do cenário ==================== */
        // Criar MotoboyDAO:
        MotoboyDAO motdao = new MotoboyDAO();
        // Criar Motoboy:
        Motoboy mot = new Motoboy("321", "João", "123", "123");
        /* ==================== FIM Montagem do cenário ==================== */

        
        /* ==================== Execução ==================== */
        // Chamar método de inserção:
        boolean inserirMot = motdao.inserirMotoboy(mot);
        /* ==================== FIM Execução ==================== */

        
        /* ==================== Verificação ==================== */
        // Verificar se motoboy foi inserido com sucesso:
        assertThat(inserirMot, is(true));
        /* ==================== FIM Verificação ==================== */

    }


    @Test
    public void testRemoverMotoboy() {

        /* ==================== Montagem do cenário ==================== */
        // Criar Motoboy:
        Motoboy mot = new Motoboy("456", "Maria", "456", "456");
        // Criar MotoboyDAO:
        MotoboyDAO motdao = new MotoboyDAO();
        /* ==================== FIM Montagem do cenário ==================== */

        
        /* ==================== Execução ==================== */
        // Chamar método de inserção:
        motdao.inserirMotoboy(mot);        
        // Chamar método de remoção:
        boolean removerMot = motdao.excluirMotoboy(mot);
        /* ==================== FIM Execução ==================== */

        
        /* ==================== Verificação ==================== */
        // Verificar se motoboy foi inserido e removido com sucesso:
        assertThat(removerMot, is(true));
        /* ==================== FIM Verificação ==================== */

    }
    
    @Test
    public void testAlterarMotoboy() {

        /* ==================== Montagem do cenário ==================== */
        // Criar Motoboy:
        Motoboy mot = new Motoboy("101112", "Luiza", "101112", "101112");
        // Criar MotoboyDAO:
        MotoboyDAO motdao = new MotoboyDAO();
        /* ==================== FIM Montagem do cenário ==================== */

        
        /* ==================== Execução ==================== */    
        // Inserir motoboy no banco de dados:
        boolean inserirMot = motdao.inserirMotoboy(mot);
        // Alterar os dados do motoboy:
        mot.setPlaca("789");
        mot.setNome("Mariana");
        mot.setCpf("789");
        mot.setNumero("789");
        // Chamar método de alterar:
        boolean alterarMot = motdao.alterarMotoboy(mot);
        /* ==================== FIM Execução ==================== */

        
        /* ==================== Verificação ==================== */
        // Verificar se motoboy foi inserido com sucesso:
        assertThat(inserirMot, is(true));
        // Verificar se motoboy foi alterado com sucesso: 
        assertThat(alterarMot, is(true));
        /* ==================== FIM Verificação ==================== */

    }
    
}