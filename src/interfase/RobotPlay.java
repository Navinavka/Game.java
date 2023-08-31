package interfase;

import User.Robot;
import common.Player;

/**
 * Интерфейс Robot
 */
public class RobotPlay implements Play {
    public Player createPlaer() {
        return new Robot("E325-JT48");
    }

}

