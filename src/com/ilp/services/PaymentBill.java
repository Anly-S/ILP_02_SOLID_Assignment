package com.ilp.services;
import com.ilp.interfaces.GeneratedBill;
//Open/Closed Principle
public class PaymentBill extends PaymentDone implements GeneratedBill {
	public PaymentBill() {
	        paymentMessage();
	    }
	public void generateBill(double amount) {
		System.out.println("Generated Bill of amount:"+amount);
	}

}
