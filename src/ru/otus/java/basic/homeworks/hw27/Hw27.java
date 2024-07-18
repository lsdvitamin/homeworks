package ru.otus.java.basic.homeworks.hw27;

import ru.otus.java.basic.homeworks.Util;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Sergei on 17.07.2024 9:48.
 * @project all_others
 */
public class Hw27 {
    public static void coreHomework27() {
        System.out.println("----------------Домашнее задание #27-----------------");

        System.out.print("Введите имя файла: ");
        String fileName = Util.inputString();
        System.out.print("Введите искомую фразу: ");
        String phrase = Util.inputString();
        File f = new File(fileName);
        if (f.exists() && !f.isDirectory()) {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
                byte[] bytes = bufferedInputStream.readAllBytes();
                String data = new String(bytes, StandardCharsets.UTF_8);
                System.out.println("В тексте :\n" + data);
                System.out.println("\nфраза \"" + phrase + "\" встречается " + count(data, phrase) + " раз");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        } else System.out.println("Файл \"" + fileName + "\" не найден");
    }

    public static int count(String data, String phrase) {
        return (data.length() - data.replace(phrase, "").length()) / phrase.length();
    }
}