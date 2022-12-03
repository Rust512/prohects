package org.tutorial.service;

import org.springframework.stereotype.Service;

/**
 * Sample class for showing an example for
 * Aspect oriented programming
 * (@Before and @After annotations)
 */
@Service
public class HelloService {
    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
