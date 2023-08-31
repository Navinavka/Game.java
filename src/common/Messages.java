package common;

public enum Messages {
    /**
     * say1 означает приветствие
     */
    Hello("Я твоя не съесть. Я есть ", "Да здравствует свет! Меня зовут ", "Робот \uD83D\uDE03 "),
    /**
     * say2 Меньше
     */
    Less("Надо Меньше", "Загаданное число меньше", "< \uD83E\uDD14"),
    /**
     * say3 Больше
     */
    more("Надо Больше", "Загаданное число больше", "> \uD83E\uDD14"),
    /**
     * say4 Победа
     */
    Winner("Ура! Победа", "Да прибудет с тобой свет! Поздравляю!", "True \uD83E\uDD29"),
    /**
     * say5 Поражение
     */
    losser("Ты Проиграл!", "Ты заблудился во тьме, сожалею", "False \uD83E\uDD25");


    public String getSpeak1() {
        return speak1;
    }

    public String getSpeak2() {
        return speak2;
    }

    public String getSpeak3() {
        return speak3;
    }

    private final String speak1;
    private final String speak2;
    private final String speak3;

    /**
     * Констрктор для вывода разных вариантов ответа
     *
     * @param speak1 вывод для Troll
     * @param speak2 вывод для Wizard
     * @param speak3 вывод для Robot
     */
    Messages(String speak1, String speak2, String speak3) {
        this.speak1 = speak1;
        this.speak2 = speak2;
        this.speak3 = speak3;
    }
}

