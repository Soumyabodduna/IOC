package com.ioc;

public class Car implements Engine {
    @Override
    public void start() {
        System.out.println("car has started");
    }
}
