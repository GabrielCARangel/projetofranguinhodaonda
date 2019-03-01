package FranguinhoDaOnda;

public class Usuario {

    private int codigo;
    private String usuario, senha;

    //Método construtor
    public Usuario() {
    }

    // Métodos de entradas e saídas
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
