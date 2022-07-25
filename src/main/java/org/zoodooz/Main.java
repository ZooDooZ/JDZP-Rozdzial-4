package org.zoodooz;


import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner keyboard = new Scanner(System.in);

        int computerNumber;
        int playerNumber;

        do {
            computerNumber = randomNumber.nextInt(10)+1;

            System.out.println("Zgadnij jaką liczbę wylosował komputer z liczb 1-10: ");
            playerNumber = keyboard.nextInt();

            if (playerNumber > computerNumber) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else if (playerNumber < computerNumber) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            }
        }while (playerNumber != computerNumber);
        System.out.println("Brawo zgadłeś! Twoja liczba: " + playerNumber + " Computera Liczba: " + computerNumber);
    }
}