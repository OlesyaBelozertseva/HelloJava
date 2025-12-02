import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        //  вывод чисел от 1 до 10
        System.out.println("Числа от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        //  сумма чисел от 1 до 100
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до 100: " + sum);
        System.out.println();
        

        String correctPassword = "java123";
        String userPassword = "java123"; 
        
        System.out.println("Проверка пароля...");
        System.out.println("Введенный пароль: " + userPassword);
        
        if (userPassword.equals(correctPassword)) {
            System.out.println("Пароль верный! Добро пожаловать.");
        } else {
            System.out.println("Неверный пароль.");
        }
        System.out.println();
        
        //  факториал числа 5 с помощью while
        int factorial = 1;
        int num = 5;
        int counter = 1;
        while (counter <= num) {
            factorial *= counter;
            counter++;
        }
        System.out.println("Факториал числа 5: " + factorial);
    }
}