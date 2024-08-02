package ru.otus.java.basic.homeworks.hw26;

/**
 * @author Sergei on 14.07.2024 15:38.
 * @project all_others
 */
public class hw26 {
    public static void coreHomework26() {
        System.out.println("----------------Домашнее задание #26-----------------");

        Apple apple1 = new Apple(350);
        Apple apple2 = new Apple(200);
        Apple apple3 = new Apple(300);

        Box box1 = new Box();
        box1.addFruit(apple1);
        box1.addFruit(apple2);

        Orange orange1 = new Orange(250);
        Orange orange2 = new Orange(300);
        Orange orange3 = new Orange(300);

        Box box2 = new Box();
        box2.addFruit(orange1);
        box2.addFruit(orange2);

        Box box3 = new Box();
        box3.addFruit(orange3);
        box3.addFruit(apple3);

        System.out.println(box1.weight());
        System.out.println(box2.weight());
        System.out.println(box3.weight());

        System.out.println(box1.compareTo(box2));
        System.out.println(box1.compareTo(box3));
        System.out.println(box2.compareTo(box3));

        System.out.println("Пересыпаем box1 в box2");
        moveFruits(box1, box2);

        System.out.println("Пересыпаем box2 в box3");
        moveFruits(box2, box3);

        System.out.println("Пересыпаем box3 в box1");
        moveFruits(box3, box1);
    }

    private static <T extends Fruit> void moveFruits(Box<T> fromBox, Box<? super T> toBox) {
        fromBox.moveFruitsTo(toBox);
    }

}
