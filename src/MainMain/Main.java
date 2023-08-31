package MainMain;

import Random.Game;
import Random.Input;
import common.Messages;
import interfase.Play;
import common.Player;


public class Main {

       /** Главный метод для вывода на консоль
     * @param arg
     *
     */
    public static void main(String arg[]) {
        {new Program();
        }


        System.out.println("Против кого будете играть?");


        Play play = OptCreatePlaer.optcreatePlaer();
        Player player = play.createPlaer();

        System.out.println(player.sayHello(Messages.Hello) + player.getName() + ". Угадай число");

        int y = Game.number();
        System.out.println(y);

        for (int i = 1; i <= 4; i++) {
            if (i == 4) {
                System.out.println(player.sayLosser(Messages.losser));
                return;
            }

            int x = Input.enterNumber(i);
            if (y < x) {
                System.out.println(player.sayLess(Messages.Less));
                continue;
            }
            if (y > x) {
                System.out.println(player.sayMore(Messages.more));
                continue;
            }
            if (y == x) {
                System.out.println(player.sayWinner(Messages.Winner));
                return;
            }

        }
    }
}
