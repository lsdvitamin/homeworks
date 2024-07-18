package ru.otus.java.basic.homeworks.hw26;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei on 14.07.2024 16:41.
 * @project all_others
 */
public class BoxForApple implements Comparable<CompareBox>{
        private List<Apple> apples = new ArrayList();

    public BoxForApple(Apple apple) {
        this.apples.add(apple);
    }

    public void addApples(Apple apple) {
        this.apples.add(apple);
    }

    public Integer weight(){
        Integer weight = 0;
        for (Apple apple: apples){
            weight += apple.weight;
        }
        return weight;
    }

    @Override
    public int compareTo(CompareBox compareBox) {
        return 0;
    }
}
