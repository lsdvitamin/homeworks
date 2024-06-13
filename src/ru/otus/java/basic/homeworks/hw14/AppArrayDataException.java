package ru.otus.java.basic.homeworks.hw14;

/**
 * @author Sergei on 25.05.2024 19:12.
 * @progect homeworks
 */
public class AppArrayDataException extends Exception {
    private int row;
    private int col;

    public AppArrayDataException(String message, int row, int col) {
        super(message);
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
