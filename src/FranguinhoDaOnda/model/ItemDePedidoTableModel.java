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
public class ItemDePedidoTableModel extends AbstractTableModel {

    private ArrayList<ItemDePedido> ItemDePedidos;

    public ItemDePedidoTableModel(ArrayList<ItemDePedido> ItemDePedidos) {
        this.ItemDePedidos = ItemDePedidos;
    }
    
    @Override
    public int getRowCount() {
        return ItemDePedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItemDePedido itemdepedido = ItemDePedidos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return itemdepedido.getCodigo();
            case 1:
                return itemdepedido.getQuantidade();
            case 2:
                return itemdepedido.pe.getNumero();
            case 3:
                return itemdepedido.prd.getCodigo();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Código";
            case 1:
                return "Quantidade";
            case 2:
                return "Número do Pedido";
            case 3:
                return "Código do Produto";
            default:
                return "";
        }
    }

    public ItemDePedido getItemDePedido(int i) {
        return this.ItemDePedidos.get(i);
    }

    public void atualizaTabela() {
        fireTableDataChanged();
    }
    

}
