package FranguinhoDaOnda.view;

import FranguinhoDaOnda.model.Motoboy;
import FranguinhoDaOnda.dao.MotoboyDAO;
import FranguinhoDaOnda.model.MotoboyTableModel;
import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Gabriel C. A. Rangel
 */
public class CadastroMotoboys extends javax.swing.JInternalFrame {

    private MotoboyTableModel motoboyTableModel;

    public CadastroMotoboys() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage("src/images/icon.png");
        setarCaracteristicasTabela();
        //setIconImage(img);
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
        motCpfText = new javax.swing.JFormattedTextField();
        motNome = new javax.swing.JLabel();
        motNomeText = new javax.swing.JTextField();
        motPlaca = new javax.swing.JLabel();
        motPlacaText = new javax.swing.JFormattedTextField();
        motTelefone = new javax.swing.JLabel();
        motTelefoneText = new javax.swing.JFormattedTextField();
        motBtLimpar = new javax.swing.JButton();
        motBtExcluir = new javax.swing.JButton();
        motBtAlterar = new javax.swing.JButton();
        motBtInserir = new javax.swing.JButton();

        CadastroMotoboys.setBackground(new java.awt.Color(255, 255, 255));

        motCadastrar.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        motCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motCadastrar.setText("Cadastro de Motoboys");
        motCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        motPesquisar.setText("Pesquisar:");

