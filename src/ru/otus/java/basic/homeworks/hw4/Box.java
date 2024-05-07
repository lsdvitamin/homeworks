package ru.otus.java.basic.homeworks.hw4;

/**
 * класс Коробка
 *
 * @author Sergei on 05.05.2024 18:04.
 * @progect homeworks
 */
public class Box {
    private int length;
    private int width;
    private int height;
    private static int weight;
    private static String color;
    protected static boolean isOpen;
    protected static String whatIsInside;

    public Box(int length, int width, int height, int weight, String color, boolean isOpen, String whatIsInside) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.isOpen = isOpen;
        this.whatIsInside = whatIsInside;
    }


    /**
     * Выводит информацию о коробке
     */
    public void printInfo() {
        String status = isOpen ? "Открыта" : "Закрыта";
        String whatIsInsid = whatIsInside.equals("") ? "пусто" : whatIsInside;
        System.out.println("Размер коробки ДxШxВ: " + length + "x" + width + "x" + +height +
                "\nВес: " + weight + "\nЦвет: " + color +
                "\nВнутри: " + whatIsInsid + "\n" + status);
    }

    /**
     * Выкидывает из коробки предмет
     */
    public static void getThrowObjectFrom() {
        if (isOpen) {
            if (whatIsInside.equals("")) {
                System.out.println("\n" + "коробка пуста, нечего выбрасывать");
            } else {
                System.out.println("\n" + whatIsInside + " выброшен из коробки");
                whatIsInside = "";
                weight -= 10;
            }
        } else {
            System.out.println("\nВы не можете выбросить " + whatIsInside + " пока коробка закрыта");
        }
    }

    /**
     * Красит коробку в другой цвет
     *
     * @param newColor новый цвет
     */
    protected static void paint(String newColor) {
        color = newColor;
        weight += 1;
        System.out.println("\nПокрасил коробку в " + newColor);
    }


    /**
     * Кладет в коробку предмет если коробка пустая. Если Полная, то выводит сообщение об этом
     *
     * @param object Предмет, который хотим положить в коробку
     */
    static void getPutSomethinпInto(String object) {
        whatIsInside = object;
        weight += 10;
        System.out.println("\nПоложили в коробку " + whatIsInside);
    }


    /**
     * Проверяет, есть ли что то в коробке
     *
     * @return
     */
    static boolean getIsFull() {
        if (whatIsInside.isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * Меняет статус коробки. Если была открыта, то закрывает. И наоборот, если была закрыта, то открывает
     */
    static void changeStatus(String action) {
        if (action.equals("close")) {
            if (isOpen) {
                isOpen = false;
                System.out.println("\nВыполнено-коробка закрыта");
            } else {
                System.out.println("\nНе выполнено-коробка уже была закрыта");
            }
        } else {
            if (!isOpen) {
                isOpen = true;
                System.out.println("\nВыполнено-коробка открыта");
            } else {
                System.out.println("\nНе выполнено-коробка уже была открыта");
            }
        }
    }

}
