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
        assertEquals("Робот ", robot.sayHello(Messages.Hello));
    }

    @Test
    void say2() {
        assertEquals("<", robot.sayLess(Messages.Less) );
    }

    @Test
    void say3() {assertEquals(">", robot.sayMore(Messages.more) );
    }

    @Test
    void say4() {
        assertEquals("True", robot.sayWinner(Messages.Winner) );
    }

    @Test
    void say5() {assertEquals("False", robot.sayLosser(Messages.losser) );
    }
}