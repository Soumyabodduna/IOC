package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{
    public void run(Engine key) {
        key.start();
    }
}
public class Main {
    public static void main(String[] args) {
        // ac is the superset of bean factory
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Engine key =  ac.getBean("engine",Engine.class);
        new Keys().run(key);
    }
}
