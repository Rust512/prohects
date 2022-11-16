package org.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tutorial.beans.Cat;
import org.tutorial.beans.Owner;

@Configuration
public class ProjectConfig {
    /**
     * This bean creates a cat with name "Tom" by default
     * @return instance of class Cat
     */
    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("Tom");
        return cat;
    }

    /**
     * This bean creates an owner for which,
     * the cat is taken from the spring context.
     * @return instance of class Owner
     */
    @Bean(name = "functionCall")
    public Owner owner() {
        Owner owner = new Owner();
        /*
        Calling the cat() method will not create a new Cat instance.
        Spring Framework, internally checks of a bean of the class Cat is present in the context or not;
        If the bean is present, it returns the bean (hence, no new Cat object is created);
        Else, the method call resumes normally.
         */
        owner.setCat(cat());
        return owner;
    }

    /**
     * Wiring example:
     * @param cat wired with the owner
     * @return returns an instance of Owner class
     */
    @Bean(name = "wired")
    public Owner owner(Cat cat) {
        Owner owner = new Owner();
        owner.setCat(cat);
        return owner;
    }
}
