package FranguinhoDaOnda.model;

public class Pedido {

    private int numero;
    private double preco_final;
    private String situacao;

    public Pedido(int numero, double preco_final, String situacao) {
        this.numero = numero;
        this.preco_final = preco_final;
        this.situacao = situacao;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
