package org.tutorial.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * This is an example for using Aspect oriented programming to intercept methods that
 * can throw errors.
 */
@Aspect
@Component
public class DividingServiceAspect {
    /**
     * Will execute this method after the execution of the specified method
     * only if the specified method gets executed without any errors.
     */
    @AfterReturning("execution(* org.tutorial.service.DividingService.divide(..))")
    public void afterReturning() {
        System.out.println("After the execution completes without any exceptions.");
    }

    /**
     * Will execute this method after the specified method throws an error
     * during its execution.
     */
    @AfterThrowing("execution(* org.tutorial.service.DividingService.divide(..))")
    public void afterThrowing() {
        System.out.println("After the execution throws an error...");
    }
}
