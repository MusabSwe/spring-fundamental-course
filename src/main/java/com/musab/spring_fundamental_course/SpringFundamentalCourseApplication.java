package com.musab.spring_fundamental_course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringFundamentalCourseApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringFundamentalCourseApplication.class, args);
        var orderService = new OrderService();
        var orderService2 = new OrderService();
        orderService.setPaymentService(new StripePaymentService());
        orderService2.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();
        orderService2.placeOrder();
    }

}
