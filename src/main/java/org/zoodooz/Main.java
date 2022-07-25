package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int startPopulationNr;
        int daysOfMultiplication;
        int counter = 2;
        double avgDailyPopGrowth;
        double totalPopulation = 0.0;

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Podaj początkową liczbę organizmów: ");
            startPopulationNr = keyboard.nextInt();
        } while (startPopulationNr < 2);

        do {
            System.out.println("Podaj średni dzienny przyrost populajci w procentach: ");
            avgDailyPopGrowth = keyboard.nextDouble();
            avgDailyPopGrowth = avgDailyPopGrowth /100;
        }while (avgDailyPopGrowth < 0);

        do{
            System.out.println("Podaj długość dni przez jakie organizmy sie rozmnażają: ");
            daysOfMultiplication = keyboard.nextInt();
        } while(daysOfMultiplication < 1);

        System.out.println("Dzień 1 - Populacja wynosi " + startPopulationNr + " organizmy/ów.");
        for (int i = 2; i <= daysOfMultiplication; i++){
            double dayPopulation = startPopulationNr * avgDailyPopGrowth;
            totalPopulation = startPopulationNr + dayPopulation;
            System.out.println("Dzień " + counter + " - Populacja wynosi " + (int)totalPopulation + " organizmy/ów.");
            startPopulationNr = (int) totalPopulation;
            counter++;
        }
    }
}