
import FranguinhoDaOnda.dao.MotoboyDAO;
import FranguinhoDaOnda.dao.ProdutoDAO;
import FranguinhoDaOnda.model.Motoboy;
import FranguinhoDaOnda.model.Produto;
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
public class FranguinhoDaOndaAlterarProduto {

    @Test
    public void testAlterarProduto() {

        /* ==================== Montagem do cenário ==================== */
        // Criar Motoboy:
        Produto pdt = new Produto(1, "Produto Original", 10.0, "Descrição Original");
        // Criar MotoboyDAO:
        ProdutoDAO pdtdao = new ProdutoDAO();
        /* ==================== FIM Montagem do cenário ==================== */

        
        /* ==================== Execução ==================== */    
        // Inserir motoboy no banco de dados:
        boolean inserirPdt = pdtdao.alterarProduto(pdt);
        // Alterar os dados do motoboy:
        pdt.setCodigo(1);
        pdt.setNome("Produto Alterado");
        pdt.setPreco(15.0);
        pdt.setDescricao("Descrição Alterada");
        // Chamar método de alterar:
        boolean alterarPdt = pdtdao.alterarProduto(pdt);
        /* ==================== FIM Execução ==================== */

        
        /* ==================== Verificação ==================== */
        // Verificar se motoboy foi inserido com sucesso:
        assertThat(inserirPdt, is(true));
        // Verificar se motoboy foi alterado com sucesso: 
        assertThat(alterarPdt, is(true));
        /* ==================== FIM Verificação ==================== */

    }
    
}