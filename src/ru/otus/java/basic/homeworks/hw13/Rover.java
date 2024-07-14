package ru.otus.java.basic.homeworks.hw13;

/**
 * @author Sergei on 18.05.2024 13:07.
 * @project homeworks
 */
public class Rover implements Movable {
    private int fuelLevel;

    private double fuelConsumption;

    public Rover(int fuelLevel, double fuelConsumption) {
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean move(int distance, Location location) {
        if (fuelLevel < fuelConsumption / 100.0 * distance) {
            System.out.println("Не хватило топлива чтобы проехать на вездеходе" + distance + " км.");
            return false;
        }
        if (fuelLevel < fuelConsumption / 100.0 * distance) {
            System.out.println("Вездеход не доехал. Не хватило топлива чтобы проехать " + distance + " км.");
            return false;
        }
        System.out.println("Успешно проехал на вездеходе " + distance + " км. по " + location);
        return true;
    }

}
