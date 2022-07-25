package org.zoodooz;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku do odczytu: ");
        String fileName = keyboard.nextLine();

        File file = new File(fileName); //plik do odczytu czyli wejsciowy
        Scanner inputFile = new Scanner(file);

        PrintWriter printWriter = new PrintWriter("duze litery.txt");

        while (inputFile.hasNext()){
            String line = inputFile.nextLine();
            String bigLine = line.toUpperCase();
            System.out.println(bigLine);
            printWriter.println(bigLine);
        }
        printWriter.close();
    }
}