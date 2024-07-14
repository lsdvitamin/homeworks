package ru.otus.java.basic.homeworks.hw11;

/**
 * @author Sergei on 14.05.2024 9:35.
 * @project homeworks
 */
public class Hw11 {
    public static void coreHomework11() {
        int time;
        System.out.println("--------------------------------------");
        Cat cat = new Cat("Мурзик", 7, 1500);
        cat.spendDurabilityOnOneMeterRun = 1;
        cat.info();
        time = cat.run(500);
        System.out.println(time < 0 ? "" : " за " + time + " сек.\n");
        cat.info();
        System.out.println("--------------------------------------");
        System.out.println();

        System.out.println("--------------------------------------");
        Dog dog = new Dog("Шарик", 12, 4, 4000);
        dog.spendDurabilityOnOneMeterRun = 1;
        dog.spendDurabilityOnOneMeterSwim = 2;
        dog.info();
        time = dog.run(2100);
        System.out.println(time < 0 ? "" : " за " + time + " сек.\n");
        dog.info();
        time = dog.swim(700);
        System.out.println(time < 0 ? "" : " за " + time + " сек.\n");
        dog.info();
        time = dog.swim(300);
        System.out.println(time < 0 ? "" : " за " + time + " сек.\n");
        dog.info();
        System.out.println("--------------------------------------");
        System.out.println();

        System.out.println("--------------------------------------");
        Horse horse = new Horse("Буян", 14, 5, 10000);
        horse.spendDurabilityOnOneMeterRun = 1;
        horse.spendDurabilityOnOneMeterSwim = 4;
        horse.info();
        time = horse.run(1000);
        System.out.println(time < 0 ? "" : " за " + time + " сек.\n");
        horse.info();
        time = horse.swim(400);
        System.out.println(time < 0 ? "" : " за " + time + " сек.\n");
        dog.info();
        System.out.println("--------------------------------------");
    }
}