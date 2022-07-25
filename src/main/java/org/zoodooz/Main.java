package org.zoodooz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj dodatnia liczbę całkowitą niezerową: ");
        int number = keyboard.nextInt();

        int x;
        int sum = 0;

        for (x = 0; x <= number; x++){
            sum += x;
        }
        System.out.println(sum);
    }
}