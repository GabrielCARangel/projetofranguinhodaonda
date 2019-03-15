package FranguinhoDaOnda;

public class Cartoes {

    private String numero, nome, bandeira, validade;
    private int debcred;

    public void validarNumero() {

    }

    public Cartoes(String numero, String nome, String bandeira, String validade, int debcred) {
        this.numero = numero;
        this.nome = nome;
        this.bandeira = bandeira;
        this.validade = validade;
        this.debcred = debcred;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
