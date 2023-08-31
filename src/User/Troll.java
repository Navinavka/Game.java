package User;

import common.Messages;
import common.Player;

/**
 * Класс персонажа Troll
 */
public class Troll extends Player {
    public Troll(String name) {
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
        return Messages.Hello.getSpeak1();
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
        return Messages.Less.getSpeak1();
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
        return Messages.more.getSpeak1();
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
        return Messages.Winner.getSpeak1();
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
        return Messages.losser.getSpeak1();
    }

}

