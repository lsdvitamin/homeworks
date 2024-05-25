package ru.otus.java.basic.homeworks.hw8;

/**
 * @author Sergei on 25.05.2024 15:58.
 * @progect homeworks
 */
public class Hw8 {
    public static void coreHomework8() {
        String[][] arr2d = {{"1", "5", "6", "4" }, {"2", "6", "3", "8" }, {"f", "4", "9", "1" }, {"0", "4", "9", "3" }};
        try {
            System.out.println("Сумма элементов массива = " + summArray(arr2d));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int summArray(String[][] arr2d) throws Exception {
        int sum = 0;
        Exception AppArraySizeException;
        Exception AppArrayDataException = new NumberFormatException("Неверные данные");
        try {
            for (int i = 0; i < arr2d.length; i++) {
                for (int j = 0; j < arr2d[i].length; j++) {
                    if (i > 3 || j > 3) {
                        AppArraySizeException = new ArrayIndexOutOfBoundsException("В строке " + (i + 1) + " ошибка - " + (j + 1) + " эл. вместо четырех");
                        throw AppArraySizeException;
                    }
                    sum += Integer.parseInt(arr2d[i][j]);
                }
            }
            return sum;
        } catch (NumberFormatException e) {
            throw AppArrayDataException;
        }
    }
}