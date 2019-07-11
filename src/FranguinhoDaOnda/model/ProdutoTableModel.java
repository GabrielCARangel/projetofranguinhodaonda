package FranguinhoDaOnda.model;

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
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return produto.getNome();
            case 1:
                return produto.getPreco();
            case 2:
                return produto.getDescricao();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nome";
            case 1:
                return "Preco";
            case 2:
                return "Descrição";
            default:
                return "";
        }
    }

    public Produto getProduto(int i) {
        return this.produtos.get(i);
    }

    public void atualizaTabela() {
        fireTableDataChanged();
    }
}
