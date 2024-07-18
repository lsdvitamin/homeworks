package ru.otus.java.basic.homeworks.hw26;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei on 14.07.2024 16:41.
 * @project all_others
 */
public class BoxForOrange  implements Comparable<CompareBox>{
    private List<Orange> oranges = new ArrayList();

    public BoxForOrange(Orange orange) {
        this.oranges.add(orange);
    }

    public void addOrange(Orange orange) {
        this.oranges.add(orange);
    }

    public Integer weight(){
        Integer weight = 0;
        for (Orange orange: oranges){
            weight += orange.weight;
        }
        return weight;
    }

    @Override
    public int compareTo(CompareBox compareBox) {
        return 0;
    }
}
