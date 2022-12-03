package org.tutorial.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * The @Aspect annotation is not a stereotype annotation, so the aspects do not exist in the spring context.
 * Only after including the annotation @Component, we can let spring context manage this class as a bean.
 * Of course, we have to add the aspect package in the project config.
 */
@Aspect
@Component
class HelloServiceAspect {

    /**
     * Will execute this method before the execution of the specified method
     */
    @Before("execution(* org.tutorial.service.HelloService.hello(..))")
    public void before() {
        System.out.println("Before the execution.");
    }

    /**
     * Will execute this method after the execution of the specified method
     * regardless of whether an error is thrown after it's execution or not.
     * After this method executes, the exception will be visible on the console.
     */
    @After("execution(* org.tutorial.service.HelloService.hello(..))")
    public void after() {
        System.out.println("After the execution.");
    }
}
