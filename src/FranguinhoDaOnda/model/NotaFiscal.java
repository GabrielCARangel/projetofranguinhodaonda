package FranguinhoDaOnda.model;

public class NotaFiscal {

    private int serie;
    private String nnf, dhemi, dhsaient, tpnf, indpag, indpres, natop, indfinal, iddest;

    public void calcularPrecoFinal() {

    }

    public NotaFiscal(int serie, String nnf, String dhemi, String dhsaient, String tpnf, String indpag, String indpres, String natop, String indfinal, String iddest) {
        this.serie = serie;
        this.nnf = nnf;
        this.dhemi = dhemi;
        this.dhsaient = dhsaient;
        this.tpnf = tpnf;
        this.indpag = indpag;
        this.indpres = indpres;
        this.natop = natop;
        this.indfinal = indfinal;
        this.iddest = iddest;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getNnf() {
        return nnf;
    }

    public void setNnf(String nnf) {
        this.nnf = nnf;
    }

    public String getDhemi() {
        return dhemi;
    }

    public void setDhemi(String dhemi) {
        this.dhemi = dhemi;
    }

    public String getDhsaient() {
        return dhsaient;
    }

    public void setDhsaient(String dhsaient) {
        this.dhsaient = dhsaient;
    }

    public String getTpnf() {
        return tpnf;
    }

    public void setTpnf(String tpnf) {
        this.tpnf = tpnf;
    }

    public String getIndpag() {
        return indpag;
    }

    public void setIndpag(String indpag) {
        this.indpag = indpag;
    }

    public String getIndpres() {
        return indpres;
    }

    public void setIndpres(String indpres) {
        this.indpres = indpres;
    }

    public String getNatop() {
        return natop;
    }

    public void setNatop(String natop) {
        this.natop = natop;
    }

    public String getIndfinal() {
        return indfinal;
    }

    public void setIndfinal(String indfinal) {
        this.indfinal = indfinal;
    }

    public String getIddest() {
        return iddest;
    }

    public void setIddest(String iddest) {
        this.iddest = iddest;
    }

}
