package ru.otus.java.basic.homeworks.hw12;

/**
 * @author Sergei on 17.05.2024 16:01.
 * @progect homeworks
 */
public class Cat {
    private String nickname;
    private int appetit;
    private boolean wellFed;

    public Cat(String nickname, int appetit) {
        this.nickname = nickname;
        this.appetit = appetit;
        this.wellFed = false;
    }

    public void ate(Bowl bowl) {
        if (wellFed) {
            System.out.println("Кот " + nickname + " не голоден");
            return;
        }

        if (bowl.minusFood(appetit)) {
            wellFed = true;
            System.out.println("Кот " + nickname + " съел " + appetit + " еды");
            return;
        }

        System.out.println("Кот " + nickname + " хотел поесть, но ему не хватило еды");
    }

    public void info() {
        System.out.println("Кот " + nickname + (wellFed ? " сытый" : " голодный"));
    }
}
