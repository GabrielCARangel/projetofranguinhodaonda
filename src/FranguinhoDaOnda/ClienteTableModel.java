package FranguinhoDaOnda;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {

    private ArrayList<Cliente> clientes;
    
    public ClienteTableModel(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    @Override
    public int getRowCount() {
        return clientes.size();
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0: return cliente.getCpf();
            case 1: return cliente.getNome();
            case 2: return cliente.getTel().getNumero();
            default: return "";
        }   
    }   
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0: return "CPF";
            case 1: return "Nome";
            case 2: return "Telefone";
            default: return "";
        }
    }
    public Cliente getCliente(int i){
        return this.clientes.get(i);
    }   
    public void atualizaTabela(){
        fireTableDataChanged();
    }  
}
