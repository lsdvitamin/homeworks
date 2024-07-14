package ru.otus.java.basic.homeworks.hw13;

/**
 * @author Sergei on 22.05.2024 19:55.
 * @progect homeworks
 */
public enum Location {
    FOREST("густой лес"),
    PLAIN("равнина"),
    SWAMP("болото");

    private String translate;

    Location(String translate) {
        this.translate = translate;
    }

}
