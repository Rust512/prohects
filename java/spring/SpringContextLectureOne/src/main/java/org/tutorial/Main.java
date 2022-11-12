package org.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.beans.BeanOne;
import org.tutorial.beans.BeanThree;
import org.tutorial.beans.BeanTwo;
import org.tutorial.components.BeanFour;
import org.tutorial.config.ProjectConfig;
import org.tutorial.services.ProductDeliveryService;

public class Main {
    public static void main(String[] args) {
        /*
        First method to define beans inside the context:
        using @Bean annotation
         */
        System.out.println("Method 1: using @Bean annotation.");
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            /*
            Using a bean from the spring context.
             */
            BeanOne b1 = context.getBean(BeanOne.class);
            System.out.println(b1);

            /*
            There are two beans of class BeanTwo defined in the config.
            Hence, the context is confused about which bean to consider;
            First way to prevent confusion is to use declare on of the beans as primary.
             */
            BeanTwo b2 = context.getBean(BeanTwo.class);
            System.out.println(b2.getText());

            /*
            Second way to prevent confusion is to use the bean name
            (i.e. the method name for the corresponding bean)
             */
            BeanTwo b2_1 = context.getBean("beanTwo", BeanTwo.class);
            System.out.println(b2_1.getText());

            BeanTwo b2_2 = context.getBean("beanTwoDuplicate", BeanTwo.class);
            System.out.println(b2_2.getText());

            /*
            Third way to prevent confusion is to give the bean a different name through the annotation itself.
             */
            BeanThree b3_1 = context.getBean("first", BeanThree.class);
            System.out.println(b3_1.getProperty());

            BeanThree b3_2 = context.getBean("second", BeanThree.class);
            System.out.println(b3_2.getProperty());
        } catch (Exception e) {
            e.getCause().printStackTrace();
        }

        /*
        Second method to define beans inside the context:
        using @Component annotation. (see the org.tutorial.components package)
         */
        System.out.println("Method 2: using @Component annotation.");
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            /*
            b4_1 and b4_2 will refer to the same instance of BeanFour class in the spring context
             */
            BeanFour b4_1 = context.getBean(BeanFour.class);
            BeanFour b4_2 = context.getBean(BeanFour.class);
            System.out.println(b4_1.getText());
            System.out.println(b4_2.getText());
        }

        /*
        Creating beans using stereotype annotations.
        This is an example of simple dependency injection at the same time.
         */
        System.out.println("Using stereotype annotations");
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductDeliveryService service = context.getBean(ProductDeliveryService.class);
            service.addSomeProducts();
        }
    }
}