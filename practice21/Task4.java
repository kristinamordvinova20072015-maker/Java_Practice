package practice21;

import java.util.*;
import java.io.*;

public class Task4 {

    // Класс для работы с содержимым каталога
    public class DirectoryLister {

        // Метод получает список файлов и папок в указанном каталоге
        public static List<String> getDirectoryContents(String directoryPath) {
            List<String> contents = new ArrayList<>();
            File directory = new File(directoryPath);

            // Проверяем, существует ли каталог и является ли он папкой
            if (!directory.exists() || !directory.isDirectory()) {
                System.out.println("Каталог не существует или путь ведет к файлу: " + directoryPath);
                return contents;
            }

            // Получаем список файлов и папок
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    // Определяем тип объекта: файл или папка
                    String type = file.isDirectory() ? "[DIR] " : "[FILE] ";
                    contents.add(type + file.getName());
                }
            }

            // Возвращаем список содержимого каталога
            return contents;
        }

        // Метод выводит первые n элементов списка
        public static void printFirstNElements(List<String> list, int n) {

            // Проверяем, пустой ли список
            if (list.isEmpty()) {
                System.out.println("Список пуст");
                return;
            }

            System.out.println("Первые " + n + " элементов:");

            // Определяем, сколько элементов можно вывести
            int count = Math.min(n, list.size());
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }

    public static void main(String[] args) {

        // Указываем текущий каталог
        String currentDirectory = ".";

        // Получаем содержимое каталога
        List<String> directoryContents =
                DirectoryLister.getDirectoryContents(currentDirectory);

        // Выводим первые 5 элементов
        DirectoryLister.printFirstNElements(directoryContents, 5);
    }
}
