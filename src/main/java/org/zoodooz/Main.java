package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int hoursTrip;
        int speed;
        double distance = 0;

        do {
            System.out.println("Podaj prędkość: (km/h)");
            speed = keyboard.nextInt();
        }while (speed <=0);

        do {
            System.out.println("Podaj liczbę godzin podróży: ");
            hoursTrip = keyboard.nextInt();
        }while (hoursTrip <= 0);

        System.out.println("Godzina \tPrzebyta odległość");
        System.out.println("---------------------------");

        for (int i = 0; i < hoursTrip; i++){
            distance += (speed * hoursTrip) / hoursTrip;

            System.out.println((i+1) + "\t\t\t" + distance + " km");
        }
    }
}