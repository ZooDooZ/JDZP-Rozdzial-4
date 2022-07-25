package org.zoodooz;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {

        Scanner keyboard = new Scanner(System.in);
        int hoursTrip;
        int speed;
        double distance = 0;

        PrintWriter outputFile = new PrintWriter("Przebyta odleglosc.txt");

        do {
            System.out.println("Podaj prędkość: (km/h)");
            speed = keyboard.nextInt();
        }while (speed <=0);

        do {
            System.out.println("Podaj liczbę godzin podróży: ");
            hoursTrip = keyboard.nextInt();
        }while (hoursTrip <= 0);

        outputFile.println("Godzina \tPrzebyta odległość");
        outputFile.println("---------------------------");

        for (int i = 0; i < hoursTrip; i++){
            distance += (speed * hoursTrip) / hoursTrip;

            outputFile.println((i+1) + "\t\t\t" + distance + " km");
        }

        outputFile.close();//zakończenie jest bardzo ważne!! bez tego plik będzie pusty!!
    }
}