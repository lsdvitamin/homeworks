package ru.otus.java.basic.homeworks.hw7;

/**
 * @author Sergei on 18.05.2024 13:04.
 * @progect homeworks
 */
public class Persone implements Movable{
    private final String NAME;
    private Transport currentTransport;
    private int power;

    public int getPower() {
        return power;
    }

    public Persone(String name, int power) {
        this.NAME = name;
        this.power = power;
    }

    public boolean getIn(Transport transport) {
        if (currentTransport == null) {
            currentTransport = transport;
            System.out.println(NAME + " сел в " + transport);
            return true;
        }
        System.out.println(NAME + " уже на " + currentTransport);
        return true;
    }

    public boolean getOut() {
        if (currentTransport == null) {
            System.out.println("Никуда не садился, стою");
            return false;
        }
        Transport currentTransportOld;
        currentTransportOld = currentTransport;
        currentTransport = null;
        System.out.println(NAME + " вышел из " + currentTransportOld);
        return true;
    }

}
