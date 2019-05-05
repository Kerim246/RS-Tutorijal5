package ba.unsa.etf.rs.tut5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ApplicationExtension.class)

class ControllerTest {
    @Start
    public void start(Stage stage) throws Exception {
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        FXMLLoader loader = new  FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(new Controller(model));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();
        stage.toFront();
    }

    @Test
    void prviFXTest(FxRobot robot) {
        Button dodaj = robot.lookup("#add").queryAs(Button.class);
        assertNotNull(dodaj);
        robot.clickOn("Tarik Sijercic");
        robot.clickOn("#kraj");
    }

    @Test
    void dodavanjeNovog(FxRobot robot){
        Button dodaj = robot.lookup("#btnaddaction").queryAs(Button.class);
        robot.clickOn(dodaj);
        robot.clickOn("#Imefield");
        robot.press(KeyCode.CONTROL).press(KeyCode.A).release(KeyCode.CONTROL).release(KeyCode.A);
        robot.write("Šemsudin");
        robot.clickOn("#Prezimefield");
        robot.write("Šemsić");
        robot.clickOn("#mailfield");
        robot.write("semso@etf.unsa.ba");
        robot.clickOn("#korisnickofield");
        robot.write("poplava");
        robot.clickOn("#lozinkafield");
        robot.write("davamjeznat");

        robot.clickOn("#btnaddaction");

        assertEquals("Šemsudin Šemsić" , "Šemsudin Šemsić");

    }

}