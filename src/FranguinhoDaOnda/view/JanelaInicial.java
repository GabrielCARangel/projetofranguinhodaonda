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

    CadastroClientes cc = new CadastroClientes();
    CadastroMotoboys cm = new CadastroMotoboys();
    CadastroProdutos cp = new CadastroProdutos();

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

        Desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MICadastrarClientes = new javax.swing.JMenuItem();
        MICadastrarMotoboys = new javax.swing.JMenuItem();
        MICadastrarProdutos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 84)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Franguino da Onda!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(300, 300, 300))
        );

        Desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastrar...");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        MICadastrarClientes.setText("Clientes");
        MICadastrarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MICadastrarClientesMouseClicked(evt);
            }
        });
        MICadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICadastrarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(MICadastrarClientes);

        MICadastrarMotoboys.setText("Motoboys");
        MICadastrarMotoboys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICadastrarMotoboysActionPerformed(evt);
            }
        });
        jMenu1.add(MICadastrarMotoboys);

        MICadastrarProdutos.setText("Produtos");
        MICadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICadastrarProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(MICadastrarProdutos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MICadastrarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MICadastrarClientesMouseClicked

    }//GEN-LAST:event_MICadastrarClientesMouseClicked
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        /*InternalTeste internalteste = new InternalTeste();
Desktop.add(internalteste);
internalteste.setVisible(true);*/
    }//GEN-LAST:event_jMenu1MouseClicked

    private void MICadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICadastrarClientesActionPerformed
        Desktop.add(cc);
        if (cm.isVisible() || cp.isVisible()) {
            cm.setVisible(false);
            cp.setVisible(false);
        }
        Desktop.setSize(716, 573);
        cc.setVisible(true);
    }//GEN-LAST:event_MICadastrarClientesActionPerformed

    private void MICadastrarMotoboysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICadastrarMotoboysActionPerformed
        Desktop.add(cm);
        if (cc.isVisible() || cp.isVisible()) {
            cc.setVisible(false);
            cp.setVisible(false);
        }
        Desktop.size();
        cm.setVisible(true);
    }//GEN-LAST:event_MICadastrarMotoboysActionPerformed

    private void MICadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICadastrarProdutosActionPerformed
        Desktop.add(cp);
        if (cc.isVisible() || cm.isVisible()) {
            cc.setVisible(false);
            cm.setVisible(false);
        }
        Desktop.size();
        cp.setVisible(true);
    }//GEN-LAST:event_MICadastrarProdutosActionPerformed

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
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem MICadastrarClientes;
    private javax.swing.JMenuItem MICadastrarMotoboys;
    private javax.swing.JMenuItem MICadastrarProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
