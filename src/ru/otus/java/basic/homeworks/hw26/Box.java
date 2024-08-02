package ru.otus.java.basic.homeworks.hw26;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei on 14.07.2024 19:25.
 * @project all_others
 */
public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {
    private List<T> fruits = new ArrayList();

    public Box() {
    }

    public Box(T fruit) {
        this.fruits.add(fruit);
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public Integer weight() {
        Integer weight = 0;
        for (T fru : fruits) {
            weight += fru.weight;
        }
        return weight;
    }

    public void moveFruitsTo(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }


    @Override
    public int compareTo(Box<? extends Fruit> anotherBox) {
        return Double.compare(this.weight(), anotherBox.weight());
    }
}