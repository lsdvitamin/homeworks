package ru.otus.java.basic.homeworks.hw14;

import java.util.Arrays;

/**
 * @author Sergei on 25.05.2024 15:58.
 * @project homeworks
 */
public class Hw14 {
    public static void coreHomework14() {
        String[][] arr2d = {{"1", "5", "6", "4" }, {"2", "6", "3", "8" }, {"2", "4", "9", "1" }, {"1", "4", "9", "3" }};
        try {
            System.out.println("Сумма элементов массива = " + summArray(arr2d));
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage() + " в ячейке " + e.getRow() + ":" + e.getCol());
        } catch (AppArraySizeException e) {
            System.out.println("Массив не 4X4");
        }
    }

    /**
     * Подсчет всех суммы всех элементов квадратного массива
     *
     * @param arr2d Двумерный массив
     * @return Сумма элементов массива
     * @throws Exception
     */
    public static int summArray(String[][] arr2d) throws AppArrayDataException, AppArraySizeException {
        int sum = 0;
        int row = 0;
        int col = 0;
        try {
            if (!checkArrSquare(arr2d, 4)) {
                throw new AppArraySizeException();
            }
            for (int i = 0; i < arr2d.length; i++) {
                row = i;
                for (int j = 0; j < arr2d[i].length; j++) {
                    col = j;

                    sum += Integer.parseInt(arr2d[i][j]);
                }
            }
            return sum;
        } catch (NumberFormatException e) {
            throw new AppArrayDataException("Неверные данные", row, col);
        }
    }

    /**
     * Проверка массива на то что он квадратный
     *
     * @param arr2d    Проверяемый массив
     * @param checkCnt Сколько элементов должна быть каждая сторона квадрата массива
     * @return Вернет true если массив квадратный и равен checkCnt. Иначе - false
     */
    public static boolean checkArrSquare(String[][] arr2d, int checkCnt) {
        //Это решение преподавателя, мое было гораздо длиннее. Надо разобраться как работает!!!
        return arr2d != null && arr2d.length == 4 && Arrays.stream(arr2d).allMatch(row -> row.length == checkCnt);
    }
}