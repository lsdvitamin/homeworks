package ru.otus.java.basic.homeworks.hw7;

import java.util.Arrays;

import static ru.otus.java.basic.homeworks.Util.inputNumber;

public class Hw7 {
    public static void coreHomework7() {
        System.out.println("----------------Домашнее задание #7-----------------");
        int numberOfMethod = 1;
        while (numberOfMethod != 0) {
            System.out.print("\nВведите номер метода для ДЗ-3(1-5)  /0-к выбору ДЗ/: ");
            numberOfMethod = inputNumber();
            if (numberOfMethod == 1) {
                int[][] arr2d = {{-2, 7, 3, 14, 6, 44, 6, -77}, {8, 2, 0, -14, 12, 8}, {44, 6, 10, 20, -5}};
                System.out.println("Сумма, элементов массива " + Arrays.deepToString(arr2d) + " больше 0 = " +
                        getSumOfPositiveElrments(arr2d));
            } else if (numberOfMethod == 2) {
                printSquare(7);
            } else if (numberOfMethod == 3) {
                int[][] arrSquare = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
                getResetToZeroElementsOfArray(arrSquare);
            } else if (numberOfMethod == 4) {
                int[][] arr2d = {{45, 0, 20, 4, -10, 54, 100, 777, 5, 47}, {32, 5, 0, -1, 14}, {7, -12, 47, 56, 22, 4, 0, 1, 44}};
                System.out.println("Максимальный элемент массива " + Arrays.deepToString(arr2d) + " = " +
                        getMaxElementFromArray(arr2d));
            } else if (numberOfMethod == 5) {
                //int[][] arr2d = {{45, 0, 20, 4, -10, 54, 100, 777, 5, 47}};
                //int[][] arr2d = {{45, 0, 20, 4, -10, 54, 100, 777, 5, 47},{}};
                int[][] arr2d = {{45, 0, 20, 4, -10, 54, 100, 777, 5, 47}, {32, 8, 0, -1, -19}, {7, -12, 47, 56, 22, 4, 0, 1, 44}};
                System.out.println("Результат: " + getCalcSumAllElemensSecondRow(arr2d));
            } else if (numberOfMethod == 0) {
                System.out.println("к выбору ДЗ");
            } else {
                System.out.println("Вы ввели недопустимое число");
                System.out.println("-----------------------------------------------");
            }
        }
    }

    //Метод 5. Считает и возвращает сумму всех элементов второй строки массива. Если второй строки нет, то вернет -1
    private static int getCalcSumAllElemensSecondRow(int[][] arr2d) {
        if (arr2d.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int j = 0; j < arr2d[1].length; j++) {
            sum += arr2d[1][j];
        }
        return sum;
    }

    //Метод 4. Находит и возвращает максимальный элемент массива
    private static int getMaxElementFromArray(int[][] arr2d) {
        int maxElement = arr2d[0][0];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > maxElement) {
                    maxElement = arr2d[i][j];
                }
            }
        }
        return maxElement;
    }

    //Метод 3. Зануляет все элементы массива по обеим диагоналям
    private static void getResetToZeroElementsOfArray(int[][] arrSquare) {
        System.out.println("Исходный массив:");
        for (int i = 0; i < arrSquare.length; i++) {
            for (int j = 0; j < arrSquare[i].length; j++) {
                System.out.print(arrSquare[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < arrSquare.length; i++) {
            arrSquare[i][i] = 0;
            arrSquare[arrSquare.length - i - 1][i] = 0;
        }

        System.out.println("Занулённый массив:");
        for (
                int i = 0;
                i < arrSquare.length; i++) {
            for (int j = 0; j < arrSquare[i].length; j++) {
                System.out.print(arrSquare[i][j] + "  ");
            }
            System.out.println();
        }

    }

    //Метод 2. Печатает квадрат из звездочек с количеством сторон равный lengthSides
    private static void printSquare(int lengthSides) {
        for (int i = 0; i < lengthSides; i++) {
            for (int j = 0; j < lengthSides; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    //Метод 1. Считает и возвращает сумму всех элементов массива, которые больше 0
    private static int getSumOfPositiveElrments(int[][] arr2d) {
        int sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > 0) {
                    sum += arr2d[i][j];
                }
            }
        }
        return sum;
    }

}
