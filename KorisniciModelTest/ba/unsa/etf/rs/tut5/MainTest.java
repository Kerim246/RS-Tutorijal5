package ba.unsa.etf.rs.tut5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public MainTest() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Test
    public void testButtonClick (FxRobot robot) {
        TextField btnPrijava = robot.lookup("#Imefield").queryAs(TextField.class);
        robot.clickOn(btnPrijava);
        robot.write("Danas");
        robot.press(KeyCode.ALT).press(KeyCode.F4).release(KeyCode.F4);

    }


}