package FranguinhoDaOnda.view;

import FranguinhoDaOnda.model.Produto;
import FranguinhoDaOnda.dao.ProdutoDAO;
import FranguinhoDaOnda.model.ProdutoTableModel;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Gabriel C. A. Rangel
 */
public class CadastroProdutos extends javax.swing.JInternalFrame {

    private ProdutoTableModel produtoTableModel;
    private Produto produto1;

    public CadastroProdutos() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage("src/images/icon.png");
        setarCaracteristicasTabela();
        //setIconImage(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroProdutos = new javax.swing.JPanel();
        prdCadastrar = new javax.swing.JLabel();
        prdPesquisar = new javax.swing.JLabel();
        prdPesquisarText = new javax.swing.JTextField();
        prdBtPesquisar = new javax.swing.JButton();
        prdScPesquisar = new javax.swing.JScrollPane();
        prdTbPesquisar = new javax.swing.JTable();
        prdNome = new javax.swing.JLabel();
        prdNomeText = new javax.swing.JTextField();
        prdPreco = new javax.swing.JLabel();
        prdPrecoText = new javax.swing.JTextField();
        prdPreco1 = new javax.swing.JLabel();
        prdDescricaoText = new javax.swing.JTextField();
        prdBtLimpar = new javax.swing.JButton();
        prdBtExcluir = new javax.swing.JButton();
        prdBtAlterar = new javax.swing.JButton();
        prdBtInserir = new javax.swing.JButton();

        CadastroProdutos.setBackground(new java.awt.Color(255, 255, 255));

        prdCadastrar.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        prdCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prdCadastrar.setText("Cadastro de Produtos");

        prdPesquisar.setText("Pesquisar:");

