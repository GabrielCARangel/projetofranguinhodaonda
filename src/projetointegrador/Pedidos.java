package projetointegrador;

public class Pedidos {

    private int numero;
    private double preco_final;

    public void finalizarPedido() {

    }

    public void realizarPagamento() {

    }

    public Pedidos(int numero, double preco_final) {
        this.numero = numero;
        this.preco_final = preco_final;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPreco_final() {
        return preco_final;
    }

    public void setPreco_final(double preco_final) {
        this.preco_final = preco_final;
    }

}
