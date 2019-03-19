package FranguinhoDaOnda.view;

import FranguinhoDaOnda.Cartoes;
import FranguinhoDaOnda.Clientes;
import FranguinhoDaOnda.Enderecos;
import FranguinhoDaOnda.Telefones;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel C. A. Rangel
 */
public class CadastroClientes extends javax.swing.JFrame {

    List<Clientes> clientes = new ArrayList<>();
    Enderecos end;
    Telefones tel;
    Clientes cl1;
    Cartoes cart1;

    public CadastroClientes() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage("src/images/icon.png");
        setIconImage(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroClientes = new javax.swing.JPanel();
        Cadastro = new javax.swing.JLabel();
        clPesquisar = new javax.swing.JLabel();
        clPesquisarText = new javax.swing.JTextField();
        clBtProcurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clCpf = new javax.swing.JLabel();
        clCpfText = new javax.swing.JTextField();
        clNome = new javax.swing.JLabel();
        clNomeText = new javax.swing.JTextField();
        clTelefone = new javax.swing.JLabel();
        clTelefoneText = new javax.swing.JTextField();
        clCep = new javax.swing.JLabel();
        clCepText = new javax.swing.JTextField();
        clRua = new javax.swing.JLabel();
        clRuaText = new javax.swing.JTextField();
        clNumero = new javax.swing.JLabel();
        clNumeroText = new javax.swing.JTextField();
        clBairro = new javax.swing.JLabel();
        clBairroText = new javax.swing.JTextField();
        clComplemento = new javax.swing.JLabel();
        clComplementoText = new javax.swing.JTextField();
        clbtInserir = new javax.swing.JButton();
        clBtAlterar = new javax.swing.JButton();
        clBtExcluir = new javax.swing.JButton();
        cartNumero = new javax.swing.JLabel();
        cartNumeroText = new javax.swing.JTextField();
        cartBandeira = new javax.swing.JLabel();
        cartBandeiraText = new javax.swing.JTextField();
        cartValidade = new javax.swing.JLabel();
        cartValidadeText = new javax.swing.JTextField();
        cartCredeb = new javax.swing.JLabel();
        cartCbDebcred = new javax.swing.JComboBox<>();

        setResizable(false);

        CadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Cadastro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Cadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cadastro.setText("Cadastro de Clientes");
        Cadastro.setToolTipText("");
        Cadastro.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        clPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clPesquisar.setText("Pesquisar:");

        clPesquisarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clPesquisarTextActionPerformed(evt);
            }
        });

        clBtProcurar.setText("Procurar");
        clBtProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clBtProcurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clBtProcurarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        clCpf.setText("CPF:");
        clCpf.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        clCpfText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clCpfTextActionPerformed(evt);
            }
        });

        clNome.setText("Nome:");
        clNome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        clTelefone.setText("Telefone:");

        clCep.setText("CEP:");

        clRua.setText("Rua:");

        clRuaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clRuaTextActionPerformed(evt);
            }
        });

        clNumero.setText("Numero:");

        clBairro.setText("Bairro:");

        clBairroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clBairroTextActionPerformed(evt);
            }
        });

        clComplemento.setText("Complemento:");

        clbtInserir.setText("Inserir");
        clbtInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clbtInserirMouseClicked(evt);
            }
        });

        clBtAlterar.setText("Alterar");
        clBtAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clBtAlterarMouseClicked(evt);
            }
        });

        clBtExcluir.setText("Excluir");

        cartNumero.setText("Numero:");

        cartNumeroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartNumeroTextActionPerformed(evt);
            }
        });

        cartBandeira.setText("Bandeira:");

        cartValidade.setText("Validade:");

        cartCredeb.setText("Tipo:");

        cartCbDebcred.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cartCbDebcred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartCbDebcredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroClientesLayout = new javax.swing.GroupLayout(CadastroClientes);
        CadastroClientes.setLayout(CadastroClientesLayout);
        CadastroClientesLayout.setHorizontalGroup(
            CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addComponent(cartNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartNumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartBandeira)
                            .addComponent(cartValidade)
                            .addComponent(cartCredeb))
                        .addGap(44, 44, Short.MAX_VALUE)
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cartCbDebcred, 0, 600, Short.MAX_VALUE)
                            .addComponent(cartBandeiraText)
                            .addComponent(cartValidadeText)))
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroClientesLayout.createSequentialGroup()
                                .addComponent(clPesquisar)
                                .addGap(38, 38, 38)
                                .addComponent(clPesquisarText, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clBtProcurar))
                            .addGroup(CadastroClientesLayout.createSequentialGroup()
                                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clCpf)
                                    .addComponent(clNome)
                                    .addComponent(clTelefone)
                                    .addComponent(clCep)
                                    .addComponent(clRua, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clNumero))
                                .addGap(44, 44, 44)
                                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(clRuaText)
                                    .addComponent(clCepText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clTelefoneText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clNomeText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clCpfText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clNumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CadastroClientesLayout.createSequentialGroup()
                                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clComplemento)
                                    .addComponent(clBairro))
                                .addGap(22, 22, 22)
                                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clBairroText)
                                    .addComponent(clComplementoText, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clbtInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clBtAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clBtExcluir)
                .addContainerGap())
        );
        CadastroClientesLayout.setVerticalGroup(
            CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clPesquisarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clPesquisar)
                    .addComponent(clBtProcurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clCpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clTelefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clCepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clRuaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clNumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clBairroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clComplemento)
                    .addComponent(clComplementoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartNumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartNumero))
                .addGap(12, 12, 12)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartBandeira)
                    .addComponent(cartBandeiraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartValidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartValidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartCbDebcred, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartCredeb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clBtExcluir)
                    .addComponent(clBtAlterar)
                    .addComponent(clbtInserir))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(0, 0, 729, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void cartCbDebcredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartCbDebcredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartCbDebcredActionPerformed

    private void cartNumeroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartNumeroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartNumeroTextActionPerformed

    private void clBtAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clBtAlterarMouseClicked
        // ALTERAR USUÁRIO
        //  if (clientes.contains(cl1)) {
        // cl1.clCepText.().getCep("");
        // }
    }//GEN-LAST:event_clBtAlterarMouseClicked

    private void clbtInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clbtInserirMouseClicked
        // VERIFICAR SE LACUNAS ESTÃO PREENCHIDAS
        if (clCepText.getText().equals("") || clRuaText.getText().equals("") || clBairroText.getText().equals("") || clTelefone.getText().equals("")
                || clCpfText.getText().equals("") || clNomeText.getText().equals("") || clNumeroText.getText().equals("") || clComplementoText.getText().equals("")
                || cartNumeroText.getText().equals("") || cartBandeiraText.getText().equals("") || cartValidadeText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            // ADICIONAR CLIENTE
            end = new Enderecos(clCepText.getText(), clRuaText.getText(), clBairroText.getText());
            tel = new Telefones(clTelefone.getText());
            cl1 = new Clientes(clCpfText.getText(), clNomeText.getText(), clNumeroText.getText(), clComplementoText.getText(), end, tel);
            cart1 = new Cartoes(cartNumeroText.getText(), cartBandeiraText.getText(), cartValidadeText.getText());
            clientes.add(cl1);
            JOptionPane.showMessageDialog(null, "Cliente adicionado.");
        }
    }//GEN-LAST:event_clbtInserirMouseClicked

    private void clBairroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clBairroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clBairroTextActionPerformed

    private void clRuaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clRuaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clRuaTextActionPerformed

    private void clCpfTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clCpfTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clCpfTextActionPerformed

    private void clBtProcurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clBtProcurarMouseClicked
        // RECEBER DADOS DIGITADOS

        //String prc = clPesquisarText.getText();
        // if (clPesquisarText.contains(cl1.getNome(""))) {
        //  } else {
        //    JOptionPane.showMessageDialog(null, "Usuário não existe no sistema.");
        // }
    }//GEN-LAST:event_clBtProcurarMouseClicked

    private void clPesquisarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clPesquisarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clPesquisarTextActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastro;
    private javax.swing.JPanel CadastroClientes;
    private javax.swing.JLabel cartBandeira;
    private javax.swing.JTextField cartBandeiraText;
    private javax.swing.JComboBox<String> cartCbDebcred;
    private javax.swing.JLabel cartCredeb;
    private javax.swing.JLabel cartNumero;
    private javax.swing.JTextField cartNumeroText;
    private javax.swing.JLabel cartValidade;
    private javax.swing.JTextField cartValidadeText;
    private javax.swing.JLabel clBairro;
    private javax.swing.JTextField clBairroText;
    private javax.swing.JButton clBtAlterar;
    private javax.swing.JButton clBtExcluir;
    private javax.swing.JButton clBtProcurar;
    private javax.swing.JLabel clCep;
    private javax.swing.JTextField clCepText;
    private javax.swing.JLabel clComplemento;
    private javax.swing.JTextField clComplementoText;
    private javax.swing.JLabel clCpf;
    private javax.swing.JTextField clCpfText;
    private javax.swing.JLabel clNome;
    private javax.swing.JTextField clNomeText;
    private javax.swing.JLabel clNumero;
    private javax.swing.JTextField clNumeroText;
    private javax.swing.JLabel clPesquisar;
    private javax.swing.JTextField clPesquisarText;
    private javax.swing.JLabel clRua;
    private javax.swing.JTextField clRuaText;
    private javax.swing.JLabel clTelefone;
    private javax.swing.JTextField clTelefoneText;
    private javax.swing.JButton clbtInserir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
