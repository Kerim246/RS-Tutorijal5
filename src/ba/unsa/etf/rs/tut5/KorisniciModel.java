package ba.unsa.etf.rs.tut5;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnik;
    private SimpleObjectProperty<Korisnik> trenutniKorisnik;

    public KorisniciModel() {
        this.korisnik = FXCollections.observableArrayList();
        this.trenutniKorisnik = new SimpleObjectProperty<>();
    }

    public ObservableList<Korisnik> getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(ObservableList<Korisnik> korisnici) {
        this.korisnik = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void napuni(){
        korisnik.add(new Korisnik("Šemsudin", "Šemso", "semso@etf.unsa.ba", "poplava", "davamjeznat"));
        korisnik.add(new Korisnik("Hajrudin", "Hajro", "hajro@etf.unsa.ba", "fen", "davaqeemjeznat"));
        korisnik.add(new Korisnik("Zoran", "Zoro", "zoro@etf.unsa.ba", "asd", "qwerr"));
    }

    public void dodajKorisnika() {
        korisnik.add(new Korisnik());
    }
}
