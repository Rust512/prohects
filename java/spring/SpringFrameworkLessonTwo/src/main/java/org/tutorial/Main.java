package org.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.beans.Cat;
import org.tutorial.beans.Owner;
import org.tutorial.components.CatOne;
import org.tutorial.components.OwnerOne;
import org.tutorial.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        /*
        Autowiring using the ProjectConfig class.
         */
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Cat tom = context.getBean(Cat.class);

            Owner fudge = context.getBean("wired", Owner.class);

            System.out.println(tom);
            System.out.println(fudge);
        }

        /*
        Autowiring using the @Autowired annotation in
        Beans created using the @Component annotation.
         */
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            CatOne captain = context.getBean(CatOne.class);
            captain.setName("Coot");
            OwnerOne jennifer = context.getBean(OwnerOne.class);

            System.out.println(captain);
            System.out.println(jennifer);
        }
    }
}