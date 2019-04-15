package ba.unsa.etf.rs.tut5;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class KorisniciModelTest {

    private static KorisniciModel model = null;

    @BeforeAll
    static void setup(){
        model = new KorisniciModel();
        model.napuni();
    }

}