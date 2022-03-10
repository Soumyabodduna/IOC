package com.ioc;

public class Train implements Engine{
    @Override
    public void start() {
        System.out.println("Train has started");
    }
}
