package com.musab.spring_fundamental_course;

public class PayPalPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal");
        System.out.println("Amount: " + amount);
    }
}
