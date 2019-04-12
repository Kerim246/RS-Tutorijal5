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

    public void btnaddaction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listKorisnik.setItems(model.getKorisnici());
        listKorisnik.selectionModelProperty().addListener(new ChangeListener<MultipleSelectionModel<Korisnik>>() {
            @Override
            public void changed(ObservableValue<? extends MultipleSelectionModel<Korisnik>> observable, MultipleSelectionModel<Korisnik> oldValue, MultipleSelectionModel<Korisnik> newValue) {
                if (newValue == null) {
                    unbind();
                } else {
                    bind();
                    model.setTrenutniKorisnik(newValue.getSelectedItem());
                }
            }
        });
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
        }



