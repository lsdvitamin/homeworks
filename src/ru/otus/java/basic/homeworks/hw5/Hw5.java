package ru.otus.java.basic.homeworks.hw5;

import java.util.Arrays;

import static ru.otus.java.basic.homeworks.Util.inputNumber;
import static ru.otus.java.basic.homeworks.Util.inputString;

public class Hw5 {

    public static void coreHomework5() {
        System.out.println("----------------Домашнее задание #5-----------------");
        int numberOfMethod = 1;
        while (numberOfMethod != 0) {
            System.out.print("\nВведите номер метода(1-9) для ДЗ-2 /0-к выбору ДЗ/: ");
            numberOfMethod = inputNumber();
            if (numberOfMethod == 1) {
                int numberOfString;
                String str;
                System.out.print("\nВведите количество строк: ");
                numberOfString = inputNumber();
                System.out.print("\nВведите строку: ");
                str = inputString();
                printNTimes(numberOfString, str);
            } else if (numberOfMethod == 2) {
                int[] arr = {8, 2, 4, 6, 5, 5};
                calcElementOfArrayAndPrint(arr);
            } else if (numberOfMethod == 3) {
                int[] arr = new int[10];
                insertIntoArrayAndPrint(10, arr);
            } else if (numberOfMethod == 4) {
                int[] arr = {12, 2, 15, 10, 4, 45, 11};
                increaseAllElementAndPrint(5, arr);
            } else if (numberOfMethod == 5) {
                int[] arr = {43, 2, 15, 10, 4, 45, 11};
                printWhichHalfIsBigger(arr);
            } else if (numberOfMethod == 6) {
                int[] arr1 = {43, 2, 15, 1, 4, 8, 11};
                int[] arr2 = {43, 3, 14, 7, 9};
                int[] arr3 = {10, 4, 12, 2, 0, 7, 11, 6};
                sumArraysElements(arr1, arr2, arr3);
            } else if (numberOfMethod == 7) {
                int[] arr = {43, 2, 15, 7, 1, 7, 4, 11};  //Есть точка равенства
                //int[] arr = {43, 2, 15, 2, 0, 4, 8, 11};  //Нет точки равенства
                findDotWhereLeftPartEqualToRightPart(arr);
            } else if (numberOfMethod == 8) {
                String method;
                //int[] arr = {1, 99, 80, 71, 54, 0, 37, 14, 12, 0};
                //int[] arr = {-40, 0, 1, 2, 15, 18, 99, 101, 1000};
                int[] arr = {99, 80, 71, 54, 41, 37, 14, 12, 0, -10};
                System.out.print("Введите порядок сортировки (asc/desc): ");
                method = inputString();
                isSorted(method, arr);
            } else if (numberOfMethod == 9) {
                int[] arr = {43, 2, 15, 2, 0, 4, 8, 11};
                swapArr(arr);
            } else if (numberOfMethod == 0) {
                System.out.println("к выбору ДЗ");
            } else {
                System.out.println("Вы ввели недопустимое число");
                System.out.println("-----------------------------------------------");
            }
        }
    }

    //Метод 9*. Меняет местами элементы массива
    private static void swapArr(int[] arr) {
        int buf;
        System.out.print("Массив до перестановки: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            buf = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buf;
        }
        System.out.print("Массив после перестановки: ");
        System.out.println(Arrays.toString(arr));
    }

    //Метод 8*. Проверяет, верно ли отсортирован массив и выводит результат проверки
    private static void isSorted(String method, int[] arr) {
        boolean sortTrue = true;
        System.out.print(Arrays.toString(arr) + " - ");
        if (method.equals("asc")) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sortTrue = false;
                }
            }
            System.out.println("Сортировка по возрастанию " + (sortTrue ? "верная" : "неверная"));
        } else if (method.equals("desc")) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    sortTrue = false;
                }
            }
            System.out.println("Сортировка по убыванию " + (sortTrue ? "верная" : "неверная"));
        }
    }

    //Метод 7*. Проверяет, есть ли в массиве точка, в которой левая часть равна правой
    private static void findDotWhereLeftPartEqualToRightPart(int[] arr) {
        int sumLeftPart;
        int sumRightPart;
        for (int i = 0; i < arr.length - 1; i++) {
            sumLeftPart = 0;
            sumRightPart = 0;
            for (int j = 0; j < i + 1; j++) {
                sumLeftPart += arr[j];
            }
            for (int h = i + 1; h < arr.length; h++) {
                sumRightPart += arr[h];
            }
            if (sumLeftPart == sumRightPart) {
                System.out.println("Точка равенства " + sumLeftPart + " = " + sumRightPart + " в массиве " + Arrays.toString(arr) +
                        " находится между элементами " + (int) (i) + " и " + (int) (i + 1));
                return;
            }
        }
        System.out.println("Точка равенства в массиве " + Arrays.toString(arr) + " не найдена");
    }


    //Метод 6*. Суммирует элементы массивов и копирует результат в новы массив. Выводит результат на экран
    private static void sumArraysElements(int[] arr1, int[] arr2, int[] arr3) {
        int maxLength = Math.max(Math.max(arr1.length, arr2.length), arr3.length);
        int[] totalArr = new int[maxLength];
        int element1;
        int element2;
        int element3;
        int sumElement;
        for (int i = 0; i < maxLength; i++) {
            element1 = arr1.length > i ? arr1[i] : 0;
            element2 = arr2.length > i ? arr2[i] : 0;
            element3 = arr3.length > i ? arr3[i] : 0;
            totalArr[i] = element1 + element2 + element3;
        }
        System.out.println(Arrays.toString(arr1) + " +\n" + Arrays.toString(arr2) + " +\n" + Arrays.toString(arr3) + " =\n" + Arrays.toString(totalArr));
    }

    /*
    Метод 5. Определяет какая часть массива больше, левая или правая. Выводит результат
    Если в массиве нечетное число элементов, то не учитывает в расчете средний элемент
    т.к. он не относится ни к левой ни к правой части. Не притендую на истину, я так вижу :).
    */
    private static void printWhichHalfIsBigger(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeft += arr[i];
            sumRight += arr[arr.length - i - 1];
        }
        System.out.println("Массив: " + Arrays.toString(arr));
        if (sumLeft > sumRight) {
            System.out.println("Левая часть массива(" + sumLeft + ") больше правой(" + sumRight + ")");
        } else if (sumLeft < sumRight) {
            System.out.println("Левая часть массива(" + sumLeft + ") меньше правой(" + sumRight + ")");
        } else {
            System.out.println("Левая часть массива(" + sumLeft + ") равна правой(" + sumRight + ")");
        }
    }

    //Метод 4. Трансформирует массив, прибавляя к каждому элементу число increaseNumber. Выводит результат
    private static void increaseAllElementAndPrint(int increaseNumber, int[] arr) {
        System.out.print("Массив до трансформации: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] += increaseNumber;
        }
        System.out.print("Массив после трансформации: ");
        System.out.println(Arrays.toString(arr));
    }

    //Метод 3. Заполняет все элементы массив arr числом elements. Выводит результат
    private static void insertIntoArrayAndPrint(int elements, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elements;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Метод 2. Считает колличество элементов в массиве arr больше 5. Выводит результат
    private static void calcElementOfArrayAndPrint(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                count += arr[i];
            }
        }
        System.out.println("Сумма элементов массива " + Arrays.toString(arr) + ", которые больше пяти: " + count);
    }

    //Метод 1. Выводит строку str на экран numberOfString раз
    private static void printNTimes(int numberOfString, String str) {
        for (int i = 0; i < numberOfString; i++) {
            System.out.println(str);
        }
    }

}
