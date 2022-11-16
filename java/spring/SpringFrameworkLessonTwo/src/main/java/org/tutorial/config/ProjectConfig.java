package org.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tutorial.beans.Cat;
import org.tutorial.beans.Owner;

@Configuration
public class ProjectConfig {

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Owner owner() {
        return new Owner();
    }
}
