package FranguinhoDaOnda.model;

public class Pedido {

    private long numero;
    private double preco_final;
    private String situacao;
    private String formapagamento;
    Motoboy mot;
    Cliente cl;
    ItemDePedido idp;
    NotaFiscal nf;

    public Pedido(long numero, double preco_final, String situacao, String formapagamento, Motoboy mot, Cliente cl, ItemDePedido idp, NotaFiscal nf) {
        this.numero = numero;
        this.preco_final = preco_final;
        this.situacao = situacao;
        this.formapagamento = formapagamento;
        this.mot = mot;
        this.cl = cl;
        this.idp = idp;
        this.nf = nf;
    }

    public Pedido() {
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
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

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }

    public Motoboy getMot() {
        return mot;
    }

    public void setMot(Motoboy mot) {
        this.mot = mot;
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }

    public ItemDePedido getIdp() {
        return idp;
    }

    public void setIdp(ItemDePedido idp) {
        this.idp = idp;
    }

    public NotaFiscal getNf() {
        return nf;
    }

    public void setNf(NotaFiscal nf) {
        this.nf = nf;
    }

    
}
