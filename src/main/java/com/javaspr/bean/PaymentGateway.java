package com.javaspr.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PaymentGateway {

    @Autowired
    @Qualifier("bookOrderBean")
    private Order order;

    @Override
    public String toString(){
        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }
}