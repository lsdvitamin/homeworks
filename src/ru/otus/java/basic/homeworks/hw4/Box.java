package ru.otus.java.basic.homeworks.hw4;

/**
 * класс Коробка
 *
 * @author Sergei on 05.05.2024 18:04.
 * @progect homeworks
 */
public class Box {
    private static int LENGTH;
    private static int WIDTH;
    private static int HEIGHT;
    private int weight;
    private String color;
    private boolean isOpen;
    private String whatIsInside;

    public Box(int LENGTH, int WIDTH, int HEIGHT, int weight, String color, boolean isOpen, String whatIsInside) {
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.weight = weight;
        this.color = color;
        this.isOpen = isOpen;
        this.whatIsInside = whatIsInside;
    }

    public static int getLENGTH() {
        return LENGTH;
    }


    public static int getWIDTH() {
        return WIDTH;
    }


    public static int getHEIGHT() {
        return HEIGHT;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getWhatIsInside() {
        return whatIsInside;
    }

    public void setWhatIsInside(String whatIsInside) {
        this.whatIsInside = whatIsInside;
    }
    public void printInfo(){
        String status = getIsOpen() ? "Открыта":"Закрыта";
        String whatIsInsid = getWhatIsInside().equals("") ? "пусто":getWhatIsInside();
        System.out.println("Размер коробки ДxШxВ: " + getLENGTH() + "x" + getWIDTH() + "x" +  + getHEIGHT() +
                "\nВес: " + getWeight() + "\nЦвет: " + getColor() +
                "\nВнутри: " + whatIsInsid + "\n" + status);
    }
}
