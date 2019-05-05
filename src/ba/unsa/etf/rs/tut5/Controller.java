package ba.unsa.etf.rs.tut5;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.WeakChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public PasswordField lozinkafield;
    public TextField korisnickofield;
    public TextField mailfield;
    public TextField Prezimefield;
    public TextField Imefield;
    public Button btnadd;
    public Button btnizadji;
    public ListView<Korisnik> listKorisnik;
    private KorisniciModel model;


    public Controller(KorisniciModel model) {
        this.model = model;
    }

    public Controller() {
    }

    public void Izadji(ActionEvent actionEvent) {

        Stage myStage = (Stage) btnadd.getScene().getWindow();
        myStage.close();

    }

    public void btnaddaction(ActionEvent actionEvent) {     // Dodavanje korisnika
        model.dodajKorisnika();
        unbind();
        model.setTrenutniKorisnik( model.getKorisnici().get(model.getKorisnici().size() - 1) );
        bind();
        listKorisnik.refresh();
    }



            private void unbind() {
                Imefield.textProperty().unbindBidirectional(model.getTrenutniKorisnik().imeProperty());   // simpleStringproperty vraca
                Prezimefield.textProperty().unbindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
                mailfield.textProperty().unbindBidirectional(model.getTrenutniKorisnik().emailProperty());
                korisnickofield.textProperty().unbindBidirectional(model.getTrenutniKorisnik().usernameProperty());
                lozinkafield.textProperty().unbindBidirectional(model.getTrenutniKorisnik().passwordProperty());

            }


            private void bind() {
                //treba spojiti field ime sa ime modela itd...
                Imefield.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());   // simpleStringproperty vraca
                Prezimefield.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
                mailfield.textProperty().bindBidirectional(model.getTrenutniKorisnik().emailProperty());
                korisnickofield.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
                lozinkafield.textProperty().bindBidirectional(model.getTrenutniKorisnik().passwordProperty());

            }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model.setTrenutniKorisnik(model.getKorisnici().get(0));
        bind();
        listKorisnik.setItems(model.getKorisnici());
        listKorisnik.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Korisnik>() {
            @Override
            public void changed(ObservableValue<? extends Korisnik> observableValue, Korisnik oldUser, Korisnik newUser) {
                if(oldUser != null)
                    unbind();
                if(newUser == null){
                    Imefield.setText("");
                    Prezimefield.setText("");
                    mailfield.setText("");
                    korisnickofield.setText("");
                    lozinkafield.setText("");
                }
                else {
                    Korisnik korisnik = listKorisnik.getSelectionModel().getSelectedItem();
                    unbind();
                    model.setTrenutniKorisnik(korisnik);
                    bind();
                    listKorisnik.refresh();
                }
                listKorisnik.refresh();
            }
        });
    }

        }




