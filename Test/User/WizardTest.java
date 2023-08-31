package User;

import common.Messages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
Wizard wizard;
    @BeforeEach
    void setUp() {
        wizard=new Wizard("");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void say1() {
     assertEquals("Да здравствует свет! Меня зовут ", wizard.say1(Messages.Hello) );
    }

    @Test
    void say2() {
      assertEquals("Загаданное число меньше", wizard.say2(Messages.Less) );
    }

    @Test
    void say3() {
            assertEquals("Загаданное число больше", wizard.say3(Messages.more) );
    }

    @Test
    void say4() {
            assertEquals("Да прибудет с тобой свет! Поздравляю!", wizard.say4(Messages.Winner) );
    }

    @Test
    void say5() {
             assertEquals("Ты заблудился во тьме, сожалею", wizard.say5(Messages.losser) );
    }
}