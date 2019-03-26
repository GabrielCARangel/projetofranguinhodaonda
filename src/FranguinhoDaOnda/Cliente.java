package FranguinhoDaOnda;

public class Cliente {

    private String cpf, nome, numero_residencial, complemento;
    Endereco end;
    Telefone tel;
    Cartao cart;
    Usuario login;

    public void cadastrarCliente() {

    }

    public void ValidarCpf() {

    }

    public Cliente() {

    }

    public Cliente(String cpf, String nome, String numero_residencial, String complemento, Endereco end, Telefone tel) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero_residencial = numero_residencial;
        this.complemento = complemento;
        this.end = end;
        this.tel = tel;
    }

    public Cliente(String cpf, String nome, String numero_residencial, String complemento, Endereco end, Telefone tel, Cartao cart, Usuario login) {
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

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public Telefone getTel() {
        return tel;
    }

    public void setTel(Telefone tel) {
        this.tel = tel;
    }

    public Cartao getCart() {
        return cart;
    }

    public void setCart(Cartao cart) {
        this.cart = cart;
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

}
