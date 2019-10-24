package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("televizor", 800, "123");
        assertEquals("televizor", a.getNaziv());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("televizor", 800, "123");
        assertEquals(800, a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("televizor", 800, "123");
        assertEquals("123", a.getKod());
    }
}