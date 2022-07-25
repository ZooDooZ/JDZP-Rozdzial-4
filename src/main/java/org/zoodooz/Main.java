package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        double budget;
        double expenses;
        double totalExpenses = 0.0;
        double balance;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj swój miesięczny budżet: ");
        budget = keyboard.nextDouble();

        do{
            System.out.println("Wpisz swoje wydatki w ciągu tego miesiąca:(aby zakończyć wpisywanie wpisz '0')");
            expenses = keyboard.nextDouble();
            totalExpenses += expenses;
        }while (expenses != 0);

        balance = budget - totalExpenses;

        System.out.println("Twój miesięczny budżet: " + budget + " zł.");
        System.out.println("Twoje miesięczne wydatki: " + totalExpenses + " zł.");
        if (balance < 0){
            System.out.println("Uwaga! Twój miesięczny bilans wyszedł ujemny! - " + balance + " zł.");
        } else {
            System.out.println("Twój miesięczny bilans wyszedł dodatni! : " + balance + " zł.");
        }
    }
}