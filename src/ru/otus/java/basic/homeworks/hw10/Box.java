package ru.otus.java.basic.homeworks.hw10;

import static ru.otus.java.basic.homeworks.Util.inputString;

/**
 * класс Коробка
 *
 * @author Sergei on 05.05.2024 18:04.
 * @project homeworks
 */
public class Box {
    private int length;
    private int width;
    private int height;
    private int weight;
    private String color;
    private boolean isOpen;
    private String whatIsInside;

    public Box(int length, int width, int height, int weight, String color, boolean isOpen, String whatIsInside) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.isOpen = isOpen;
        this.whatIsInside = whatIsInside;
    }


    /**
     * Выводит информацию о коробке
     */
    public void printInfo() {
        String status = isOpen ? "Открыта" : "Закрыта";
        String whatIsInsid = whatIsInside.equals("") ? "пусто" : whatIsInside;
        System.out.println("Размер коробки ДxШxВ: " + length + "x" + width + "x" + +height +
                "\nВес: " + weight + "\nЦвет: " + color +
                "\nВнутри: " + whatIsInsid + "\n" + status);
    }

    /**
     * Выкидывает из коробки предмет
     */
    public void throwOutObject() {
        if (!isOpen) {
            System.out.println("\nВы не можете выбросить " + whatIsInside + " пока коробка закрыта");
            return;
        }
        if (whatIsInside.equals("")) {
            System.out.println("\n" + "коробка пуста, нечего выбрасывать");
            return;
        }
        System.out.println("\n" + whatIsInside + " выброшен из коробки");
        whatIsInside = "";
        weight -= 10;
    }

    /**
     * Красит коробку в другой цвет
     */
    public void paint() {
        System.out.print("Введите цвет в который будем красить: ");
        color = inputString();
        weight += 1;
        System.out.println("\nПокрасил коробку в " + color);
    }


    /**
     * Кладет в коробку предмет если коробка пустая. Если Полная, то выводит сообщение об этом
     */
    public void putSomething() {
        if (!isOpen) {
            System.out.println("\nНельзя положить что-то в закрытую коробку");
            return;
        }
        if (!whatIsInside.isEmpty()) {
            System.out.println("\nКоробка занята. Выбросите оттуда " + whatIsInside);
            return;
        }
        System.out.print("Введите название предмета: ");
        whatIsInside = inputString();
        weight += 10;
        System.out.println("\nПоложили в коробку " + whatIsInside);

    }

    /**
     * Закрывает коробку
     */
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("\nВыполнено-коробка закрыта");
        } else {
            System.out.println("\nНе выполнено-коробка уже была закрыта");
        }
    }

    /**
     * Открывает коробку
     */
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("\nВыполнено-коробка открыта");
        } else {
            System.out.println("\nНе выполнено-коробка уже была открыта");
        }
    }

}
