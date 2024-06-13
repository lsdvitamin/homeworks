package ru.otus.java.basic.homeworks.hw12;

/**
 * @author Sergei on 17.05.2024 16:00.
 * @progect homeworks
 */

public class Bowl {
    private int maxFood;
    private int curFood;

    public Bowl(int maxFood) {
        this.maxFood = maxFood;
        this.curFood = maxFood;
    }

    public void addFood(int howMuchAdd) {
        if (howMuchAdd + curFood > maxFood) {
            System.out.println("Нельзя добавить " + howMuchAdd + ", миска переполнится");
            return;
        }
        curFood += howMuchAdd;
        System.out.println("Добавили в миску " + howMuchAdd + " еды");
    }

    public boolean minusFood(int howMuchMinus) {
        int remainFood = curFood - howMuchMinus;
        if (remainFood < 0) {
            return false;
        }
        curFood -= howMuchMinus;
        return true;
    }

    public void info() {
        System.out.println("В миске осталось " + curFood + " еды");
    }

}
