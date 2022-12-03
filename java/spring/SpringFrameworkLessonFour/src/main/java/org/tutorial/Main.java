package org.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.config.ProjectConfig;
import org.tutorial.service.ConfessionToYourCrushService;
import org.tutorial.service.DividingService;
import org.tutorial.service.HelloService;

public class Main {
    public static void main(String[] args) {
        /*
        Examples of @After and @Before annotations in aspect oriented programming.
         */
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService helloService = context.getBean(HelloService.class);
            helloService.hello("Devang");
        }

        /*
        Example of @Around annotation. (I could not think of an appropriate example, so I threw some random shit...)
         */
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ConfessionToYourCrushService confessionToYourCrush = context.getBean(ConfessionToYourCrushService.class);
            System.out.println("In case you are nervous: ");
            confessionToYourCrush.confession(true);

            System.out.println("In case you are confident: ");
            confessionToYourCrush.confession(false);

            System.out.println("In either cases, you mess up..");
        }

        /*
        Examples of @AfterReturning and @AfterThrowing in aspect oriented programming.
         */
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            DividingService divider = context.getBean(DividingService.class);
            //@AfterReturning example:
            divider.divide(4, 2);
            //@AfterThrowing example:
            divider.divide(5, 0);
        }
    }
}