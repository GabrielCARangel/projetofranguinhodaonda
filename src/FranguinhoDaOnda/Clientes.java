package FranguinhoDaOnda;

public class Clientes {

    private String cpf, nome, numero_residencial, complemento;
    Enderecos end;
    Telefones tel;
    Cartoes cart;
    Usuarios login;

    public void cadastrarCliente() {

    }

    public void ValidarCpf() {

    }

    public Clientes() {

    }

    public Clientes(String cpf, String nome, String numero_residencial, String complemento, Enderecos end, Telefones tel) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero_residencial = numero_residencial;
        this.complemento = complemento;
        this.end = end;
        this.tel = tel;
    }

    public Clientes(String cpf, String nome, String numero_residencial, String complemento, Enderecos end, Telefones tel, Cartoes cart, Usuarios login) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero_residencial = numero_residencial;
        this.complemento = complemento;
        this.end = end;
        this.tel = tel;
        this.cart = cart;
        this.login = login;
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

    public Cartoes getCart() {
        return cart;
    }

    public void setCart(Cartoes cart) {
        this.cart = cart;
    }

    public Usuarios getLogin() {
        return login;
    }

    public void setLogin(Usuarios login) {
        this.login = login;
    }

}
