
import FranguinhoDaOnda.dao.ProdutoDAO;
import FranguinhoDaOnda.model.Produto;
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
public class FranguinhoDaOndaInserirProduto {
    
    @Test
    public void testInserirProduto() {
        
        /* ==================== Montagem do cenário ==================== */
        // Criar MotoboyDAO:
        ProdutoDAO pdtdao = new ProdutoDAO();
        // Criar Motoboy:
        Produto pdt = new Produto(1, "Produto", 10.0, "Descrição do Produto");
        /* ==================== FIM Montagem do cenário ==================== */

        
        /* ==================== Execução ==================== */
        // Chamar método de inserção:
        boolean inserirPdt = pdtdao.inserirProduto(pdt);
        /* ==================== FIM Execução ==================== */

        
        /* ==================== Verificação ==================== */
        // Verificar se motoboy foi inserido com sucesso:
        assertThat(inserirPdt, is(true));
        /* ==================== FIM Verificação ==================== */

    }
}