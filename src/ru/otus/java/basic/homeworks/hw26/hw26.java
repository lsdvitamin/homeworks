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

        Box<Apple> boxApple = new Box();
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple2);

        Box<Apple> boxAppe1 = new Box();
        boxAppe1.addFruit(apple2);

        Orange orange1 = new Orange(250);
        Orange orange2 = new Orange(300);
        Orange orange3 = new Orange(300);

        Box<Orange> boxOrange = new Box();
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange2);

        Box<Orange> boxOrange1 = new Box();
        boxOrange1.addFruit(orange2);

        Box<Fruit> boxFruit = new Box();
        boxFruit.addFruit(orange3);
        boxFruit.addFruit(apple3);

        Box<Fruit> boxFruit1 = new Box();
        boxFruit1.addFruit(apple3);

        System.out.println(boxApple.weight());
        System.out.println(boxOrange.weight());
        System.out.println(boxFruit.weight());

        System.out.println(boxApple.compareTo(boxOrange));
        System.out.println(boxApple.compareTo(boxFruit));
        System.out.println(boxOrange.compareTo(boxFruit));

        System.out.println("Пересыпаем boxAppe в boxFruit");
        moveFruits(boxApple, boxFruit);

        System.out.println("Пересыпаем boxAppe в boxAppe1");
        moveFruits(boxApple, boxAppe1);

        System.out.println("Пересыпаем boxOrange в boxFruit");
        moveFruits(boxOrange, boxFruit);

        System.out.println("Пересыпаем boxFruit в boxFruit1");
        moveFruits(boxFruit, boxFruit1);
    }


        private static <T extends Fruit> void moveFruits(Box<T> fromBox, Box<? super T> toBox) {
        fromBox.moveFruitsTo(toBox);
    }

}
