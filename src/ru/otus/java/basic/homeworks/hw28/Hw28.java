package ru.otus.java.basic.homeworks.hw28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Sergei on 18.07.2024 21:42.
 * @project all_others
 */
public class Hw28 {

    private static final Object mon = new Object();
    private static Integer stage = 0;
    private static Integer cnt = 0;

    static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void coreHomework28() throws InterruptedException {
        System.out.println("----------------Домашнее задание #28-----------------");

        executorService.execute(() -> {
            while (true) synchronized (mon) {
                while (stage != 0) {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                stage = 1;
                System.out.print("A");
                mon.notifyAll();
            }
        });

        executorService.execute(() -> {
            while (true) synchronized (mon) {
                while (stage != 1) {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                stage = 2;
                System.out.print("B");
                mon.notifyAll();
            }
        });

        executorService.execute(() -> {
            while (true) synchronized (mon) {
                while (stage != 2) {
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                stage = 0;
                cnt += 1;
                System.out.print("C");

                if (cnt == 5) {
                    System.out.println("\nПечать в потоках завершена");
                    break;
                }
                mon.notifyAll();
            }
        });

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

    }
}



