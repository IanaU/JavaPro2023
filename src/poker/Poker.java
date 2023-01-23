package poker;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {

        int numberOfCards = 5;
        int numberOfPlayers =0 ;

        String[] cardSuit = {"Черва", "Бубен", "Пика", "Треф"};

        String[] cardName = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Королева", "Король", "Туз"};
         // карты в колоде
        int n = cardSuit.length * cardName.length;


        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");

            if(sc.hasNextInt()){
                numberOfPlayers = sc.nextInt();
                if(numberOfCards * numberOfPlayers <= n){
                    break;

                } else {
                    if (numberOfPlayers ==0){

                        System.out.println("Игра прекращена.");
                        break;

                    } else if (numberOfPlayers<0){

                        System.out.println("Число игроков не может быть меньше 0");

                    } else{

                        System.out.println("Слишком много игроков!");
                    }
                }

            } else{
                System.out.println("Ваше число слишком большое!");

            }
        }


        // колода
        String[] deck = new String[n];
        for (int i = 0; i < cardName.length; i++) {
            for (int j = 0; j < cardSuit.length; j++) {
                deck[cardSuit.length*i + j] = cardName[i] + " " + cardSuit[j];
            }
        }


        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }


        for (int i = 0; i < numberOfPlayers * numberOfCards; i++) {
            System.out.println(deck[i]);
            if (i % numberOfCards == numberOfCards - 1)
                System.out.println();
        }
    }
}