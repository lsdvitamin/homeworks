package ru.otus.java.basic.homeworks.hw4;

/**
 * класс Коробка
 *
 * @author Sergei on 05.05.2024 18:04.
 * @progect homeworks
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

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
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
        System.out.println("Размер коробки ДxШxВ: " + getLength() + "x" + getWidth() + "x" +  + getHeight() +
                "\nВес: " + getWeight() + "\nЦвет: " + getColor() +
                "\nВнутри: " + whatIsInsid + "\n" + status);
    }
}
