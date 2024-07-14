package ru.otus.java.basic.homeworks.hw11;

/**
 * @author Sergei on 14.05.2024 8:51.
 * @progect homeworks
 */
public class Dog extends Animal {

    public Dog(String name, int speedRun, int speedSwim, int durability) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.durability = durability;
        this.remainDurability = durability;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(" Вид - собака\n");
    }
}
