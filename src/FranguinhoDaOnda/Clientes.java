package FranguinhoDaOnda;

public class Clientes {

    private String cpf, nome, numero_residencial, complemento, Enderecos_cep;

    public void cadastrarCliente() {

    }

    public void ValidarCpf() {

    }

    public Clientes(String cpf, String nome, String numero_residencial, String complemento) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero_residencial = numero_residencial;
        this.complemento = complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_residencial() {
        return numero_residencial;
    }

    public void setNumero_residencial(String numero_residencial) {
        this.numero_residencial = numero_residencial;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
