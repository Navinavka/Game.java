package interfase;

import User.Wizard;
import common.Player;

/**
 * Интерфейс Wizard
 */
public class WizardPlay implements Play  {
    public Player createPlaer() {
        return new Wizard("Охерендальф");
    }

}
