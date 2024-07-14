package ru.otus.java.basic.homeworks.hw21;

/**
 * @author Sergei on 21.06.2024 17:44.
 * @project homeworks
 */
public class Hw21 {
    public static void coreHomework21() throws InterruptedException {

        long timeStart = System.currentTimeMillis();
        System.out.println("----------------Домашнее задание #21-----------------");

        double[] bigArr = new double[100_000_000];
        Integer arrayLen = bigArr.length;

        for (int i = 0; i < arrayLen; i++) {
            bigArr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println("Время заполнения массива из " + arrayLen + " элементов: " +
                (System.currentTimeMillis() - timeStart) + "ms");
        System.out.println("Второй элемент: " + bigArr[1]);
        System.out.println("Последний элемент: " + bigArr[99_999_999]);
        System.out.println();


        double[] bigArrThread = new double[100_000_000];
        timeStart = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 24_999_999; i++) {
                bigArrThread[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 24_999_999; i < 49_999_999; i++) {
                bigArrThread[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 49_999_999; i < 74_999_999; i++) {
                bigArrThread[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 74_999_999; i < 100_000_000; i++) {
                bigArrThread[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Время заполнения массива из " + arrayLen + " элементов в 4 потока: " +
                (System.currentTimeMillis() - timeStart) + "ms");

        System.out.println("Второй элемент: " + bigArrThread[1]);
        System.out.println("Последний элемент: " + bigArrThread[99_999_999]);

    }
}
