package org.tutorial.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("English")
public class HelloServiceInEnglish implements HelloService{
    @Override
    public String sayHello(String name) {
        return "Hello " + name + '!';
    }
}
