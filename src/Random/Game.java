package Random;

import java.util.Random;

/** Класс генерирующий случайное число
 * x возвращаемое число
 */
public class Game {
    public static int number (){
        Random random = new Random();
        int x = random.nextInt (1,10);
        return x;

    }
}
