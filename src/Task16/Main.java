package Task16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Card> cards1 = new ArrayList<>();
        ArrayList<Card> cards2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            cards1.add(i, new Card(scanner.nextInt()));
        }
        for (int i = 5; i < 10; i++) {
            cards2.add(i - 5, new Card(scanner.nextInt()));
        }

        Player player1 = new Player(new DeckOfCards(cards1));
        Player player2 = new Player(new DeckOfCards(cards2));

        for (int i = 0; i < 107; i++) {
            if (i == 106) {
                System.out.println("Botva");
            }
            if (i % 2 == 0) {
                player1.makeMove(player2);
            }
            else {
                player2.makeMove(player1);
            }

            if (!player1.isAlive()){
                System.out.printf("second %d\n", i + 1);
                break;
            }
            else if (!player2.isAlive()){
                System.out.printf("first %d\n", i + 1);
                break;
            }
        }

    }
}