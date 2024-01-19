package com.ilp.services;
import com.ilp.interfaces.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: Rs." + amount);
    }
}
