package FranguinhoDaOnda;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class MotoboyTableModel extends AbstractTableModel {
      
    private ArrayList<Motoboy> motoboys;
    
    public MotoboyTableModel(ArrayList<Motoboy> motoboys) {
        this.motoboys = motoboys;
    }
    @Override
    public int getRowCount() {
        return motoboys.size();
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Motoboy motoboy = motoboys.get(rowIndex);
        switch (columnIndex) {
            case 0: return motoboy.getCpf();
            case 1: return motoboy.getNome();
            case 2: return motoboy.getPlaca();
            case 3: return motoboy.getNumero();
            default: return "";
        }   
    }   
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0: return "CPF";
            case 1: return "Nome";
            case 2: return "Placa";
            case 3: return "Telefone";
            default: return "";
        }
    }
    public Motoboy getMotoboy(int i){
        return this.motoboys.get(i);
    }   
    public void atualizaTabela(){
        fireTableDataChanged();
    }  
}