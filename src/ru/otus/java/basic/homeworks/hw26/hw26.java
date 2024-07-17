package ru.otus.java.basic.homeworks.hw26;

/**
 * @author Sergei on 14.07.2024 15:38.
 * @project all_others
 */
public class hw26 {
    public static void coreHomework26() {
        System.out.println("----------------Домашнее задание #26-----------------");

        Apple apple1 = new Apple("Антоновка", "зеленое",350, 100.2);
        Apple apple2 = new Apple("Пипин", "красное",200, 90.5);
        Apple apple3 = new Apple("Синап", "желтое",300, 110.7);

        BoxForApple boxForApple = new BoxForApple(apple1);
        boxForApple.addApples(apple2);
        boxForApple.addApples(apple3);

        Orange orange1 = new Orange("Валенсия", "желтый",250, 120.0);
        Orange orange2 = new Orange("Королек", "оранжевый",400, 130.0);

        BoxForOrange boxForOrange = new BoxForOrange(orange1);
        boxForOrange.addOrange(orange2);

        BoxForDifferentFruit boxForDifferentFruit = new BoxForDifferentFruit(apple1);
        boxForDifferentFruit.addDifferentFruit(orange2);
        boxForDifferentFruit.addDifferentFruit(apple2);
        boxForDifferentFruit.addDifferentFruit(orange1);
        boxForDifferentFruit.addDifferentFruit(orange2);


        System.out.println(boxForApple.weight());
        System.out.println(boxForOrange.weight());

    }
}
