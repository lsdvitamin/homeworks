package ru.otus.java.basic.homeworks.hw11;

/**
 * @author Sergei on 14.05.2024 8:39.
 * @project homeworks
 * @name Кличка животного
 * @speedRun Скорость с которой животьное может бежать
 * @speedSwim Скорость с которой животьное может плыть
 * @durability Выносливость
 * @remainDurability Остаток выносливости
 * @sumSpentDurability Выносливости потрачено
 * @swam Сколько метров животное проплыло
 * @ran Сколько метров животное пробежало
 * @spendDurabilityOnOneMeterRun Сколько единиц животное тратит на один метр бега
 * @spendDurabilityOnOneMeterSwim Сколько единиц животное тратит на один метр плавания
 * @nowSpentDurability Потрачено единиц выносливости в этом действии
 */
public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int durability;
    int remainDurability;
    int sumSpentDurability;
    int swam;
    int ran;
    int spendDurabilityOnOneMeterRun;
    int spendDurabilityOnOneMeterSwim;
    int nowSpentDurability;


    public String getName() {
        return name;
    }

    /**
     * Считает время, количество выносливости, потраченное на пробежку и остаток выносливости
     *
     * @param distance расстояние в метрах
     * @return время, потраченное на пробежку (если не хватило сил, то вернуть -1)
     */
    public int run(int distance) {
        int time = -1;
        if (durability - sumSpentDurability - distance * spendDurabilityOnOneMeterRun >= 0) {
            nowSpentDurability = distance * spendDurabilityOnOneMeterRun;
            sumSpentDurability += nowSpentDurability;
            remainDurability = durability - sumSpentDurability;
            ran += distance;
            time = distance / speedRun;
            System.out.print(name + " пробежал " + distance + " метров и потратил " + nowSpentDurability + " ед. выносливости");
            return time;
        }
        System.out.print(name + " бежал " + distance + " м. и недобежал - устал\n");
        remainDurability = 0;
        sumSpentDurability = durability;
        return -1;
    }

    /**
     * Считает время, количество выносливости, потраченное на заплыв и остаток выносливости
     *
     * @param distance расстояние в метрах
     * @return время, потраченное на заплыв (если не хватило сил, то вернуть -1)
     */
    public int swim(int distance) {
        int time = -1;
        if (durability - sumSpentDurability - distance * spendDurabilityOnOneMeterSwim >= 0) {
            swam += distance;
            nowSpentDurability = distance * spendDurabilityOnOneMeterSwim;
            sumSpentDurability += nowSpentDurability;
            remainDurability = durability - sumSpentDurability;
            time = distance / speedSwim;
            System.out.print(name + " проплыл " + distance + " метров и потратил " + nowSpentDurability + " ед. выносливости");
            return time;
        }
        System.out.print(name + " плыл " + distance + " м. и недоплыл - устал\n");
        remainDurability = 0;
        sumSpentDurability = durability;
        return -1;
    }

    /**
     * Выводит информацию о животном
     */
    public void info() {
        System.out.println("Информация о животном\n Кличка: " + name + "\n Скорость бега: " + speedRun + " м/с" +
                "\n Скорость плавания: " + speedSwim + " м/с \n Выносливость: " + durability + " ед.\n" + " Пробежал " +
                ran + " м.\n Проплыл: " + swam + " м.\n" + " Потратил всего сил: " + sumSpentDurability +
                " ед.\n Остаток сил: " + remainDurability + " ед.");

    }

}