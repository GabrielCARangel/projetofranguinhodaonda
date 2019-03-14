package FranguinhoDaOnda;

public class Clientes {

    private String cpf, nome, numero_residencial, complemento, Enderecos_cep, Cartao_numero, Usuarios_login;
    Enderecos end;
    Telefones tel;
    Cartoes cart;
    Usuarios login;

    public void cadastrarCliente() {

    }

    public void ValidarCpf() {

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

    public String getCartao_numero() {
        return Cartao_numero;
    }

    public void setCartao_numero(String Cartao_numero) {
        this.Cartao_numero = Cartao_numero;
    }

    public String getUsuarios_login() {
        return Usuarios_login;
    }

    public void setUsuarios_login(String Usuarios_login) {
        this.Usuarios_login = Usuarios_login;
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
