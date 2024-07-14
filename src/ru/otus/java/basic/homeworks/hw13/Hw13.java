package ru.otus.java.basic.homeworks.hw13;

/**
 * @author Sergei on 18.05.2024 10:41.
 * @project homeworks
 */
public class Hw13 {
    public static void coreHomework13() {
        Car car;
        Bicycle bicycle;
        Rover rover;
        Horse horse;
        Movable mover;

        Person bob = new Person("Bob", 100);
        System.out.println("------------------------------------");
        bob.getOut();
        mover = bob;
        System.out.println(mover.move(1000, Location.SWAMP));

        System.out.println("------------------------------------");
        car = new Car(60, 5.8);
        bob.getIn(Transport.CAR);
        mover = car;
        System.out.println(mover.move(1000, Location.PLAIN));

        System.out.println("------------------------------------");
        bob.getOut();
        bicycle = new Bicycle(bob.getPower(), 20);
        bob.getIn(Transport.BICYCLE);
        mover = bicycle;
        System.out.println(mover.move(510, Location.FOREST));

        System.out.println("------------------------------------");
        horse = new Horse(100, 30);
        bob.getOut();
        bob.getIn(Transport.HORSE);
        mover = horse;
        System.out.println(mover.move(1500, Location.SWAMP));

        System.out.println("------------------------------------");
        rover = new Rover(100, 14.8);
        bob.getOut();
        bob.getIn(Transport.ROVER);
        mover = rover;
        System.out.println(mover.move(500, Location.SWAMP));



    }


}
