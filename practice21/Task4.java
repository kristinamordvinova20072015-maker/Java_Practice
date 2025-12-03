package practice21;

import java.util.*;
import java.io.*;

public class Task4 {
    public class DirectoryLister {
        public static List<String> getDirectoryContents(String directoryPath) {
            List<String> contents = new ArrayList<>();
            File directory = new File(directoryPath);

            if (!directory.exists() || !directory.isDirectory()) {
                System.out.println("Каталог не существует или путь ведет к файлу: " + directoryPath);
                return contents;
            }

            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    String type = file.isDirectory() ? "[DIR] " : "[FILE] ";
                    contents.add(type + file.getName());
                }
            }

            return contents;
        }

        public static void printFirstNElements(List<String> list, int n) {
            if (list.isEmpty()) {
                System.out.println("Список пуст");
                return;
            }

            System.out.println("Первые " + n + " элементов:");
            int count = Math.min(n, list.size());
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }
    public static void main(String[] args) {
        String currentDirectory = ".";
        List<String> directoryContents = DirectoryLister.getDirectoryContents(currentDirectory);
        DirectoryLister.printFirstNElements(directoryContents, 5);
    }
}