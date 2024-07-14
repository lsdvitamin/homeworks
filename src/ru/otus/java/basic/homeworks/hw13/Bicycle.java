package ru.otus.java.basic.homeworks.hw13;

/**
 * @author Sergei on 18.05.2024 13:06.
 * @project homeworks
 */
public class Bicycle implements Movable {
    int power;
    private int powerConsumption;

    public Bicycle(int power, int powerConsumption) {
        this.power = power;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean move(int distance, Location location) {
        if (location.equals(Location.SWAMP)) {
            System.out.println("Велосипед не может ехать по " + location);
            return false;
        }
        if (power < distance / 100.0 * powerConsumption) {
            System.out.println("Не доехал. У велосипедиста не хватило сил чтобы проехать " + distance + " км.");
            return false;
        }
        System.out.println("Успешно проехал на велосипеде " + distance + " км. по " + location);
        return true;
    }

}
