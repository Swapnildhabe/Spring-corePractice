package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car car1 = (Car) context.getBean("Car");
        System.out.println(car1.getBrand());
        System.out.println(car1.getModel());
        car1.dirve();
//
//        Car ca2 = (Car) context.getBean("Car");
//        ca2.dirve();


    }
}