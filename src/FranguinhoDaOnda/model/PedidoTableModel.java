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
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido pedido = pedidos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pedido.getNumero();
            case 1:
                return pedido.getPreco_final();
            case 2:
                return pedido.getFormapagamento();
            case 3:
                return pedido.getSituacao();
            case 4:
                return pedido.mot.getPlaca();
            case 5:
                return pedido.nf.getNnf();
            case 6:
                return pedido.cl.getCpf();
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
                return "Preço Final";
            case 2:
                return "Forma do Pagamento";
            case 3:
                return "Situação";
            case 4:
                return "Placa do Motoby";
            case 5:
                return "Nota Fiscal";
            case 6:
                return "CPF";
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
