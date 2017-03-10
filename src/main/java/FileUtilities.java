package main.java;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileUtilities {

    public static List<String> inputEquations(String fileName) {
        File file = new File(fileName);
        List<String> list = new LinkedList<>();

        try (Scanner scanner = new Scanner(new FileReader(file))) {

            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


    public static void outputEquations (String fileName, List<String> list) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(fileName)))){
            for (String s: list) {
                printWriter.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}