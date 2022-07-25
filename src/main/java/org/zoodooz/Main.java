package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int number;
        int smallNumber = 0;
        int bigNumber = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Program bedzie Cię pytał o wpisywanie liczb całkowitych. Wpisz ich ile chcesz a program\n" +
                        "wyszuka najmniejsza i największa wartość podaną przez Ciebie. Aby zakończyć wpisywanie liczb\n" +
                        "wpisz wartość '-99'");
        System.out.println();

        do {
            System.out.println("Podaj dowolną liczbę całkowitą: ");
            number = keyboard.nextInt();

            if (number < 0 && number < smallNumber && number != -99) {
                smallNumber = number;
            }else if (number > 0 && number > bigNumber) {
                bigNumber = number;
            }

        }while(number != -99);
        System.out.println("Twoja najmniejsza podana liczba to: " + smallNumber);
        System.out.println("Twoja największa podana liczba to: " + bigNumber);
    }
}