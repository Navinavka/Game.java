package User;

import common.Messages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Robot robot;

    @BeforeEach
    void setUp() {
        robot= new Robot("");
    }

    @Test
    void say1() {
        assertEquals("Робот ", robot.say1(Messages.Hello));
    }

    @Test
    void say2() {
        assertEquals("<", robot.say2(Messages.Less) );
    }

    @Test
    void say3() {assertEquals(">", robot.say3(Messages.more) );
    }

    @Test
    void say4() {
        assertEquals("True", robot.say4(Messages.Winner) );
    }

    @Test
    void say5() {assertEquals("False", robot.say5(Messages.losser) );
    }
}