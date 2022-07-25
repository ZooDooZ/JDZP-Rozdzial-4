package org.zoodooz;


import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int computerNumber = 0;
        int playerNumber = 0;
        int counter= 0;

        Random randomNumber = new Random();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Zgadnij jaką liczbę wylosował komputer z liczb 1-10: ");
        do {
            computerNumber = randomNumber.nextInt(10)+1;
            playerNumber = keyboard.nextInt();

            if (playerNumber > computerNumber) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else if (playerNumber < computerNumber) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            }
            counter++;
        } while (computerNumber != playerNumber);
        System.out.println("Brawo zgadłeś! Twoja liczba: " + playerNumber + " Computera Liczba: " + computerNumber);
        System.out.println("Liczba prób: " + counter);
    }
}