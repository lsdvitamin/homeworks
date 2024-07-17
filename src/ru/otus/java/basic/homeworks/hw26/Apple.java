package ru.otus.java.basic.homeworks.hw26;

import java.util.List;

/**
 * @author Sergei on 14.07.2024 16:40.
 * @project all_others
 */
public class Apple  extends Fruit{
    String variety;
    String color;
    Integer weight;
    Double cost;

    public Apple(String variety, String color, Integer weight, Double cost) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.cost = cost;
    }
}
