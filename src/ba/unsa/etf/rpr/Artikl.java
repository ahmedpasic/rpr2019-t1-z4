package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private double cijena;
    private String kod;

    public Artikl(String n, double c, String k) {
        naziv = n;
        cijena = c;
        kod = k;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
