package org.zoodooz;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {


        char outputChar; //pobrany znak z pytania
        char charWord; //pobrany znak z petli
        int repeatChar = 0; //ilość powtórzeń znaku

        Scanner keybaord = new Scanner(System.in);

        System.out.println("Wprowadź dowolny wyraz z małych liter: ");
        String word = keybaord.nextLine();

        System.out.println("Wprowadź jeden znak: (np: a,b,c itp. a ja odpowiem ile razy ten znak jest w poprzednim wyrazie) ");
        String selectedChar = keybaord.nextLine();
        outputChar = selectedChar.charAt(0);

        for (int i = 0; i < word.length(); i++){ //przejście po podanym wyrazie
            charWord = word.charAt(i); //pobieramy pojedynczy znak z wyrazu
            if(charWord ==outputChar){
                repeatChar++; //jeśli wyrażenie z if będzie true doda nam do zmiennej liczbę znaków powtórzonych w wyrazie
            }
        }
        System.out.println("Litera " + outputChar + " występuje " + repeatChar + " razy.");
    }
}