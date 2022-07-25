package org.zoodooz;


import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        String pickupColour;
        int counter = 0;
        Random numberRandom = new Random();

        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            int number = numberRandom.nextInt(5);
            System.out.println("Wybierz kolor jaki mógł wybrać komputer:\n" +
                    "(Czerwony/Zielony/Niebieski/Pomarańczowy/Żółty)");
            String colour = keyboard.nextLine();
            if (number == 0){
                pickupColour = "Czerwony";
            }else if (number == 1){
                pickupColour = "Zielony";
            }else if (number == 2) {
                pickupColour = "Niebieski";
            }else if (number == 3) {
                pickupColour = "Pomarańczowy";
            } else {
                pickupColour = "Żółty";
            }
            System.out.println("Typ komputera: " + pickupColour + " Twój typ: " + colour);
            System.out.println();
            if (colour.equalsIgnoreCase(pickupColour)) {
                counter++;
            }
        }
        System.out.println("Twój wynik poprawnych odpowiedzi to: " + counter);
    }
}