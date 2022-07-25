package org.zoodooz;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku: ");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);
        Scanner inoutFile = new Scanner(file);

        int counter = 1;

        while (inoutFile.hasNext()){
            String line = inoutFile.nextLine();
            System.out.println(counter + " : " + line);
            counter++;
        }
    }
}