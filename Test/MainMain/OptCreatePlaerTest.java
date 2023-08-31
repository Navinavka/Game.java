package MainMain;

import interfase.RobotPlay;
import interfase.TrollPlay;
import interfase.WizardPlay;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptCreatePlaerTest {

    TrollPlay trollPlay;
    WizardPlay wizardPlay;
    RobotPlay robotPlay;

    @BeforeEach
    void setUp() {
        trollPlay = new TrollPlay();
        wizardPlay = new WizardPlay();
        robotPlay = new RobotPlay();
    }

    @Test
    void optcreatePlaer1() {
        String opponent = "Troll";
        assertEquals(trollPlay, trollPlay);
    }
    @Test
    void optcreatePlaer2() {
        String opponent = "Wizard";
        assertEquals(wizardPlay, wizardPlay);
    }
    @Test
    void optcreatePlaer3() {
        String opponent = "Robot";
        assertEquals(robotPlay, robotPlay);
    }


}
