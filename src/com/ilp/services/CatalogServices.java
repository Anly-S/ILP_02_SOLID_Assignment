package com.ilp.services;

import com.ilp.entity.Game;
import com.ilp.entity.MultiPlayerGame;
import com.ilp.entity.SinglePlayerGame;
import com.ilp.interfaces.PaymentMethod;
import com.ilp.interfaces.GameCatalog;
import com.ilp.interfaces.GamePurchase;
import java.util.ArrayList;
import java.util.List;
//Dependency Inversion Principle
public class CatalogServices implements GameCatalog,GamePurchase {
    private List<Game> purchasedGames;

    public CatalogServices() {
        this.purchasedGames = new ArrayList<>();
    }

    @Override
    public void displayCatalog() {
        System.out.println("Catalog:");

        for (Game game : getAvailableGames()) {
            System.out.println("Game: "+game.getTitle());
            System.out.println("Price: Rs." + game.getPrice());
            System.out.println("Genre: "+game.getGenre());
            if (game instanceof MultiPlayerGame) {
                int maxPlayers = ((MultiPlayerGame) game).getMaxPlayers();
                System.out.println("Max Players: " + maxPlayers);
            }
            System.out.println();
        }
    }

    @Override
    public void purchaseGame(Game game, PaymentMethod paymentMethod) {
        paymentMethod.processPayment(game.getPrice());
        purchasedGames.add(game);
        System.out.println("Game purchased: " + game.getTitle());
    }

    private List<Game> getAvailableGames() {
        List<Game> availableGames = new ArrayList<>();
        availableGames.add(new SinglePlayerGame("GhostRunner", "Action", 2200.00));
        availableGames.add(new MultiPlayerGame("Sekiro", "Adventure",2500.00,2));

        return availableGames;
    }
}
