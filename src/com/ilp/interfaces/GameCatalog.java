package com.ilp.interfaces;
import com.ilp.entity.Game;

public interface GameCatalog {
    void displayCatalog();
    void purchaseGame(Game game, PaymentMethod paymentMethod);
}

