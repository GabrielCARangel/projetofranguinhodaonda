/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FranguinhoDaOnda.view;

import FranguinhoDaOnda.dao.PedidoDAO;
import FranguinhoDaOnda.model.Pedido;
import FranguinhoDaOnda.model.PedidoTableModel;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author sala302b
 */
public class Pedidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pedidos
     */
    private PedidoTableModel pedidoTableModel;
    
    public Pedidos() {
        initComponents();
        setarCaracteristicasTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // PREPARAR TABELAS

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        Pedido = new javax.swing.JLabel();
        pePesquisar = new javax.swing.JLabel();
        pePesquisarText = new javax.swing.JTextField();
        peBtPesquisar = new javax.swing.JButton();
        peSP = new javax.swing.JScrollPane();
        peJT = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        Pedido.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        Pedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pedido.setText("Pedidos");

        pePesquisar.setText("Pesquisar:");

        peBtPesquisar.setText("Pesquisar");
        peBtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peBtPesquisarActionPerformed(evt);
            }
        });

        peJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        peSP.setViewportView(peJT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pePesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pePesquisarText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peBtPesquisar))
                            .addComponent(peSP, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pedido)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pePesquisarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peBtPesquisar)
                    .addComponent(pePesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peSP, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setarCaracteristicasTabela() {
        //seleção para a linha inteira
        this.peJT.setCellSelectionEnabled(false);
        this.peJT.setRowSelectionAllowed(true);
        //selecionar apenas uma linha
        this.peJT.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    private void peBtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peBtPesquisarActionPerformed
        // PESQUISAR PEDIDOS
        PedidoDAO pedidodao = new PedidoDAO();
        // Terminar!
        ArrayList<Pedido> pedidos = pedidodao.getlist();
        pedidoTableModel = new PedidoTableModel(pedidos);
        peJT.setModel(pedidoTableModel);
    }//GEN-LAST:event_peBtPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pedido;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton peBtPesquisar;
    private javax.swing.JTable peJT;
    private javax.swing.JLabel pePesquisar;
    private javax.swing.JTextField pePesquisarText;
    private javax.swing.JScrollPane peSP;
    // End of variables declaration//GEN-END:variables
}
