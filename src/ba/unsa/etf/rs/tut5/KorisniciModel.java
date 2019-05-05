package ba.unsa.etf.rs.tut5;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici;
    private SimpleObjectProperty<Korisnik> trenutniKorisnik;

    public KorisniciModel() {
        this.korisnici = FXCollections.observableArrayList();
        this.trenutniKorisnik = new SimpleObjectProperty<>();
    }

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
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
        korisnici.add(new Korisnik("Šemsudin", "Šemso", "semso@etf.unsa.ba", "poplava", "davamjeznat"));
        korisnici.add(new Korisnik("Hajrudin", "Hajro", "hajro@etf.unsa.ba", "fen", "davaqeemjeznat"));
        korisnici.add(new Korisnik("Zoran", "Zoro", "zoro@etf.unsa.ba", "asd", "qwerr"));
    }

    public void dodajKorisnika() {
        korisnici.add(new Korisnik());
    }
}
