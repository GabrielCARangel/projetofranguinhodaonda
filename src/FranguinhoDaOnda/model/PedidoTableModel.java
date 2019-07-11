/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FranguinhoDaOnda.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sala302b
 */
public class PedidoTableModel extends AbstractTableModel {
    
    private ArrayList<Pedido> pedidos;

    public PedidoTableModel(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public int getRowCount() {
        return pedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido pedido = pedidos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pedido.getNumero();
            case 1:
                return pedido.getIdp().getCodigo();
            case 2:
                return pedido.getIdp().prd.getCodigo();
            case 3:
                return pedido.getIdp().getQuantidade();
            case 4:
                return pedido.getPreco_final();
            case 5:
                return pedido.getFormapagamento();
            case 6:
                return pedido.getSituacao();
            case 7:
                return pedido.cl.getCpf();
            case 8:
                return pedido.mot.getPlaca();
            case 9:
                return pedido.nf.getNnf();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Número";
            case 1:
                return "Cód. Pedido";
            case 2:   
                return "Cód. Produto";
            case 3:
                return "Quantidade";
            case 4:
                return "Preço Final";
            case 5:
                return "Pagamento";
            case 6:
                return "Situação";
            case 7:
                return "CPF";
            case 8:
                return "Plc. do Motoboy";
            case 9:
                return "Nota Fiscal";
            default:
                return "";
        }
    }

    public Pedido getPedido(int i) {
        return this.pedidos.get(i);
    }

    public void atualizaTabela() {
        fireTableDataChanged();
    }
    
}
