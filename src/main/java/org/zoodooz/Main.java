package org.zoodooz;


import java.util.Random;

public class Main {
    
    public static void main(String[] args) {

        int playerCounter = 0;
        int computerCounter = 0;

        Random numberRandom = new Random();

        for (int i = 1; i <= 10; i++) {
            int computerNumber = numberRandom.nextInt(6) + 1;
            int playerNumber = numberRandom.nextInt(6) + 1;

            if (computerNumber < playerNumber) {
                playerCounter++;
                System.out.println(i + " walkę: WYGRALEŚ! " + playerNumber + " : " + computerNumber);
            } else if (computerNumber > playerNumber) {
                computerCounter++;
                System.out.println(i + " walkę: WYGRYWA KOMPUTER! " + computerNumber + " : " + playerNumber);
            } else {
                System.out.println(i + " walkę: REMIS! " + computerNumber + " : " + playerNumber);
            }
        }
        if (computerCounter < playerCounter) {
            System.out.println("WYGRYWASZ CALĄ GRE! " + playerCounter + " : " + computerCounter);
        } else if (computerCounter > playerCounter) {
            System.out.println("KOMPUTER WYGRYWA CALĄ GRE! " + computerCounter + " : " + playerCounter);
        } else {
            System.out.println("PANIE I PANOWIE - REMIS! " + playerCounter + " : " + computerCounter);
        }
    }
}