package ru.otus.java.basic.homeworks.hw26;

/**
 * @author Sergei on 14.07.2024 16:40.
 * @project all_others
 */
public class Orange extends Fruit{
    String variety;
    String color;
    Integer weight;
    Double cost;

    public Orange(String variety, String color, Integer weight, Double cost) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.cost = cost;
    }

    public Integer getWeight() {
        return this.weight;
    }

}
