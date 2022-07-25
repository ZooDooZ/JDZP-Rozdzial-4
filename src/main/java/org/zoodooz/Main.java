package org.zoodooz;


import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int numberOfSign1 = -1;
        int numberOfSign2 = -1;
        int numberOfSign3 = -1;
        String sign1;
        String sign2;
        String sign3;
        String answer;
        int winMoney = -1;
        int totalMoneyYouPayIn = 0;
        int totalMoneyYouWin = 0;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Jaką kwotę obstawiasz w tej grze?");
            int money = keyboard.nextInt();
            System.out.println("Obstawiasz " + money + " zł.");

            Random randomNumber = new Random();

            numberOfSign1 = randomNumber.nextInt(6);
            numberOfSign2 = randomNumber.nextInt(6);
            numberOfSign3 = randomNumber.nextInt(6);

            if (numberOfSign1 == numberOfSign2 && numberOfSign1 == numberOfSign3) {
                winMoney = money * 3;
            } else if (numberOfSign1 == numberOfSign2) {
                winMoney = money * 2;
            } else if (numberOfSign1 == numberOfSign3) {
                winMoney = money * 2;
            } else if (numberOfSign2 == numberOfSign3) {
                winMoney = money * 2;
            } else {
                winMoney = 0;
            }

            if (numberOfSign1 == 0) {
                sign1 = "Wiśnie";
            } else if (numberOfSign1 == 1) {
                sign1 = "Pomarańcze";
            } else if (numberOfSign1 == 2) {
                sign1 = "Śliwki";
            } else if (numberOfSign1 == 3) {
                sign1 = "Dzwonki";
            } else if (numberOfSign1 == 4) {
                sign1 = "Melony";
            } else {
                sign1 = "Bary";
            }
            System.out.print(" | " + sign1 + " | ");

            if (numberOfSign2 == 0) {
                sign2 = "Wiśnie";
            } else if (numberOfSign2 == 1) {
                sign2 = "Pomarańcze";
            } else if (numberOfSign2 == 2) {
                sign2 = "Śliwki";
            } else if (numberOfSign2 == 3) {
                sign2 = "Dzwonki";
            } else if (numberOfSign2 == 4) {
                sign2 = "Melony";
            } else {
                sign2 = "Bary";
            }
            System.out.print(" | " + sign2 + " | ");

            if (numberOfSign3 == 0) {
                sign3 = "Wiśnie";
            } else if (numberOfSign3 == 1) {
                sign3 = "Pomarańcze";
            } else if (numberOfSign3 == 2) {
                sign3 = "Śliwki";
            } else if (numberOfSign3 == 3) {
                sign3 = "Dzwonki";
            } else if (numberOfSign3 == 4) {
                sign3 = "Melony";
            } else {
                sign3 = "Bary";
            }
            System.out.print(" | " + sign3 + " | ");

            System.out.println(numberOfSign1 + " " + numberOfSign2 + " " + numberOfSign3);
            System.out.println("Twoja wygrana to: " + winMoney + " zł.");

            keyboard.nextLine();
            System.out.println("CZY CHCESZ ZAGRAĆ PONOWNIE (Tak/Nie)?");
            answer = keyboard.nextLine();

            totalMoneyYouPayIn += money;
            totalMoneyYouWin += winMoney;
        } while (answer.equalsIgnoreCase("tak"));

        System.out.println("Twoja łączna kwota jaką włożyłeś w gry to: " + totalMoneyYouPayIn + " zł.");
        System.out.println("Twoja łączna kwota jaką udało Ci sie wygrać: " + totalMoneyYouWin + " zł.");

        if (totalMoneyYouWin < 0){
            System.out.println("Masz ujemny bilans! Straciłeś/aś " + totalMoneyYouWin + " zł.");
        } else {
            System.out.println("Masz dodatni bilans! Dzięki grze zyskałeś/aś: " + (totalMoneyYouWin - totalMoneyYouPayIn) + " zł.");
        }
    }
}