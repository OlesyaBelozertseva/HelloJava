import java.util.*;
import java.lang.*;
import java.io.*;

/* Задание 8: Работа со строками (Продвинутые методы) */
public class Main {
    public static void main(String[] args) {
        String data = "Ivan;Petrov;30;Moscow";

        // 1. Разделение строки
        System.out.println("Splitting the string:");
        String[] parts = data.split(";");
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Field " + i + ": " + parts[i]);
        }

        // 2. Замена подстроки
        String updatedData = data.replace("Moscow", "Saint Petersburg");
        System.out.println("\nUpdated data: " + updatedData);

        // 3. Поиск позиции
        int index = data.indexOf("Petrov");
        System.out.println("'Petrov' found at position: " + index);

        // 4. Извлечение подстроки
        String firstName = data.substring(0, data.indexOf(";"));
        System.out.println("First name: " + firstName);
        
        // 5. Дополнительная задача: поиск всех букв 'a'
        System.out.println("\nFinding all 'a' letters:");
        String text = "Moscow and Saint Petersburg are Russian cities";
        char target = 'a';
        int count = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                System.out.println("Found 'a' at position: " + i);
                count++;
            }
        }
        System.out.println("Total 'a' letters found: " + count);
    }
}