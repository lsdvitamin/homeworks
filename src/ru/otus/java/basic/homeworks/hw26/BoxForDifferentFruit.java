package ru.otus.java.basic.homeworks.hw26;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei on 14.07.2024 19:25.
 * @project all_others
 */
public class BoxForDifferentFruit<T> implements Comparable<CompareBox>{
    private List<T> fruits = new ArrayList();

    public BoxForDifferentFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public void addDifferentFruit(T fruit) {
        this.fruits.add(fruit);
    }

/*    public Integer weight(){
        Integer weight = 0;
        for (T fruit: fruits){
            weight += fruit.();
        }
        return weight;
    }*/

    @Override
    public int compareTo(CompareBox compareBox) {
        return 0;
    }
}