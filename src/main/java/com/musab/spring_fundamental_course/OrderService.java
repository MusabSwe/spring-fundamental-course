package com.musab.spring_fundamental_course;

public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder() {
//        now OrderService tightly coupled with StripePaymentService
//        so to decouple OrderService from StripePaymentService
//        we will add an interface
//        var paymentService = new StripePaymentService();
//        paymentService.processPayment(10);
//    Instead of create object of PaymentService
//        initilze it in the constructor
//        then use inside method
        paymentService.processPayment(10);
    }
}
