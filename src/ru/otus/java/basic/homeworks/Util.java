package ru.otus.java.basic.homeworks;

import java.io.*;
import java.util.Scanner;
import java.util.Set;

public class Util {

    public Util() {
    }

    /**
     * Запрашивает у пользователя ввод числа
     *
     * @return
     */
    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Запрашивает у пользователя ввод строки
     *
     * @return
     */
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    /**
     * Заполняет Set списком файлов из filesList
     *
     * @param filesList       - список файлов
     * @param filesListString - Set, который будем заполнять
     */
    public static void writeIntoFilesListString(File[] filesList, Set<String> filesListString) {
        for (File file : filesList) {
            if (file.isFile()) {
                filesListString.add(file.getName());
            }
        }
    }

    /**
     * Выводит в консоль список файлов
     *
     * @param filesList - список файлов
     */
    public static void printListOfFile(File[] filesList) {
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }

    /**
     * Добавляет фразу phrase в конец файла choseFile
     *
     * @param file   - путь к файлу  + имя самого файла
     * @param phrase - добавляемая фраза
     * @throws IOException
     */
    public static boolean addPhraseIntoFile(File file, String phrase) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(phrase + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * Выводит содержимое файла на печать
     *
     * @param file - файл
     * @throws IOException
     */
    public static void printFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
