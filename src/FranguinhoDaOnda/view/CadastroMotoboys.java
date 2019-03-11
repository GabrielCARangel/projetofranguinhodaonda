/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FranguinhoDaOnda.view;

import FranguinhoDaOnda.Motoboys;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala302b
 */
public class CadastroMotoboys extends javax.swing.JFrame {
        List<Motoboys> motoboys = new ArrayList<>();
        Motoboys mot, mot1;

    /**
     * Creates new form CadastroMotoboys
     */
    public CadastroMotoboys() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastroMotoboys = new javax.swing.JPanel();
        motCadastroLabel = new javax.swing.JLabel();
        motCpfPanel = new javax.swing.JLabel();
        motCpfTextField = new javax.swing.JTextField();
        motNomeLabel = new javax.swing.JLabel();
        motNomeTextField = new javax.swing.JTextField();
        motPlacaLabel = new javax.swing.JLabel();
        motPlacaTextField = new javax.swing.JTextField();
        motTelefoneLabel = new javax.swing.JLabel();
        motTelefoneTextField = new javax.swing.JTextField();
        motCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(540, 290));
        setPreferredSize(new java.awt.Dimension(540, 290));
        setResizable(false);
        setSize(new java.awt.Dimension(540, 290));

        jPanelCadastroMotoboys.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelCadastroMotoboys.setPreferredSize(new java.awt.Dimension(520, 290));
        jPanelCadastroMotoboys.setRequestFocusEnabled(false);
        jPanelCadastroMotoboys.setVerifyInputWhenFocusTarget(false);

        motCadastroLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        motCadastroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motCadastroLabel.setText("Cadastro de Motoboys");

        motCpfPanel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        motCpfPanel.setText("CPF:");

        motCpfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motCpfTextFieldActionPerformed(evt);
            }
        });

        motNomeLabel.setText("Nome:");

        motNomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motNomeTextFieldActionPerformed(evt);
            }
        });

        motPlacaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        motPlacaLabel.setText("Placa:");

        motPlacaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motPlacaTextFieldActionPerformed(evt);
            }
        });

        motTelefoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        motTelefoneLabel.setText("Telefone:");

        motCadastrar.setText("Inserir");
        motCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroMotoboysLayout = new javax.swing.GroupLayout(jPanelCadastroMotoboys);
        jPanelCadastroMotoboys.setLayout(jPanelCadastroMotoboysLayout);
        jPanelCadastroMotoboysLayout.setHorizontalGroup(
            jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroMotoboysLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(motCadastroLabel)
                .addGap(90, 90, 90))
            .addGroup(jPanelCadastroMotoboysLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(motCadastrar)
                    .addGroup(jPanelCadastroMotoboysLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(motPlacaLabel)
                            .addComponent(motNomeLabel)
                            .addComponent(motTelefoneLabel)
                            .addComponent(motCpfPanel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(motPlacaTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(motNomeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                .addComponent(motCpfTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(motTelefoneTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        jPanelCadastroMotoboysLayout.setVerticalGroup(
            jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroMotoboysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(motCadastroLabel)
                .addGroup(jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroMotoboysLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(motCpfPanel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroMotoboysLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motNomeLabel)
                    .addComponent(motNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroMotoboysLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(motPlacaLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroMotoboysLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motPlacaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motTelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motTelefoneLabel))
                .addGap(18, 18, 18)
                .addComponent(motCadastrar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroMotoboys, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroMotoboys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void motPlacaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motPlacaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motPlacaTextFieldActionPerformed

    private void motCpfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motCpfTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motCpfTextFieldActionPerformed

    private void motCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motCadastrarMouseClicked
        // INSERIR MOTOBOYS
        mot = new Motoboys(motCpfTextField.getText(), motPlacaTextField.getText(), motTelefoneTextField.getText(), motNomeTextField.getText());
        motoboys.add(mot1);

    }//GEN-LAST:event_motCadastrarMouseClicked

    private void motNomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motNomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motNomeTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroMotoboys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMotoboys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMotoboys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMotoboys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMotoboys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelCadastroMotoboys;
    private javax.swing.JButton motCadastrar;
    private javax.swing.JLabel motCadastroLabel;
    private javax.swing.JLabel motCpfPanel;
    private javax.swing.JTextField motCpfTextField;
    private javax.swing.JLabel motNomeLabel;
    private javax.swing.JTextField motNomeTextField;
    private javax.swing.JLabel motPlacaLabel;
    private javax.swing.JTextField motPlacaTextField;
    private javax.swing.JLabel motTelefoneLabel;
    private javax.swing.JTextField motTelefoneTextField;
    // End of variables declaration//GEN-END:variables
}
