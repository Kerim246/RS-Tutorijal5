package ba.unsa.etf.rs.tut5;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class KorisnikTest {

    private static Korisnik korisnik = null;

    @BeforeAll
    @Test
    static void getImeTest(){
        String novoIme = "IME";
        korisnik.setIme(novoIme);
        assertEquals("IME",korisnik.getIme());
    }

    static void getPrezimeTest(){
        String novoPrezime = "Jon";
        korisnik.setPrezime(novoPrezime);                //a //
        assertEquals("Jon",korisnik.getPrezime());
    }



}