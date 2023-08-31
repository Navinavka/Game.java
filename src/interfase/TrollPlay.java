package interfase;

import User.Troll;
import common.Player;

/**
 * Интерфейс Troll
 */
public class TrollPlay implements Play {
    public Player createPlaer() {
        return new Troll("Деревянная кусколапа");
    }

}
