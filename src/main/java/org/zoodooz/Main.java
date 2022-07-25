package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        double occupancyLevel = 0.0;
        int numberOfOccupiedRooms = 0;
        int totalRooms = 0;
        int numberOfFloors = 0;
        int emptyRooms = 0;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę pięter: ");
            numberOfFloors = keyboard.nextInt();
        } while (numberOfFloors <= 0);

        for (int i = 0; i < numberOfFloors; i++) {
            do {
                System.out.println("Wprowadź liczbę wszystkich pokoi na piętrze " + (i+1) + ": " );
                totalRooms = keyboard.nextInt();

            } while (totalRooms < 10);
            do {
                System.out.println("Wprowadź liczbę zajętych pokoi na piętrze " + (i+1) + ": ");
                numberOfOccupiedRooms = keyboard.nextInt();
            } while (numberOfOccupiedRooms > totalRooms);

            totalRooms += totalRooms + totalRooms;
            numberOfOccupiedRooms += numberOfOccupiedRooms + numberOfOccupiedRooms;
            emptyRooms = totalRooms - numberOfOccupiedRooms;
            occupancyLevel = (double)numberOfOccupiedRooms / (double)totalRooms;
        }
        System.out.println("Wszystkich pokoi w hotelu jest: " + totalRooms);
        System.out.println("Zajętych w hotelu pokoi jest: " + numberOfOccupiedRooms);
        System.out.println("Pustych w hotelu pokoi jest: " + emptyRooms);
        System.out.printf("Poziom obłożenia hotelu: %.2f %%", (occupancyLevel*100));
    }
}