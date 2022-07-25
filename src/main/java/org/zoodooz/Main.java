package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 1: ");
        int shop1 = keyboard.nextInt();
        shop1 = shop1 /100;

        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 2: ");
        int shop2 = keyboard.nextInt();
        shop2 = shop2 /100;

        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 3: ");
        int shop3 = keyboard.nextInt();
        shop3 = shop3 /100;

        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 4: ");
        int shop4 = keyboard.nextInt();
        shop4 = shop4 /100;

        System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr 5: ");
        int shop5 = keyboard.nextInt();
        shop5 = shop5 /100;

        System.out.println("WYKRES SLUPKOWY Z POZIOMEM SPRZEDAŻY");
        System.out.print("Sklep nr 1: ");
        for (int i = 0; i < shop1; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Sklep nr 2: ");
        for (int i = 0; i < shop2; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Sklep nr 3: ");
        for (int i = 0; i < shop3; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Sklep nr 4: ");
        for (int i = 0; i < shop4; i++){
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Sklep nr 5: ");
        for (int i = 0; i < shop5; i++){
            System.out.print("*");
        }
    }
}