        motBtPesquisar.setText("Pesquisar");
        motBtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motBtPesquisarActionPerformed(evt);
            }
        });

        motTbPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        motTbPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motTbPesquisarMouseClicked(evt);
            }
        });
        motSpPesquiar.setViewportView(motTbPesquisar);

        motCpf.setText("CPF:");

        try {
            motCpfText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        motNome.setText("Nome:");

        motPlaca.setText("Placa:");

        try {
            motPlacaText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("???-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        motTelefone.setText("Telefone:");

        try {
            motTelefoneText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        motBtLimpar.setText("Limpar");
        motBtLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motBtLimparMouseClicked(evt);
            }
        });

        motBtExcluir.setText("Excluir");
        motBtExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motBtExcluirMouseClicked(evt);
            }
        });

        motBtAlterar.setText("Alterar");
        motBtAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motBtAlterarMouseClicked(evt);
            }
        });

        motBtInserir.setText("Inserir");
        motBtInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motBtInserirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CadastroMotoboysLayout = new javax.swing.GroupLayout(CadastroMotoboys);
        CadastroMotoboys.setLayout(CadastroMotoboysLayout);
        CadastroMotoboysLayout.setHorizontalGroup(
            CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroMotoboysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CadastroMotoboysLayout.createSequentialGroup()
                        .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motCpf)
                            .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(motPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(motNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(motTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroMotoboysLayout.createSequentialGroup()
                                .addComponent(motPesquisarText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motBtPesquisar))
                            .addComponent(motNomeText, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(motSpPesquiar, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroMotoboysLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(motBtLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motBtExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motBtAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motBtInserir))
                            .addComponent(motCpfText)
                            .addComponent(motTelefoneText)
                            .addComponent(motPlacaText))))
                .addContainerGap())
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
                    .addComponent(motCpf)
                    .addComponent(motCpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motPlaca)
                    .addComponent(motPlacaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motTelefone)
                    .addComponent(motTelefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroMotoboysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motBtExcluir)
                    .addComponent(motBtAlterar)
                    .addComponent(motBtInserir)
                    .addComponent(motBtLimpar))
                .addContainerGap(21, Short.MAX_VALUE))
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

        setBounds(0, 0, 715, 472);
    }// </editor-fold>//GEN-END:initComponents

    private void motBtInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motBtInserirMouseClicked
        // INSERIR MOTOBOY
        // VERIFICAR SE AS LACUNAS ESTÃO PREENCHIDAS
        if (motCpfText.getText().equals("") || motNomeText.getText().equals("") || motPlacaText.getText().equals("") || motTelefoneText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            //INSERIR MOTOBOYS
            MotoboyDAO motdao = new MotoboyDAO();
            boolean resultado = motdao.verificarCPF(motCpfText.getText());
            boolean cpfcheck = motdao.checarCPF(motCpfText.getText());
            //VERIFICA SE CPF JÁ EXISTE NO BANCO DE DADOS
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "CPF inserido já foi cadastrado.");
            } else if (cpfcheck == false) {
                JOptionPane.showMessageDialog(null, "CPF inválido.");
            } else {
                //COLETAR DADOS DO MOTOBOY
                Motoboy mot = new Motoboy();
                mot.setPlaca(motPlacaText.getText());
                mot.setNome(motNomeText.getText());
                mot.setCpf(motCpfText.getText());
                mot.setNumero(motTelefoneText.getText());
                //INSERIR DADOS DO MOTOBOY
                motdao.inserirMotoboy(mot);
                // INFORMAR INSERÇÃO DE DADOS
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                // LIMPAR AS LACUNAS
                motPlacaText.setText("");
                motNomeText.setText("");
                motCpfText.setText("");
                motTelefoneText.setText("");
            }
        }
    }//GEN-LAST:event_motBtInserirMouseClicked
    private void setarCaracteristicasTabela() {
        //seleção para a linha inteira
        this.motTbPesquisar.setCellSelectionEnabled(false);
        this.motTbPesquisar.setRowSelectionAllowed(true);
        //selecionar apenas uma linha
        this.motTbPesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    private void motBtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motBtPesquisarActionPerformed
        MotoboyDAO motoboyDAO = new MotoboyDAO();
        ArrayList<Motoboy> motoboys = motoboyDAO.getlistByNome(motPesquisarText.getText().trim());
        motoboyTableModel = new MotoboyTableModel(motoboys);
        motTbPesquisar.setModel(motoboyTableModel);
    }//GEN-LAST:event_motBtPesquisarActionPerformed

    private void motBtAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motBtAlterarMouseClicked
        // ALTERAR MOTOBOY
        // VERIFICAR SE AS LACUNAS ESTÃO PREENCHIDAS
        if (motCpfText.getText().equals("") || motNomeText.getText().equals("") || motPlacaText.getText().equals("") || motTelefoneText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            //COLETAR DADOS DO MOTOBOY
            Motoboy mot = new Motoboy();
            mot.setPlaca(motPlacaText.getText());
            mot.setNome(motNomeText.getText());
            mot.setCpf(motCpfText.getText());
            mot.setNumero(motTelefoneText.getText());
            // ALTERAR DADOS DO MOTOBOY
            MotoboyDAO motdao = new MotoboyDAO();
            motdao.alterarMotoboy(mot);
            // INFORMAR A MUDANÇA DE DADOS
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        }
    }//GEN-LAST:event_motBtAlterarMouseClicked

    private void motBtExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motBtExcluirMouseClicked
        // EXCLUIR MOTOBOY
        // VERIFICAR SE AS LACUNAS ESTÃO PREENCHIDAS
        if (motCpfText.getText().equals("") || motNomeText.getText().equals("") || motPlacaText.getText().equals("") || motTelefoneText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            //COLETAR DADOS DO MOTOBOY
            Motoboy mot = new Motoboy();
            mot.setPlaca(motPlacaText.getText());
            mot.setNome(motNomeText.getText());
            mot.setCpf(motCpfText.getText());
            mot.setNumero(motTelefoneText.getText());
            // EXCLUIR DADOS DO MOTOBOY
            MotoboyDAO motdao = new MotoboyDAO();
            motdao.excluirMotoboy(mot);
            // INFORMAR EXCLUSÃO DE DADOS
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        }
    }//GEN-LAST:event_motBtExcluirMouseClicked

    private void motTbPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motTbPesquisarMouseClicked
        // PESQUISAR MOTOBOY
        int linha = motTbPesquisar.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Necessário selecionar um registro para editar.");
        } else {
            //BUSCAR DADOS DA LINHA SELECIONADA
            Motoboy motoboy1 = motoboyTableModel.getMotoboy(linha);
            //CARREGAR A JANELA DE EXIBIÇÃO
            motCpfText.setText(motoboy1.getCpf());
            motNomeText.setText(motoboy1.getNome());
            motPlacaText.setText(motoboy1.getPlaca());
            motTelefoneText.setText(motoboy1.getNumero());
            motCpfText.setEnabled(false);
        }
    }//GEN-LAST:event_motTbPesquisarMouseClicked

    private void motBtLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motBtLimparMouseClicked
        // LIMPA A TELA DE CADASTRO
        motCpfText.setText("");
        motNomeText.setText("");
        motPlacaText.setText("");
        motTelefoneText.setText("");
        motCpfText.setEnabled(true);
    }//GEN-LAST:event_motBtLimparMouseClicked

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
    private javax.swing.JButton motBtLimpar;
    private javax.swing.JButton motBtPesquisar;
    private javax.swing.JLabel motCadastrar;
    private javax.swing.JLabel motCpf;
    private javax.swing.JFormattedTextField motCpfText;
    private javax.swing.JLabel motNome;
    private javax.swing.JTextField motNomeText;
    private javax.swing.JLabel motPesquisar;
    private javax.swing.JTextField motPesquisarText;
    private javax.swing.JLabel motPlaca;
    private javax.swing.JFormattedTextField motPlacaText;
    private javax.swing.JScrollPane motSpPesquiar;
    private javax.swing.JTable motTbPesquisar;
    private javax.swing.JLabel motTelefone;
    private javax.swing.JFormattedTextField motTelefoneText;
    // End of variables declaration//GEN-END:variables
}
