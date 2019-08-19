
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
public class FranguinhoDaOndaAlterarMotoboy {

    @Test
    public void testAlterarMotoboy() {

        /* ==================== Montagem do cenário ==================== */
        // Criar Motoboy:
        Motoboy mot = new Motoboy("2", "Nome Original", "2", "2");
        // Criar MotoboyDAO:
        MotoboyDAO motdao = new MotoboyDAO();
        /* ==================== FIM Montagem do cenário ==================== */

        
        /* ==================== Execução ==================== */    
        // Inserir motoboy no banco de dados:
        boolean inserirMot = motdao.inserirMotoboy(mot);
        // Alterar os dados do motoboy:
        mot.setPlaca("3");
        mot.setNome("Nome Alterado");
        mot.setCpf("3");
        mot.setNumero("3");
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