package ba.unsa.etf.rs.tut5;

import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;
import org.testng.annotations.ITestAnnotation;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class KorisniciModelTest {

    private static KorisniciModel model = null;

    @BeforeAll
    static void setup(){
        model = new KorisniciModel();
        model.napuni();
    }


    @Test
    void testNovogKorisnika(){
        ObservableList<Korisnik> x = model.getKorisnik();
        x.add(new Korisnik("Šemso","Šemsic","mail","user","pass"));
        assertEquals(7,model.getKorisnik().size());     // testira korisnika
    }

    @Test
    void ProvjeraBrojaKorisnika(){
        model.setKorisnik(model.getKorisnik());
        assertEquals(5 , model.getKorisnik().size());
    }




}