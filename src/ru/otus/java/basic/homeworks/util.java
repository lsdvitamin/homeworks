package ru.otus.java.basic.homeworks;

import java.util.Scanner;

public class util {
    //Запрашивает у пользователя ввод числа
    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //Запрашивает у пользователя ввод строки
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
