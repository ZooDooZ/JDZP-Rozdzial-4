package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int number = 0;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Podaj dodatnią liczbę nie większą niż 15 a nie mniejszą niż 2: ");
            number = keyboard.nextInt();
        }while(number > 15 || number < 2);

        for (int i = 0; i < number ; i++){
            for (int j= 0; j <number; j++){
                System.out.print("X  ");
            }
            System.out.println();
    }
}