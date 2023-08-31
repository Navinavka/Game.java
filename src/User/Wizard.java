package User;

import common.Messages;
import common.Player;

/**
 * Класс персонажа Wizard
 */
public class Wizard extends Player {
    public Wizard(String name) {
        super(name);
    }

    /**
     * Метод переопределен из абстрактного Player
     * Приветствие
     *
     * @param messages1 сообщение, возвращаемое из класса enum Messages
     * @return
     */
    @Override
    public String sayHello(Messages messages1) {
        return Messages.Hello.getSpeak2();
    }

    /**
     * Метод переопределен из абстрактного Player
     * Вывод сообщения Меньше
     *
     * @param messages2 сообщение, возвращаемое из класса enum Messages
     * @return
     */
    @Override
    public String sayLess(Messages messages2) {
        return Messages.Less.getSpeak2();
    }

    /**
     * Метод переопределен из абстрактного Player
     * Вывод сообщения больше
     *
     * @param messages3 сообщение, возвращаемое из класса enum Messages
     * @return
     */
    @Override
    public String sayMore(Messages messages3) {
        return Messages.more.getSpeak2();
    }

    /**
     * Метод переопределен из абстрактного Player
     * Вывод сообщения Победа
     *
     * @param messages4 сообщение, возвращаемое из класса enum Messages
     * @return
     */
    @Override
    public String sayWinner(Messages messages4) {
        return Messages.Winner.getSpeak2();
    }

    /**
     * Метод переопределен из абстрактного Player
     * Вывод сообщения Поражение
     *
     * @param messages5 сообщение, возвращаемое из класса enum Messages
     * @return
     */
    @Override
    public String sayLosser(Messages messages5) {
        return Messages.losser.getSpeak2();
    }
}
