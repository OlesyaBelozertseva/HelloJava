import java.util.*;
import java.lang.*;
import java.io.*;

/* Задание 7: Работа со строками (Основы) */
public class Main {
    public static void main(String[] args) {
        // Создание строки
        String greeting = "Привет, Java!";

        // 1. Длина строки
        System.out.println("Длина строки: " + greeting.length());

        // 2. Объединение строк
        String message = greeting + " Как дела?";
        System.out.println("Сообщение: " + message);

        // 3. Проверка начала строки
        boolean startsWithHello = greeting.startsWith("Привет");
        System.out.println("Начинается с 'Привет': " + startsWithHello);

        // 4. Регистры
        System.out.println("Верхний регистр: " + greeting.toUpperCase());
        System.out.println("Нижний регистр: " + greeting.toLowerCase());
        
        // 5. Дополнительная задача: Проверка окончания на восклицательный знак
        boolean endsWithExclamation = greeting.endsWith("!");
        System.out.println("Заканчивается на '!': " + endsWithExclamation);
    }
}

