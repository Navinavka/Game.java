package common;

/**
 * Абстрактный класс, определяющий User
 */
public abstract class Player {
    /**
     * @param name Имя персонажа
     */
    public void setName(String name) {
        this.name = name;
    }

    String name;

    /**Конструктор User
     * @param name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return Позволяет получить имя персонажа
     */
    public String getName(){
        return name;
    }

    /**
     * Абстрактный метод класса
     * Приветствие
     * @param messages1 сообщение
     */
    public abstract String sayHello (Messages messages1);

    /**
     * Абстрактный метод класса
     * Вывод сообщения Меньше
     * @param messages2 сообщение
     */
    public abstract String sayLess (Messages messages2);

    /**
     * Абстрактный метод класса
     * Вывод сообщения больше
     * @param messages3 сообщение
     */
    public abstract String sayMore (Messages messages3);

    /**
     * Абстрактный метод класса
     * Вывод сообщения Победа
     * @param messages4 сообщение
     */
    public abstract String sayWinner (Messages messages4);

    /**
     * Абстрактный метод класса
     * Вывод сообщения Поражение
     * @param messages5 сообщение
     */
    public abstract String sayLosser (Messages messages5);

}
