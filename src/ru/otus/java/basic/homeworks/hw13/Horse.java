package ru.otus.java.basic.homeworks.hw13;

/**
 * @author Sergei on 18.05.2024 13:05.
 * @project homeworks
 */
public class Horse implements Movable {
    private int power;

    private double powerConsumption;

    public Horse(int power, double powerConsumption) {
        this.power = power;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean move(int distance, Location location) {
        if (location.equals(Location.SWAMP)) {
            System.out.println("Лошадь не может ехать по " + location);
            return false;
        }
        if (power < powerConsumption / 100.0 * distance) {
            System.out.println("У лошади не хватило сил чтобы проехать " + distance + " км.");
            return false;
        }
        System.out.println("Успешно проехал на лошади " + distance + " км. по " + location);
        return true;
    }

}
