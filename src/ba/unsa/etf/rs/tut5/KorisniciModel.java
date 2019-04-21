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
        korisnici.add(new Korisnik("Šemsudin", "Dino Poplava", "semso@etf.unsa.ba", "poplava", "davamjeznat"));
        korisnici.add(new Korisnik("Hajrudin", "Dino Poplava", "semso@etf.unsa.ba", "poplava", "davamjeznat"));
        korisnici.add(new Korisnik("Zoran", "Dino Poplava", "semso@etf.unsa.ba", "poplava", "davamjeznat"));
    }

    public void dodajKorisnika() {
        korisnici.add(new Korisnik());
    }
}
