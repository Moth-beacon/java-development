package com.pluralsight;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

        System.out.print("Enter name for Player 1: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Enter name for Player 2: ");
        Player player2 = new Player(scanner.nextLine());

        // Deal two cards to each player
        for (int i = 0; i < 2; i++) {
            player1.getHand().deal(deck.dealCard());
            player2.getHand().deal(deck.dealCard());
        }

        // Show hands
        System.out.println("\n" + player1.getName() + "'s Hand:");
        player1.getHand().print();
        int player1Score = player1.getHand().getValue();
        System.out.println("Total: " + player1Score);

        System.out.println("\n" + player2.getName() + "'s Hand:");
        player2.getHand().print();
        int player2Score = player2.getHand().getValue();
        System.out.println("Total: " + player2Score);

        // Determine winner
        System.out.println("\n--- Result ---");
        if (player1Score > 21 && player2Score > 21) {
            System.out.println("Both players busted!");
        } else if (player1Score > 21) {
            System.out.println(player2.getName() + " wins!");
        } else if (player2Score > 21) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1Score > player2Score) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2Score > player1Score) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
