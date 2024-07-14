package ru.otus.java.basic.homeworks.hw13;

/**
 * @author Sergei on 24.05.2024 20:10.
 * @progect homeworks
 */
public interface Movable {
    default boolean move(int distance, Location location) {
        System.out.println("Иду пешком " + distance + " км. по " + location);
        return true;
    }

}
