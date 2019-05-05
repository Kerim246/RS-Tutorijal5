package ba.unsa.etf.rs.tut5;

import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationTest;

import java.awt.*;


import static org.junit.jupiter.api.Assertions.*;

class MainTest extends ApplicationTest {
    public MainTest() {
        super();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        super.start(stage);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Test
    public void testButtonClick (FxRobot robot) {
        TextField btnPrijava = robot.lookup("#Imefield").queryAs(TextField.class);
        robot.clickOn(btnPrijava); //
        robot.write("Danas");      //
        robot.press(KeyCode.ALT).press(KeyCode.F4).release(KeyCode.F4);

    }


}