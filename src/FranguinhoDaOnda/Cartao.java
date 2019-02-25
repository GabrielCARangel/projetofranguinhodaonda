package FranguinhoDaOnda;

public class Cartao {

    private String numero, nomeCartao, codSeguranca, validade;

    public void validarNumero() {

    }

    public Cartao(String numero, String nomeCartao, String codSeguranca, String validade) {
        this.numero = numero;
        this.nomeCartao = nomeCartao;
        this.codSeguranca = codSeguranca;
        this.validade = validade;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

}
