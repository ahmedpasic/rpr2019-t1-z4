package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("kanta", 20, "abc");
        assertEquals(true, korpa.dodajArtikl(a));
    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        for(int i=1; i<10; i++){
            korpa.dodajArtikl(new Artikl("racunar", 10*i, i+""));
        }
        assertEquals(new Artikl("racunar", 60, "6"), korpa.izbaciArtiklSaKodom("6"));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        for(int i=1; i<10; i++){
            korpa.dodajArtikl(new Artikl("racunar", 10*i, i+""));
        }
        assertEquals(450, korpa.dajUkupnuCijenuArtikala());
    }
}