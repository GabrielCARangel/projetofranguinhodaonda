package FranguinhoDaOnda.model;

public class Cartao {

    private String numero, bandeira, validade;
    private int debcred;

    public void validarNumero() {

    }

    public Cartao() {
    }

    public Cartao(String numero, String bandeira, String validade) {

        this.numero = numero;
        this.bandeira = bandeira;
        this.validade = validade;
    }

    public Cartao(int debcred) {
        this.debcred = debcred;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getDebcred() {
        return debcred;
    }

    public void setDebcred(int debcred) {
        this.debcred = debcred;
    }

}
