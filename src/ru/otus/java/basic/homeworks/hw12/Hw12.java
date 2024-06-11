package ru.otus.java.basic.homeworks.hw12;

/**
 * @author Sergei on 17.05.2024 15:59.
 * @progect homeworks
 */
public class Hw12 {
    public static void coreHomework12() {
        Bowl bowl = new Bowl(44);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 15);
        cats[1] = new Cat("Murzik", 10);
        cats[2] = new Cat("Markiz", 20);
        for (Cat cat : cats) {
            cat.ate(bowl);
        }
        System.out.println();
        for (Cat cat : cats) {
            cat.info();
        }
        System.out.println();
        bowl.info();
        System.out.println();
        bowl.addFood(3);
        cats[2].ate(bowl);
        System.out.println();
        cats[2].info();
        bowl.info();

    }
}
