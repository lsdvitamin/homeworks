package ru.otus.java.basic.homeworks.hw13;

/**
 * @author Sergei on 18.05.2024 13:05.
 * @project homeworks
 */
public class Car implements Movable {
    private int fuelLevel;

    private double fuelConsumption;

    public Car(int fuelLevel, double fuelConsumption) {
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean move(int distance, Location location) {
        if (location.equals(Location.FOREST) || location.equals(Location.SWAMP)) {
            System.out.println("Машина не может ехать по " + location);
            return false;
        }
        if (fuelLevel < fuelConsumption / 100.0 * distance) {
            System.out.println("Машина не доехала. Не хватило топлива чтобы проехать " + distance + " км.");
            return false;
        }
        System.out.println("Успешно проехали на машине " + distance + " км. по " + location);
        return true;
    }

}

