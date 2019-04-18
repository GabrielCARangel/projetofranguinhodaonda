package FranguinhoDaOnda;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel {
    private ArrayList<Produto> produtos;
    public ProdutoTableModel(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    @Override
    public int getRowCount() {
        return produtos.size();
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        switch (columnIndex) {
            case 0: return produto.getCodigo();
            case 1: return produto.getNome();
            case 2: return produto.getPreco();
            default: return "";
        }   
    }   
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0: return "Codigo";
            case 1: return "Nome";
            case 2: return "Preco";
            default: return "";
        }
    }
    public Produto getProduto(int i){
        return this.produtos.get(i);
    }   
    public void atualizaTabela(){
        fireTableDataChanged();
    }  
}