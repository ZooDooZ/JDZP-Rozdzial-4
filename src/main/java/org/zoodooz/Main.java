package org.zoodooz;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {

        int counter = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku: ");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            String str = inputFile.nextLine();
            counter++;
        }

        File file1 = new File(fileName);
        Scanner nextInputFile = new Scanner(file1);

            if (counter < 5) {
                while (nextInputFile.hasNext()) {
                    String str1 = nextInputFile.nextLine();
                    System.out.println(str1);
                }
            } else {
                for (int i = 0; i < 5; i++) {
                    String str2 = nextInputFile.nextLine();
                    System.out.println(str2);
                }
            }
    }
}