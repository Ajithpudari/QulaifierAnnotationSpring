package com.javaspr.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemo {

        public static void main(String a[]){
            String confFile = "applicationContext.xml";
            ConfigurableApplicationContext context
                    = new ClassPathXmlApplicationContext(confFile);
            PaymentGateway paymentGateway = (PaymentGateway) context.getBean("paymentGateway");
            System.out.println(paymentGateway.toString());
        }
    }
