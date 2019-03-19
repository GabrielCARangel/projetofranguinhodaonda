package FranguinhoDaOnda.view;

import FranguinhoDaOnda.Motoboys;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel C. A. Rangel
 */
public class CadastroMotoboys extends javax.swing.JFrame {

    List<Motoboys> motoboys = new ArrayList<>();
    Motoboys mot, mot1;

    public CadastroMotoboys() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage("src/images/icon.png");
        setIconImage(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroMotoboys = new javax.swing.JPanel();
        motCadastrar = new javax.swing.JLabel();
        motPesquisar = new javax.swing.JLabel();
        motPesquisarText = new javax.swing.JTextField();
        motBtPesquisar = new javax.swing.JButton();
        motSpPesquiar = new javax.swing.JScrollPane();
        motTbPesquisar = new javax.swing.JTable();
        motCpf = new javax.swing.JLabel();
        motCpfText = new javax.swing.JTextField();
        motNome = new javax.swing.JLabel();
        motNomeText = new javax.swing.JTextField();
        motPlaca = new javax.swing.JLabel();
        motPlacaText = new javax.swing.JTextField();
        motTelefone = new javax.swing.JLabel();
        motTelefoneText = new javax.swing.JTextField();
        motBtInserir = new javax.swing.JButton();
        motBtAlterar = new javax.swing.JButton();
        motBtExcluir = new javax.swing.JButton();

        setResizable(false);

        motCadastrar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        motCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motCadastrar.setText("Cadastro de Motoboys");
        motCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        motPesquisar.setText("Pesquisar:");

        motPesquisarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motPesquisarTextActionPerformed(evt);
            }
        });

        motBtPesquisar.setText("Pesquisar");

        motTbPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Placa", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        motSpPesquiar.setViewportView(motTbPesquisar);
        if (motTbPesquisar.getColumnModel().getColumnCount() > 0) {
            motTbPesquisar.getColumnModel().getColumn(0).setResizable(false);
            motTbPesquisar.getColumnModel().getColumn(1).setResizable(false);
            motTbPesquisar.getColumnModel().getColumn(2).setResizable(false);
            motTbPesquisar.getColumnModel().getColumn(3).setResizable(false);
        }

        motCpf.setText("CPF:");

        motNome.setText("Nome:");

        motPlaca.setText("Placa:");

        motTelefone.setText("Telefone:");

        motBtInserir.setText("Inserir");
        motBtInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motBtInserirMouseClicked(evt);
            }
        });

        motBtAlterar.setText("Alterar");

        motBtExcluir.setText("Excluir");

        javax.swing.GroupLayout CadastroMotoboysLayout = new javax.swing.GroupLayout(CadastroMotoboys);
        CadastroMotoboys.setLayout(CadastroMotoboysLayout);
        CadastroMotoboysLayout.setHorizontalGroup(
            CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroMotoboysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroMotoboysLayout.createSequentialGroup()
                        .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(motPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(motNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(motTelefone))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CadastroMotoboysLayout.createSequentialGroup()
                        .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CadastroMotoboysLayout.createSequentialGroup()
                                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(motPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(motCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroMotoboysLayout.createSequentialGroup()
                                        .addComponent(motPesquisarText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(motBtPesquisar))
                                    .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(motNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(motCpfText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(motSpPesquiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                                        .addComponent(motPlacaText, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(motTelefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(CadastroMotoboysLayout.createSequentialGroup()
                                            .addComponent(motBtInserir)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(motBtAlterar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(motBtExcluir))))))
                        .addContainerGap())))
        );
        CadastroMotoboysLayout.setVerticalGroup(
            CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroMotoboysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(motCadastrar)
                .addGap(18, 18, 18)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motPesquisarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motPesquisar)
                    .addComponent(motBtPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motSpPesquiar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motCpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motPlacaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motTelefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motBtExcluir)
                    .addComponent(motBtAlterar)
                    .addComponent(motBtInserir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroMotoboys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroMotoboys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 721, 472);
    }// </editor-fold>//GEN-END:initComponents

    private void motBtInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motBtInserirMouseClicked
        // VERIFICAR SE AS LACUNAS ESTÃO PREENCHIDAS
        if (motCpfText.getText().equals("") || motNomeText.getText().equals("") || motPlacaText.getText().equals("") || motTelefoneText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            // ADICIONAR MOTOBOY
            mot = new Motoboys(motCpfText.getText(), motPlacaText.getText(), motTelefoneText.getText(), motNomeText.getText());
            motoboys.add(mot1);
            JOptionPane.showMessageDialog(null, "Motoboy adicionado.");
        }
    }//GEN-LAST:event_motBtInserirMouseClicked

    private void motPesquisarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motPesquisarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motPesquisarTextActionPerformed

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
    private javax.swing.JPanel CadastroMotoboys;
    private javax.swing.JButton motBtAlterar;
    private javax.swing.JButton motBtExcluir;
    private javax.swing.JButton motBtInserir;
    private javax.swing.JButton motBtPesquisar;
    private javax.swing.JLabel motCadastrar;
    private javax.swing.JLabel motCpf;
    private javax.swing.JTextField motCpfText;
    private javax.swing.JLabel motNome;
    private javax.swing.JTextField motNomeText;
    private javax.swing.JLabel motPesquisar;
    private javax.swing.JTextField motPesquisarText;
    private javax.swing.JLabel motPlaca;
    private javax.swing.JTextField motPlacaText;
    private javax.swing.JScrollPane motSpPesquiar;
    private javax.swing.JTable motTbPesquisar;
    private javax.swing.JLabel motTelefone;
    private javax.swing.JTextField motTelefoneText;
    // End of variables declaration//GEN-END:variables
}
