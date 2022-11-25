package org.tutorial.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Spanish")
public class HelloServiceInSpanish implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hola " + name + '!';
    }
}
