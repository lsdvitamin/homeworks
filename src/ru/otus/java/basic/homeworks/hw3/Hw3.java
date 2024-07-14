package ru.otus.java.basic.homeworks.hw3;

import static ru.otus.java.basic.homeworks.Util.inputNumber;

public class Hw3 {
    public static void coreHomework3() {
        System.out.println("----------------Домашнее задание #1-----------------");
        int numberOfMethod = 1;
        while (numberOfMethod != 0) {
            int number1 = (int) (Math.random() * 40) - 20;
            int number2 = (int) (Math.random() * 40) - 20;
            int number3 = (int) (Math.random() * 40) - 20;
            boolean increment = number3 > 0;
            System.out.print("\nВведите номер метода для ДЗ-1(1-5)  /0-к выбору ДЗ/: ");
            numberOfMethod = inputNumber();
            if (numberOfMethod == 1) {
                greetings();
            } else if (numberOfMethod == 2) {
                checkSign(number1, number2, number3);
            } else if (numberOfMethod == 3) {
                selectColor();
            } else if (numberOfMethod == 4) {
                compareNumbers();
            } else if (numberOfMethod == 5) {
                addOrSubtractAndPrint(number1, number2, increment);
            } else if (numberOfMethod == 0) {
                System.out.println("к выбору ДЗ");
            } else {
                System.out.println("Вы ввели недопустимое число");
                System.out.println("-----------------------------------------------");
            }
        }
    }

    //Метод 1. Выводит четыре слова в виде столбца
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
        System.out.println("-----------------------------------------------");
    }


    //Метод 2. Проверяет положительная ли сумма или отрицательная, выводит результат
    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.print("Сумма положительная");
        } else {
            System.out.print("Сумма отрицательная");
        }
        System.out.println(" (Аргументы: " + a + "; " + b + "; " + c + ")");
        System.out.println("-----------------------------------------------");
    }


    //Метод 3. Определяет цвет в зависимости от значения переменной data, выводит результат
    public static void selectColor() {
        int data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 20) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
        System.out.println("-----------------------------------------------");
    }


    //Метод 4. Сравнивает значения a и b, выводит результат
    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println("-----------------------------------------------");
    }


    //Метод 5. Считает сумму или разность a и b в зависимости от значения переменной increment, выводит результат
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result = increment ? initValue + delta : initValue - delta;
        System.out.print(result);
        System.out.println(" (Аргументы: " + initValue + "; " + delta + "; " + increment + ")");
        System.out.println("-----------------------------------------------");
    }

}
