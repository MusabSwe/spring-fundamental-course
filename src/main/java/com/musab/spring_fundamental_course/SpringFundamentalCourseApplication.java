package com.musab.spring_fundamental_course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringFundamentalCourseApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringFundamentalCourseApplication.class, args);
        var orderService = new OrderService(new StripePaymentService());
        var orderService2 = new OrderService(new PayPalPaymentService());
        orderService.placeOrder();
        orderService2.placeOrder();
    }

}
