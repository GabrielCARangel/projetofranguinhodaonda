package projetointegrador;

public class ProjetoIntegrador {

    public static void main(String[] args) {
        Clientes cl = new Clientes("425.531.050-53", "Gabriel", "101", "perto do supermercado");
        Telefones nm = new Telefones ("33157814");
        Enderecos cl_end = new Enderecos("29045-680", "Rua Limoeiro", "Bairro Concesão");
        Telefones cl_tel = new Telefones("99968724");
        Produtos prdt = new Produtos(1, "Hambúrger de bacon", 12.99);
        Motoboys mot = new Motoboys("HMG-2040", "425.531.050-53", "99658412");

    }
}
