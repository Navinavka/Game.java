package MainMain;

import interfase.Play;
import interfase.RobotPlay;
import interfase.TrollPlay;
import interfase.WizardPlay;
import java.util.Scanner;

/**
 * Реализация фабричного шаблона
 */
public class OptCreatePlaer {

    /**
     * Выбор обьекта в зависимости от введенных данных
     *
     * @return возвращает обьект из пакета User
     */
    static Play optcreatePlaer() {
        Scanner scanner = new Scanner(System.in);
        String opponent = scanner.nextLine();

        if (opponent.equalsIgnoreCase("Troll")) {
            return new TrollPlay();
        }
        if (opponent.equalsIgnoreCase("Wizard")) {
            return new WizardPlay();
        }
        if (opponent.equalsIgnoreCase("Robot")) {
            return new RobotPlay();

        } else {
            return null;
        }

    }
}

