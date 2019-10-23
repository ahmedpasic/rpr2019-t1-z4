package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] nizArtikala = null;
    private int brojStvariUSupermarketu;

    public Supermarket(){
        nizArtikala = new Artikl[1000];
    }
    public boolean dodajArtikl(Artikl a){
        if(brojStvariUSupermarketu < 1000){
            nizArtikala[brojStvariUSupermarketu++] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            return true;
        }
        return false;
    }
    public Artikl[] getArtikli(){
        return nizArtikala;
    }
    public Artikl izbaciArtiklSaKodom(String k){
        Artikl trazeni = null;
        for(int i = 0 ; i < brojStvariUSupermarketu; i++){
            if(nizArtikala[i].getKod().equals(k)){
                trazeni = new Artikl(nizArtikala[i].getNaziv(), nizArtikala[i].getCijena(), nizArtikala[i].getKod());
                nizArtikala[i] = null;
                for( int j = i+1; j<brojStvariUSupermarketu; j++) {
                    nizArtikala[j - 1] = nizArtikala[j];
                }
                nizArtikala[--brojStvariUSupermarketu] = null;
                break;
            }
        }
        return trazeni;
    }
}
