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
    private static boolean isOpen;
    private static String whatIsInside;

    public Box(int length, int width, int height, int weight, String color, boolean isOpen, String whatIsInside) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.isOpen = isOpen;
        this.whatIsInside = whatIsInside;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {Box.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Box.color = color;
    }

    public static boolean getIsOpen() {
        return isOpen;
    }

    public static void setIsOpen(boolean isOpen) {
        Box.isOpen = isOpen;
    }

    public static String getWhatIsInside() {
        return whatIsInside;
    }

    public static void setWhatIsInside(String whatIsInside) {
        Box.whatIsInside = whatIsInside;
    }

    /**
     * Выводит информацию о коробке
     */
    public void printInfo(){
        String status = getIsOpen() ? "Открыта":"Закрыта";
        String whatIsInsid = getWhatIsInside().equals("") ? "пусто":getWhatIsInside();
        System.out.println("Размер коробки ДxШxВ: " + getLength() + "x" + getWidth() + "x" +  + getHeight() +
                "\nВес: " + getWeight() + "\nЦвет: " + getColor() +
                "\nВнутри: " + whatIsInsid + "\n" + status);
    }

    /**
     * Выкидывает из коробки предмет
     */
    public static void getThrowObjectFromBox() {
        if (getIsOpen()) {
            if (getWhatIsInside().equals("")) {
                System.out.println("\n" + "коробка пуста, нечего выбрасывать");
            } else {
                System.out.println("\n" + getWhatIsInside() + " выброшен из коробки");
                setWhatIsInside("");
                setWeight(getWeight() - 10);
            }
        } else {
            System.out.println("\nВы не можете выбросить " + getWhatIsInside() + " пока коробка закрыта");
        }
    }

    /**
     * Красит коробку в другой цвет
     *
     * @param newColor новый цвет
     */
    protected static void paintBox(String newColor) {
        setColor(newColor);
        setWeight(getWeight() + 1);
        System.out.println("\nПокрасил коробку в " + newColor);
    }


    /**
     * Кладет в коробку предмет если коробка пустая. Если Полная, то выводит сообщение об этом
     *
     * @param object Предмет, который хотим положить в коробку
     */
    static void getPutSomethinпIntoBox(String object) {
        setWhatIsInside(object);
        setWeight(getWeight() + 10);
        System.out.println("\nПоложили в коробку " + getWhatIsInside());
    }


    /**
     * Проверяет, есть ли что то в коробке
     *
     * @return
     */
    static boolean getBoxIsFull() {
        if (getWhatIsInside().isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * Меняет статус коробки. Если была открыта, то закрывает. И наоборот, если была закрыта, то открывает
     */
    static void changeStatusBox(String action) {
        if (action.equals("close")) {
            if (getIsOpen()) {
                setIsOpen(false);
                System.out.println("\nВыполнено-коробка закрыта");
            } else {
                System.out.println("\nНе выполнено-коробка уже была закрыта");
            }
        } else {
            if (!getIsOpen()) {
                setIsOpen(true);
                System.out.println("\nВыполнено-коробка открыта");
            } else {
                System.out.println("\nНе выполнено-коробка уже была открыта");
            }
        }
    }

}
