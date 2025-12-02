import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создание и иниц массива
        int[] numbers = {10, 25, 7, 42, 18};

        // 
        System.out.println("Элементы массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //  Сумма 
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма: " + sum);

        //  макс элемент
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        
        // проверка  числа 42
        int target = 42;
        boolean found = false;
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Массив содержит число " + target);
        } else {
            System.out.println("Массив не содержит число " + target);
        }
    }
}