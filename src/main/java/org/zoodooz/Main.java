package org.zoodooz;


public class Main {
    
    public static void main(String[] args) {

        System.out.println("Stopnie Celcjusza\t|\t Stopnie Fahrenheita");
        System.out.println("---------------------------------------------");

        for (int i = 0 ; i <= 20; i++){
            double fahrenheita = ((double)9/5) * i + 32;
            System.out.printf(i + " stopie C\t\t\t|\t %.1f stopni F \n", fahrenheita);
            System.out.println("---------------------------------------------");
        }
    }
}