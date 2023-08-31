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
    public abstract String say1 (Messages messages1);

    /**
     * Абстрактный метод класса
     * Вывод сообщения Меньше
     * @param messages2 сообщение
     */
    public abstract String say2 (Messages messages2);

    /**
     * Абстрактный метод класса
     * Вывод сообщения больше
     * @param messages3 сообщение
     */
    public abstract String say3 (Messages messages3);

    /**
     * Абстрактный метод класса
     * Вывод сообщения Победа
     * @param messages4 сообщение
     */
    public abstract String say4 (Messages messages4);

    /**
     * Абстрактный метод класса
     * Вывод сообщения Поражение
     * @param messages5 сообщение
     */
    public abstract String say5 (Messages messages5);

}
