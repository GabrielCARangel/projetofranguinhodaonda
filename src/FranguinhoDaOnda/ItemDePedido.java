package FranguinhoDaOnda;

public class ItemDePedido {

    private int pedidos_numero, produtos_codigo, quantidade;

    public ItemDePedido(int pedidos_numero, int produtos_codigo, int quantidade) {
        this.pedidos_numero = pedidos_numero;
        this.produtos_codigo = produtos_codigo;
        this.quantidade = quantidade;
    }

    public int getPedidos_numero() {
        return pedidos_numero;
    }

    public void setPedidos_numero(int pedidos_numero) {
        this.pedidos_numero = pedidos_numero;
    }

    public int getProdutos_codigo() {
        return produtos_codigo;
    }

    public void setProdutos_codigo(int produtos_codigo) {
        this.produtos_codigo = produtos_codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
