package FranguinhoDaOnda.view;

import FranguinhoDaOnda.dao.CartaoDAO;
import FranguinhoDaOnda.dao.ClienteDAO;
import FranguinhoDaOnda.model.Cliente;
import FranguinhoDaOnda.model.ClienteTableModel;
import FranguinhoDaOnda.model.Endereco;
import FranguinhoDaOnda.dao.EnderecoDAO;
import FranguinhoDaOnda.model.Telefone;
import FranguinhoDaOnda.dao.TelefoneDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Gabriel C. A. Rangel
 */
public class CadastroClientes extends javax.swing.JInternalFrame {

    private ClienteTableModel clienteTableModel;

    public CadastroClientes() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage("src/images/icon.png");
        setarCaracteristicasTabela();
        //setIconImage(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroClientes = new javax.swing.JPanel();
        Cadastro = new javax.swing.JLabel();
        clPesquisar = new javax.swing.JLabel();
        clPesquisarText = new javax.swing.JTextField();
        clBtProcurar = new javax.swing.JButton();
        clSP = new javax.swing.JScrollPane();
        clJT = new javax.swing.JTable();
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

        CadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Cadastro.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        Cadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cadastro.setText("Cadastro de Clientes");
        Cadastro.setToolTipText("");
        Cadastro.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        clPesquisar.setText("Pesquisar:");

