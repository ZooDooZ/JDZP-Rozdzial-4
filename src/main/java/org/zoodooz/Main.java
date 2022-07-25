package org.zoodooz;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {

        int repeatChar = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku: ");
        String fileName = keyboard.nextLine();

        System.out.println("Wprowadź dowolny znak: ");
        String str = keyboard.nextLine();
        char selectedChar = str.charAt(0);

        PrintWriter outputFile = new PrintWriter(fileName);

        outputFile.println("Filip Sokołowski");
        outputFile.println("Brunon Sokołowski");
        outputFile.println("Amelia Sokołowska");
        outputFile.println("Beata Sokołowska");
        outputFile.println("Józef Sokołowski");


        outputFile.close();
        System.out.println("Plik został zapisany!");
        System.out.println();

        System.out.println("Otwieram plik ponownie aby zliczyć wszystkie znaki: [" + selectedChar + "] w tym pliku.");
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()){
            String dataFromFile = inputFile.nextLine();
            for(int i = 0; i < dataFromFile.length(); i++){
               char charWord = dataFromFile.charAt(i);
               if(charWord == selectedChar){
                   repeatChar++;
               }
            }
        }
        System.out.println("W zapisanym pliku znak: [" + selectedChar + "] powtórzony został: " + repeatChar + " razy.");
    }
}