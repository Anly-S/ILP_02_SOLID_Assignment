package com.ilp.services;
import com.ilp.interfaces.PaymentMethod;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: Rs." + amount);
    }
}

