package ba.unsa.etf.rs.tut5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        model.setTrenutniKorisnik(model.getKorisnik().get(0)); // trenutni korisnik je prvi na listi

        Controller controller = new Controller(model);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(controller);
        Parent root = loader.load(); // ucitaj i dodaj u root

        primaryStage.setTitle("Korisnici");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {




        launch(args);
    }
}
