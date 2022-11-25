package org.tutorial.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final HelloService helloService;

    public Person(@Qualifier("English") HelloService helloService) {
        this.helloService = helloService;
    }

    public void sayHello(String name) {
        String hello = helloService.sayHello(name);
        System.out.println(hello);
    }
}
