package ioStreams;
import java.io.*;

public class DirectoryFilesPrinter {
    public static void main(String[] args) {
        File file = new File("C://Users//User//IdeaProjects//hello_world");
        printNames(file);
    }

    static void printNames(File file) {
        if (file == null|| file.listFiles() == null || file.listFiles().length == 0) {
            System.out.println("Все плохо");
        } else {
            for (File item : file.listFiles()) {
                if (item.isDirectory()) {
                    printNames(item);
                } else {
                    System.out.println(file.getName() + ":" + item.getName());
                }
            }
        }
    }
}