        clBtProcurar.setText("Procurar");
        clBtProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clBtProcurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clBtProcurarMouseClicked(evt);
            }
        });

        clJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        clJT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clJTMouseClicked(evt);
            }
        });
        clSP.setViewportView(clJT);

        clCpf.setText("CPF:");
        clCpf.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        clNome.setText("Nome:");
        clNome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        clTelefone.setText("Telefone:");

        clTelefoneText.setToolTipText("");

        clCep.setText("CEP:");

        clRua.setText("Rua:");

        clNumero.setText("Numero:");

        clBairro.setText("Bairro:");

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
        clBtExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clBtExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CadastroClientesLayout = new javax.swing.GroupLayout(CadastroClientes);
        CadastroClientes.setLayout(CadastroClientesLayout);
        CadastroClientesLayout.setHorizontalGroup(
            CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CadastroClientesLayout.createSequentialGroup()
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(clRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(clCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(clBairro)
                            .addComponent(clComplemento)
                            .addComponent(clPesquisar))
                        .addGap(15, 15, 15)
                        .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroClientesLayout.createSequentialGroup()
                                .addComponent(clPesquisarText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clBtProcurar))
                            .addComponent(clRuaText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clCepText)
                            .addComponent(clTelefoneText)
                            .addComponent(clNomeText)
                            .addComponent(clCpfText)
                            .addComponent(clSP, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addComponent(clNumeroText)
                            .addComponent(clBairroText)
                            .addComponent(clComplementoText)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clBtExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clBtAlterar)
                        .addGap(7, 7, 7)
                        .addComponent(clbtInserir)))
                .addGap(11, 11, 11))
        );
        CadastroClientesLayout.setVerticalGroup(
            CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clBtProcurar)
                    .addComponent(clPesquisar)
                    .addComponent(clPesquisarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clSP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(clBairro)
                    .addComponent(clBairroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clComplemento)
                    .addComponent(clComplementoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clBtExcluir)
                    .addComponent(clBtAlterar)
                    .addComponent(clbtInserir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 729, 487);
    }// </editor-fold>//GEN-END:initComponents

    private void clBtAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clBtAlterarMouseClicked
        // ALTERAR CLIENTES
        // VERIFICAR SE LACUNAS ESTÃO PREENCHIDAS
        if (clCepText.getText().equals("") || clRuaText.getText().equals("") || clBairroText.getText().equals("") || clTelefone.getText().equals("")
                || clCpfText.getText().equals("") || clNomeText.getText().equals("") || clNumeroText.getText().equals("") || clComplementoText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            // ALTERAR CLIENTE
            // COLETAR DADOS DO CLIENTE
            Cliente cl = new Cliente();
            cl.setCpf(clCpfText.getText());
            cl.setNome(clNomeText.getText());
            cl.setNumero_residencial(clNumeroText.getText());
            cl.setComplemento(clComplementoText.getText());
            // COLETAR TELEFONE
            Telefone tel = new Telefone();
            tel.setNumero(clTelefoneText.getText());
            cl.setTel(tel);
            // COLETAR ENDERECO
            Endereco end = new Endereco();
            end.setCep(clCepText.getText());
            end.setRua(clRuaText.getText());
            end.setBairro(clBairroText.getText());
            cl.setEnd(end);
            //MUDAR DADOS DO CLIENTE
            EnderecoDAO enddao = new EnderecoDAO();
            ClienteDAO cldao = new ClienteDAO();
            TelefoneDAO teldao = new TelefoneDAO();
            enddao.alterarEndereco(end);
            cldao.alterarCliente(cl);
            teldao.alterarTelefone(cl);
            // INFORMAR A MUDANÇA DE DADOS
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        }
    }//GEN-LAST:event_clBtAlterarMouseClicked
    private void clbtInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clbtInserirMouseClicked
        // INSERIR CLIENTE
        // VERIFICAR SE LACUNAS ESTÃO PREENCHIDAS
        if (clCepText.getText().equals("") || clRuaText.getText().equals("") || clBairroText.getText().equals("") || clTelefone.getText().equals("")
                || clCpfText.getText().equals("") || clNomeText.getText().equals("") || clNumeroText.getText().equals("") || clComplementoText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            // INSERIR CLIENTE
            // COLETAR DADOS DO CLIENTE
            Cliente cl = new Cliente();
            cl.setCpf(clCpfText.getText());
            cl.setNome(clNomeText.getText());
            cl.setNumero_residencial(clNumeroText.getText());
            cl.setComplemento(clComplementoText.getText());
            // COLETAR TELEFONE
            Telefone tel = new Telefone();
            tel.setNumero(clTelefoneText.getText());
            cl.setTel(tel);
            // COLETAR ENDERECO
            Endereco end = new Endereco();
            end.setCep(clCepText.getText());
            end.setRua(clRuaText.getText());
            end.setBairro(clBairroText.getText());
            cl.setEnd(end);
            //INSERIR DADOS DO CLIENTE
            EnderecoDAO enddao = new EnderecoDAO();
            ClienteDAO cldao = new ClienteDAO();
            TelefoneDAO teldao = new TelefoneDAO();
            enddao.inserirEndereco(end);
            cldao.inserirCliente(cl);
            teldao.inserirTelefone(cl);
            // INFORMAR INSERÇÂO DE DADOS
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        }
    }//GEN-LAST:event_clbtInserirMouseClicked
    // PREPARAR TABELAS

    private void setarCaracteristicasTabela() {
        //seleção para a linha inteira
        this.clJT.setCellSelectionEnabled(false);
        this.clJT.setRowSelectionAllowed(true);
        //selecionar apenas uma linha
        this.clJT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    private void clBtProcurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clBtProcurarMouseClicked
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.getlistByNome(clPesquisarText.getText().trim());
        clienteTableModel = new ClienteTableModel(clientes);
        clJT.setModel(clienteTableModel);
    }//GEN-LAST:event_clBtProcurarMouseClicked
    private void clBtExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clBtExcluirMouseClicked
        // EXCLUIR CLIENTE
        // VERIFICAR SE LACUNAS ESTÃO PREENCHIDAS
        if (clCepText.getText().equals("") || clRuaText.getText().equals("") || clBairroText.getText().equals("") || clTelefone.getText().equals("")
                || clCpfText.getText().equals("") || clNomeText.getText().equals("") || clNumeroText.getText().equals("") || clComplementoText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todas as lacunas.");
        } else {
            // COLETAR DADOS DO CLIENTE
            Cliente cl = new Cliente();
            cl.setCpf(clCpfText.getText());
            cl.setNome(clNomeText.getText());
            cl.setNumero_residencial(clNumeroText.getText());
            cl.setComplemento(clComplementoText.getText());
            // COLETAR TELEFONE
            Telefone tel = new Telefone();
            tel.setNumero(clTelefoneText.getText());
            cl.setTel(tel);
            // COLETAR ENDERECO
            Endereco end = new Endereco();
            end.setCep(clCepText.getText());
            end.setRua(clRuaText.getText());
            end.setBairro(clBairroText.getText());
            cl.setEnd(end);
            //EXCLUIR DADOS DO CLIENTE
            EnderecoDAO enddao = new EnderecoDAO();
            CartaoDAO cartdao = new CartaoDAO();
            ClienteDAO cldao = new ClienteDAO();
            TelefoneDAO teldao = new TelefoneDAO();
            enddao.excluirEndereco(end);
            cldao.excluirCliente(cl);
            teldao.excluirTelefone(cl);
            // INFORMAR EXCLUSÃO DE DADOS
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        }
    }//GEN-LAST:event_clBtExcluirMouseClicked

    private void clJTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clJTMouseClicked
        // PESQUISAR CLIENTES
        int linha = clJT.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Necessário selecionar um registro para editar.");
        } else {
            //BUSCAR DADOS DA LINHA SELECIONADA
            Cliente cliente1 = clienteTableModel.getCliente(linha);
            //CARREGAR A JANELA DE EXIBIÇÃO
            clCpfText.setText(cliente1.getCpf());
            clNomeText.setText(cliente1.getNome());
            clTelefoneText.setText(cliente1.getTel().getNumero());
            clCepText.setText(cliente1.getEnd().getCep());
            clRuaText.setText(cliente1.getEnd().getRua());
            clNumeroText.setText(cliente1.getNumero_residencial());
            clBairroText.setText(cliente1.getEnd().getBairro());
            clComplementoText.setText(cliente1.getComplemento());
        }
    }//GEN-LAST:event_clJTMouseClicked

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
    private javax.swing.JTable clJT;
    private javax.swing.JLabel clNome;
    private javax.swing.JTextField clNomeText;
    private javax.swing.JLabel clNumero;
    private javax.swing.JTextField clNumeroText;
    private javax.swing.JLabel clPesquisar;
    private javax.swing.JTextField clPesquisarText;
    private javax.swing.JLabel clRua;
    private javax.swing.JTextField clRuaText;
    private javax.swing.JScrollPane clSP;
    private javax.swing.JLabel clTelefone;
    private javax.swing.JTextField clTelefoneText;
    private javax.swing.JButton clbtInserir;
    // End of variables declaration//GEN-END:variables
}
