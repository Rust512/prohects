package org.tutorial.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Please don't mind my very shameful example.
 */
@Aspect
@Component
public class ConfessionServiceAspect {
    /**
     * The @Around annotation is very flexible and powerful, but with great power, comes great responsibility.
     * Please be careful when using this annotation to define a point cut (aspect / method interceptor)
     *
     * @param joinPoint the state of the method intercepted by this aspect.
     * @return an object that can be used to replace the return value of the method this aspect intercepts
     */
    @Around("execution(* org.tutorial.service.ConfessionToYourCrushService.confession(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object[] arguments = joinPoint.getArgs();
        Boolean isNervous = (Boolean) arguments[0];

        try {
            if (isNervous) {
                System.out.println("Inner thoughts: \"Oh my god!! I am so nervous!!\"");
                joinPoint.proceed();
                System.out.println("After confession: \"All we got was Emotional damage!!\"");
            } else {
                System.out.println("Inner thoughts: \"If I don't tell her how I feel about her right now, when will I??");
                joinPoint.proceed();
                System.out.println("After being in a relationship for a week, you get dumped...");
            }
        } catch (Throwable throwable) {
            System.out.println("What the hell!? WHY!!!");
        }
        return new Object();
    }
}
