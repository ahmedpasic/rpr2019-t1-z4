package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String n, int c, String k) {
        naziv = n;
        cijena = c;
        kod = k;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
