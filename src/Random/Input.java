package Random;

import java.util.Scanner;

/**
 * Класс для ввода случайного числа
 * num возвращаемое число
 */
public class Input {
    public static int enterNumber(int num) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        return num;

    }
}


