/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FranguinhoDaOnda.view;
import FranguinhoDaOnda.Produtos;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel C. A. Rangel
 */
public class CadastroProdutos extends javax.swing.JFrame {
    List<Produtos> produtos = new ArrayList<>();
    Produtos prd, prd1;

    /**
     * Creates new form CadastroProdutos
     */
    public CadastroProdutos() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage("src/images/icon.png");
        setIconImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroProdutos = new javax.swing.JPanel();
        prdCadastrar = new javax.swing.JLabel();
        prdCodigo = new javax.swing.JLabel();
        prdCodigoText = new javax.swing.JTextField();
        prdNome = new javax.swing.JLabel();
        prdNomeText = new javax.swing.JTextField();
        prdPreco = new javax.swing.JLabel();
        prdPrecoText = new javax.swing.JTextField();
        prdBtInserir = new javax.swing.JButton();
        prdBtAlterar = new javax.swing.JButton();
        prdBtExcluir = new javax.swing.JButton();

        setTitle("CADASTRO DE PRODUTOS");
        setResizable(false);

        prdCadastrar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        prdCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prdCadastrar.setText("Cadastro de Produtos");

        prdCodigo.setText("Código:");

        prdNome.setText("Nome:");

        prdPreco.setText("Preço:");

        prdBtInserir.setText("Inserir");
        prdBtInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prdBtInserirMouseClicked(evt);
            }
        });

        prdBtAlterar.setText("Alterar");

        prdBtExcluir.setText("Excluir");

        javax.swing.GroupLayout CadastroProdutosLayout = new javax.swing.GroupLayout(CadastroProdutos);
        CadastroProdutos.setLayout(CadastroProdutosLayout);
        CadastroProdutosLayout.setHorizontalGroup(
            CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroProdutosLayout.createSequentialGroup()
                        .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prdCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(prdNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prdNomeText)
                            .addComponent(prdCodigoText)))
                    .addGroup(CadastroProdutosLayout.createSequentialGroup()
                        .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prdCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroProdutosLayout.createSequentialGroup()
                                .addComponent(prdPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prdPrecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroProdutosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(prdBtInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prdBtAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prdBtExcluir)))
                .addContainerGap())
        );
        CadastroProdutosLayout.setVerticalGroup(
            CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prdCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdCodigo)
                    .addComponent(prdCodigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdNome)
                    .addComponent(prdNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdPreco)
                    .addComponent(prdPrecoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prdBtExcluir)
                    .addComponent(prdBtAlterar)
                    .addComponent(prdBtInserir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prdBtInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prdBtInserirMouseClicked
        // INSERIR PRODUTOS
        prd = new Produtos(Integer.parseInt(prdCodigoText.getText()), prdNomeText.getText(), Double.parseDouble(prdPrecoText.getText()));
        produtos.add(prd1);
    }//GEN-LAST:event_prdBtInserirMouseClicked

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
    private javax.swing.JLabel prdCadastrar;
    private javax.swing.JLabel prdCodigo;
    private javax.swing.JTextField prdCodigoText;
    private javax.swing.JLabel prdNome;
    private javax.swing.JTextField prdNomeText;
    private javax.swing.JLabel prdPreco;
    private javax.swing.JTextField prdPrecoText;
    // End of variables declaration//GEN-END:variables
}
