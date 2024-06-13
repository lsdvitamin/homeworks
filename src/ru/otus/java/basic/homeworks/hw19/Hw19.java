package ru.otus.java.basic.homeworks.hw19;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static ru.otus.java.basic.homeworks.Util.*;

/**
 * @author Sergei on 11.06.2024 12:28.
 * @progect homeworks
 */
public class Hw19 {

    public static void coreHomework19() throws IOException {

        System.out.println("----------------Домашнее задание #19-----------------");

        File path = new File("src", "files");
        String directoryPath = path.getAbsolutePath();

        FilenameFilter txtFilter = new FilenameFilter() {
            public boolean accept(File path, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        File[] filesList = path.listFiles(txtFilter);
        Set<String> filesListString = new HashSet<>();

        writeIntoFilesListString(filesList, filesListString);

        printListOfFile(filesList);

        System.out.print("Введите имя файла с которым будете работать: ");
        String choseFile;
        boolean correctFile;

        do {
            choseFile = inputString();
            correctFile = filesListString.contains(choseFile);
            if (!correctFile) {
                System.out.println("Нет такого файла, попробуйте ввести снова");
            }
        } while (!correctFile);


        System.out.println("Содержимое файла: ");
        File file = new File(directoryPath, choseFile);

        printFile(file);

        System.out.print("\nВведите фразу, которую хотите добавить в файл: ");
        String phrase = inputString();

        if (addPhraseIntoFile(file, phrase)) {
            System.out.println("\nФраза успешно добавлена в конец файла\n");
        }
        printFile(file);

    }


}