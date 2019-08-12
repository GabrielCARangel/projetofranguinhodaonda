
import FranguinhoDaOnda.dao.MotoboyDAO;
import FranguinhoDaOnda.model.Motoboy;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
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

    @Test
    public void testPesquisarMotoboy() {

        // Criar MotoboyDAO:
        MotoboyDAO motdao = new MotoboyDAO();
        // Chamar método de listagem:
        motdao.getlist();

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
        System.out.println(removerMot);
        /* ==================== FIM Execução ==================== */

        
        /* ==================== Verificação ==================== */
        // Verificar se motoboy foi inserido e removido com sucesso:
        assertThat(removerMot, is(true));
        /* ==================== FIM Verificação ==================== */

    }
    
}