package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] nizArtikala = null;
    private int brojStvariUKorpi;

    public Korpa() {
        nizArtikala = new Artikl[50];
    }
    public boolean dodajArtikl(Artikl a) {
        if(brojStvariUKorpi<50){
            nizArtikala[brojStvariUKorpi] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            brojStvariUKorpi=brojStvariUKorpi+1;
            return true;
        }
        return false;
    }
    public Artikl[] getArtikli () {
        return nizArtikala;
    }
    public Artikl izbaciArtiklSaKodom(String k) {
        Artikl trazeni = null;
        for(int i = 0 ; i < brojStvariUKorpi; i++){
            if(nizArtikala[i].getKod().equals(k)){
                trazeni = new Artikl(nizArtikala[i].getNaziv(), nizArtikala[i].getCijena(), nizArtikala[i].getKod());
                nizArtikala[i] = null;
                for( int j = i+1; j<brojStvariUKorpi; j++) {
                    nizArtikala[j - 1] = nizArtikala[j];
                }
                nizArtikala[--brojStvariUKorpi] = null;
                break;
            }
        }
        return trazeni;
    }
    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i < brojStvariUKorpi ; i++){
            suma+=nizArtikala[i].getCijena();
        }
        return suma;
    }
}
