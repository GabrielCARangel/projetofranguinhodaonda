package FranguinhoDaOnda;

public class Clientes {

    private String cpf, nome, numero_residencial, complemento, Enderecos_cep;
    Enderecos end;
    Telefones tel;

    public void cadastrarCliente() {

    }

    public void ValidarCpf() {

    }

    public Clientes(String cpf, String nome, String numero_residencial, String complemento, Enderecos end, Telefones tel) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero_residencial = numero_residencial;
        this.complemento = complemento;
        this.end = end;
        this.tel = tel;
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

    public String getEnderecos_cep() {
        return Enderecos_cep;
    }

    public void setEnderecos_cep(String Enderecos_cep) {
        this.Enderecos_cep = Enderecos_cep;
    }

    public Enderecos getEnd() {
        return end;
    }

    public void setEnd(Enderecos end) {
        this.end = end;
    }

    public Telefones getTel() {
        return tel;
    }

    public void setTel(Telefones tel) {
        this.tel = tel;
    }

}
