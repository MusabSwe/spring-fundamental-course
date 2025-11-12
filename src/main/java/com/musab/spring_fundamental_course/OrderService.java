package com.musab.spring_fundamental_course;

public class OrderService {

    public void placeOrder() {
//        now OrderService tightly coupled with StripePaymentService
//        so to decouple OrderService from StripePaymentService
//        we will add an interface
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}
