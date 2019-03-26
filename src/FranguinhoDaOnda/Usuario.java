package FranguinhoDaOnda;

public class Usuario {

    private String login, senha, tipo;

    public Usuario() {
    }

    public Usuario(int codigo, String usuario, String senha, String tipo) {
        this.login = usuario;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return login;
    }

    public void setUsuario(String usuario) {
        this.login = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
