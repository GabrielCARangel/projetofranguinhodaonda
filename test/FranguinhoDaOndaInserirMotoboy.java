
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
public class FranguinhoDaOndaInserirMotoboy {

    @Test
    public void testInserirMotoboy() {

        /* ==================== Montagem do cenário ==================== */
        // Criar MotoboyDAO:
        MotoboyDAO motdao = new MotoboyDAO();
        // Criar Motoboy:
        Motoboy mot = new Motoboy("1", "João", "1", "1");
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
    
}