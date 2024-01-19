package com.ilp.utility;

import java.util.Scanner;

import com.ilp.entity.Game;
import com.ilp.entity.MultiPlayerGame;
import com.ilp.entity.SinglePlayerGame;
import com.ilp.services.CreditCardPayment;
import com.ilp.services.PayPalPayment;
import com.ilp.interfaces.GameCatalog;
import com.ilp.services.CatalogServices;

public class GameStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCatalog catalog = new CatalogServices();
        Game game = null;

        // Displaying the catalog
        catalog.displayCatalog();

        // Selecting games for purchase
        System.out.println("Select the game to purchase:");
        System.out.println("1. Ghostrunner");
        System.out.println("2. Sekiro");
        
        int gameChoice = scanner.nextInt();

        switch (gameChoice) {
            case 1:
                game = new SinglePlayerGame("GhostRunner", "Action", 2200.00);
                break;
            case 2:
                game = new MultiPlayerGame("Sekiro", "Adventure", 2500.00, 2);
                break;
            default:
                System.out.println("Invalid game choice");
                return;
        }

        // Selecting payment method
        System.out.println("Select the payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Pay Pal");
        
        int paymentChoice = scanner.nextInt();

        switch (paymentChoice) {
            case 1:
                catalog.purchaseGame(game, new CreditCardPayment());
                break;
            case 2:
                catalog.purchaseGame(game, new PayPalPayment());
                break;
            default:
                System.out.println("Invalid payment choice");
        }
    }
}
