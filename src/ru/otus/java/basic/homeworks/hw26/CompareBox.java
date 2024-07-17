package ru.otus.java.basic.homeworks.hw26;

/**
 * @author Sergei on 14.07.2024 22:12.
 * @project all_others
 */
public class CompareBox implements Comparable<CompareBox>{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CompareBox(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(CompareBox o) {
        return this.size-o.size;
    }
}
