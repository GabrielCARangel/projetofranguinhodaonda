package FranguinhoDaOnda.model;

public class ItemDePedido {
    
    private long codigo;
    private int quantidade;
    Produto prd;
    Pedido pe;

    public ItemDePedido(long codigo, int quantidade, Produto prd, Pedido pe) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.prd = prd;
        this.pe = pe;
    }

    public ItemDePedido() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getPrd() {
        return prd;
    }

    public void setPrd(Produto prd) {
        this.prd = prd;
    }

    public Pedido getPe() {
        return pe;
    }

    public void setPe(Pedido pe) {
        this.pe = pe;
    }
    
}
