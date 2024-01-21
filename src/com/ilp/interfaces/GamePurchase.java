package com.ilp.interfaces;
import com.ilp.entity.Game;
//Interface segregation Principle
public interface GamePurchase {
	void purchaseGame(Game game, PaymentMethod paymentMethod);
}
