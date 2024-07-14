package ru.otus.java.basic.homeworks.hw11;

/**
 * @author Sergei on 14.05.2024 8:50.
 * @project homeworks
 */
public class Cat extends Animal {
    public Cat(String name, int speedRun, int durability) {
        this.name = name;
        this.speedRun = speedRun;
        this.durability = durability;
        this.remainDurability = durability;
    }


    @Override
    public int swim(int distance) {
        System.out.println(name + " не умеет плавать");
        return 0;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(" Вид - кот\n");
    }

}
