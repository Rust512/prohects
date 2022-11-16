package org.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.beans.Cat;
import org.tutorial.beans.Owner;
import org.tutorial.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Cat tom = context.getBean(Cat.class);

            Owner fudge = context.getBean("wired", Owner.class);

            System.out.println(tom);
            System.out.println(fudge);
        }
    }
}