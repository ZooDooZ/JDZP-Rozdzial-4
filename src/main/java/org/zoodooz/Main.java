package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int days;
        int penny = 1;
        int sum = 0;
        int cumulativeResult = 0;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę przepracowanych dni: ");
            days = keyboard.nextInt();
        } while (days <= 0);

        System.out.println("Dzień\t\tWynagrodzenie za dzień");

        for (int i = 1; i < 2; i++){
            System.out.println(i + "\t\t\t" + penny + " gr");
            for(int j = 2; j <= days; j++) {
                penny = penny + penny;
                System.out.println(j + "\t\t\t" + penny + " gr");
                cumulativeResult += penny;
            }
        }
        sum = penny / 100;

        System.out.printf("Zarobione pieniądze w ostatnim dniu: %,d zł\n" , sum);
        System.out.printf("Sumarycznie zarobione pieniądze w ciagu 30 dni: %,d zł" , cumulativeResult);
    }
}