        prdBtPesquisar.setText("Pesquisar");
        prdBtPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdBtPesquisarMouseClicked(evt);
            }
        });

        prdTbPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        prdTbPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdTbPesquisarMouseClicked(evt);
            }
        });
        prdScPesquisar.setViewportView(prdTbPesquisar);

        prdNome.setText("Nome:");

        prdPreco.setText("Preço:");

        prdPreco1.setText("Descrição:");

        prdBtLimpar.setText("Limpar");
        prdBtLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdBtLimparMouseClicked(evt);
            }
        });

        prdBtExcluir.setText("Excluir");
        prdBtExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdBtExcluirMouseClicked(evt);
            }
        });

        prdBtAlterar.setText("Alterar");
        prdBtAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdBtAlterarMouseClicked(evt);
            }
        });

        prdBtInserir.setText("Inserir");
        prdBtInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdBtInserirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CadastroProdutosLayout = new javax.swing.GroupLayout(CadastroProdutos);
        CadastroProdutos.setLayout(CadastroProdutosLayout);
        CadastroProdutosLayout.setHorizontalGroup(
            CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prdCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroProdutosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(prdBtLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prdBtExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prdBtAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prdBtInserir))
                    .addGroup(CadastroProdutosLayout.createSequentialGroup()
                        .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(prdNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prdPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(prdPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prdPreco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prdNomeText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prdPrecoText)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroProdutosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(CadastroProdutosLayout.createSequentialGroup()
                                        .addComponent(prdPesquisarText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prdBtPesquisar))
                                    .addComponent(prdScPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(prdDescricaoText))))
                .addContainerGap())
        );
        CadastroProdutosLayout.setVerticalGroup(
            CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prdCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdPesquisarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdBtPesquisar)
                    .addComponent(prdPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prdScPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdPrecoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdDescricaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdPreco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdBtInserir)
                    .addComponent(prdBtAlterar)
                    .addComponent(prdBtExcluir)
                    .addComponent(prdBtLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 712, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void prdBtInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdBtInserirMouseClicked
        // INSERIR PRODUTO
        // VERIFICAR SE AS LACUNAS ESTÃO PREENCHIDAS
        if (prdNomeText.getText().equals("") || prdPrecoText.getText().equals("") || prdDescricaoText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            // COLETAR DADOS DO PRODUTO
            Produto prd = new Produto();
            prd.setNome(prdNomeText.getText());
            prd.setPreco(Double.parseDouble(prdPrecoText.getText()));
            prd.setDescricao(prdDescricaoText.getText());
            // INSERIR DADOS DO PRODUTO
            ProdutoDAO prddao = new ProdutoDAO();
            prddao.inserirProduto(prd);
            // INFORMAR INSERÇÂO DE DADOS
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        }
    }//GEN-LAST:event_prdBtInserirMouseClicked
    private void setarCaracteristicasTabela() {
        //seleção para a linha inteira
        this.prdTbPesquisar.setCellSelectionEnabled(false);
        this.prdTbPesquisar.setRowSelectionAllowed(true);
        //selecionar apenas uma linha
        this.prdTbPesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    private void prdBtPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdBtPesquisarMouseClicked
        // PESQUISAR PRODUTO
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> produtos = produtoDAO.getlistByNome(prdPesquisarText.getText().trim());
        produtoTableModel = new ProdutoTableModel(produtos);
        prdTbPesquisar.setModel(produtoTableModel);
    }//GEN-LAST:event_prdBtPesquisarMouseClicked

    private void prdBtAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdBtAlterarMouseClicked
        // ALTERAR PRODUTOS
        // VERIFICAR SE AS LACUNAS ESTÃO PREENCHIDAS
        if (prdNomeText.getText().equals("") || prdPrecoText.getText().equals("") || prdDescricaoText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            // COLETAR DADOS DO PRODUTO
            Produto prd = new Produto();
            prd.setCodigo(produto1.getCodigo());
            prd.setNome(prdNomeText.getText());
            prd.setPreco(Double.parseDouble(prdPrecoText.getText()));
            prd.setDescricao(prdDescricaoText.getText());
            // ALTERAR DADOS DO PRODUTO
            ProdutoDAO prddao = new ProdutoDAO();
            prddao.alterarProduto(prd);
            // INFORMAR A MUDANÇA DE DADOS
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        }
    }//GEN-LAST:event_prdBtAlterarMouseClicked

    private void prdBtExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdBtExcluirMouseClicked
        // EXCLUIR PRODUTOS
        // VERIFICAR SE AS LACUNAS ESTÃO PREENCHIDAS
        if (prdNomeText.getText().equals("") || prdPrecoText.getText().equals("") || prdDescricaoText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            // EXCLUIR DADOS DO PRODUTO
            ProdutoDAO prddao = new ProdutoDAO();
            prddao.excluirProduto(produto1);
            // INFORMAR A EXCLUSÃO DE DADOS
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        }
    }//GEN-LAST:event_prdBtExcluirMouseClicked

    private void prdTbPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdTbPesquisarMouseClicked
        int linha = prdTbPesquisar.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Necessário selecionar um registro para editar.");
        } else {
            //BUSCAR DADOS DA LINHA SELECIONADA
            produto1 = produtoTableModel.getProduto(linha);
            //CARREGAR A JANELA DE EXIBIÇÃO
            prdNomeText.setText(produto1.getNome());
            prdPrecoText.setText(String.valueOf(produto1.getPreco()));
            prdDescricaoText.setText(produto1.getDescricao());
        }
    }//GEN-LAST:event_prdTbPesquisarMouseClicked

    private void prdBtLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdBtLimparMouseClicked
        // LIMPAR TELA DE CADASTRO
        prdNomeText.setText("");
        prdPrecoText.setText("");
        prdDescricaoText.setText("");
    }//GEN-LAST:event_prdBtLimparMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroProdutos;
    private javax.swing.JButton prdBtAlterar;
    private javax.swing.JButton prdBtExcluir;
    private javax.swing.JButton prdBtInserir;
    private javax.swing.JButton prdBtLimpar;
    private javax.swing.JButton prdBtPesquisar;
    private javax.swing.JLabel prdCadastrar;
    private javax.swing.JTextField prdDescricaoText;
    private javax.swing.JLabel prdNome;
    private javax.swing.JTextField prdNomeText;
    private javax.swing.JLabel prdPesquisar;
    private javax.swing.JTextField prdPesquisarText;
    private javax.swing.JLabel prdPreco;
    private javax.swing.JLabel prdPreco1;
    private javax.swing.JTextField prdPrecoText;
    private javax.swing.JScrollPane prdScPesquisar;
    private javax.swing.JTable prdTbPesquisar;
    // End of variables declaration//GEN-END:variables
}
