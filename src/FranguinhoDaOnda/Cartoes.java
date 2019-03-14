package FranguinhoDaOnda;

public class Cartoes {

    private String numero, nomecartao, codseguranca, validade;
    private int debcred;

    public void validarNumero() {

    }

    public Cartoes(String numero, String nomecartao, String codseguranca, String validade, int debcred) {
        this.numero = numero;
        this.nomecartao = nomecartao;
        this.codseguranca = codseguranca;
        this.validade = validade;
        this.debcred = debcred;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomecartao() {
        return nomecartao;
    }

    public void setNomecartao(String nomecartao) {
        this.nomecartao = nomecartao;
    }

    public String getCodseguranca() {
        return codseguranca;
    }

    public void setCodseguranca(String codseguranca) {
        this.codseguranca = codseguranca;
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
