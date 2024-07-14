package ru.otus.java.basic.homeworks.hw13;

/**
 * @author Sergei on 22.05.2024 20:02.
 * @progect homeworks
 */
public enum Transport {
    CAR(0),
    HORSE(1),
    BICYCLE(2),
    ROVER(3);

    private int codTransport;

    Transport(int codTransport) {
        this.codTransport = codTransport;
    }
}
