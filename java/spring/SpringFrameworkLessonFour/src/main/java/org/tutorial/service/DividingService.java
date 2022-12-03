package org.tutorial.service;

import org.springframework.stereotype.Service;

/**
 * Sample class for showing an example for aspect oriented programming
 * (@AfterRunning and @AfterThrowing annotations)
 */
@Service
public class DividingService {
    public void divide(Integer dividend, Integer divisor) {
        try {
            System.out.println("The answer is: " + dividend / divisor);
        } catch (ArithmeticException ex) {
            throw new RuntimeException("Please don't divide by zero!");
        }
    }
}
