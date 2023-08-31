package User;

import common.Messages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrollTest {
   Troll troll;

    @BeforeEach
    void setUp() {
        troll = new  Troll ("");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void say1() {
             assertEquals("Я твоя не съесть. Я есть ", troll.sayHello(Messages.Hello) );
    }

    @Test
    void say2() {
             assertEquals("Надо Меньше", troll.sayLess(Messages.Less) );
    }

    @Test
    void say3() {
             assertEquals("Надо Больше", troll.sayMore(Messages.more) );
    }

    @Test
    void say4() {
           assertEquals("Ура! Победа", troll.sayWinner(Messages.Winner) );
    }

    @Test
    void say5() {
          assertEquals("Ты Проиграл!", troll.sayLosser(Messages.losser) );
    }
}