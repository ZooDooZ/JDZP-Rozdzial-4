package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int years;
        int monthCmOfRaifall;
        int totalCmRainfall = 0;
        double avgCmRainfall = 0.0;

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe lat: ");
            years = keyboard.nextInt();
        } while (years < 1);
        for (int i = 1; i < 13; i++){
                System.out.println("Zbieram liczbę centymetrów opadów z " + i + " miesiąca.");
            for (int j = 0 ; j < years ; j++) {
                do {
                    System.out.println("Podaj liczbę centymetórów  w " + (j + 1) + " roku:");
                    monthCmOfRaifall = keyboard.nextInt();
                }while (monthCmOfRaifall < 0);
                    totalCmRainfall += monthCmOfRaifall;
                    avgCmRainfall = (double) totalCmRainfall / (double) years;
            }
                System.out.println("Liczba miesięcy brana pod uwagę: " + years);
                System.out.println("Lączna liczba opadów w " + i + " miesiącu, w ciągu " + years + " lat: " + totalCmRainfall + " cm");
                System.out.println("Średnia opadów w danym miesiącu z całego okresu " + years + " lat:  " + avgCmRainfall + " cm." );
                System.out.println();
        }
    }
}