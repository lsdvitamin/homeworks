package ru.otus.java.basic.homeworks.hw6;

/**
 * @author Sergei on 17.05.2024 16:01.
 * @progect homeworks
 */
public class Cat {
    private String nickname;
    private int appetit;
    private boolean wellFed;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public boolean isWellFed() {
        return wellFed;
    }

    public void setWellFed(boolean wellFed) {
        this.wellFed = wellFed;
    }

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

        if (bowl.minusFoodFromBowl(appetit)) {
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
