/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FranguinhoDaOnda.view;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Gabriel C. A. Rangel
 */
public class JanelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form JanelaInicial
     */
    public JanelaInicial() {
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

        JanelaInicial = new javax.swing.JPanel();
        jiBtCadastrarClientes = new javax.swing.JButton();
        jiBtCadastrarMotoboys = new javax.swing.JButton();
        jiBtCadastrarProdutos = new javax.swing.JButton();

        setTitle("JANELA PRINCIPAL");
        setResizable(false);

        jiBtCadastrarClientes.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jiBtCadastrarClientes.setText("Cadastrar Clientes");
        jiBtCadastrarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jiBtCadastrarClientesMouseClicked(evt);
            }
        });

        jiBtCadastrarMotoboys.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jiBtCadastrarMotoboys.setText("Cadastrar Motoboys");
        jiBtCadastrarMotoboys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jiBtCadastrarMotoboysMouseClicked(evt);
            }
        });
        jiBtCadastrarMotoboys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jiBtCadastrarMotoboysActionPerformed(evt);
            }
        });

        jiBtCadastrarProdutos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jiBtCadastrarProdutos.setText("Cadastrar Produtos");
        jiBtCadastrarProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jiBtCadastrarProdutosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JanelaInicialLayout = new javax.swing.GroupLayout(JanelaInicial);
        JanelaInicial.setLayout(JanelaInicialLayout);
        JanelaInicialLayout.setHorizontalGroup(
            JanelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JanelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JanelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jiBtCadastrarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jiBtCadastrarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jiBtCadastrarMotoboys, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        JanelaInicialLayout.setVerticalGroup(
            JanelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jiBtCadastrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jiBtCadastrarMotoboys, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jiBtCadastrarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JanelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jiBtCadastrarProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jiBtCadastrarProdutosMouseClicked
        // ABRE A JANELA DE CADASTRO DE PRODUTOS
        CadastroClientes janelaMotoboysCadastro = new CadastroClientes();
        janelaMotoboysCadastro.setVisible(true);
    }//GEN-LAST:event_jiBtCadastrarProdutosMouseClicked

    private void jiBtCadastrarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jiBtCadastrarClientesMouseClicked
        // ABRE A JANELA DE CADASTRO DE CLIENTES
        CadastroClientes janelaCadastroClientes = new CadastroClientes();
        janelaCadastroClientes.setVisible(true);
    }//GEN-LAST:event_jiBtCadastrarClientesMouseClicked

    private void jiBtCadastrarMotoboysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jiBtCadastrarMotoboysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jiBtCadastrarMotoboysActionPerformed

    private void jiBtCadastrarMotoboysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jiBtCadastrarMotoboysMouseClicked
        // ABRE A JANELA DE CADASTRO DE MOTOBOYS
        CadastroClientes janelaMotoboysCadastro = new CadastroClientes();
        janelaMotoboysCadastro.setVisible(true);
    }//GEN-LAST:event_jiBtCadastrarMotoboysMouseClicked

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
            java.util.logging.Logger.getLogger(JanelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JanelaInicial;
    private javax.swing.JButton jiBtCadastrarClientes;
    private javax.swing.JButton jiBtCadastrarMotoboys;
    private javax.swing.JButton jiBtCadastrarProdutos;
    // End of variables declaration//GEN-END:variables
}
