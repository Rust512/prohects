package org.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.config.ProjectConfig;
import org.tutorial.demo.Person;
import org.tutorial.model.Product;
import org.tutorial.repositories.ProductRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Example of inserting data using JDBC template.
         */
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductRepository repository = context.getBean(ProductRepository.class);

            Product sprite = new Product();
            sprite.setName("Sprite");
            sprite.setPrice(15);

            repository.addProduct(sprite);
        }

        /*
        Example of extracting a list of all products.
         */
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductRepository repository = context.getBean(ProductRepository.class);

            List<Product> products = repository.getProducts();

            products.forEach(System.out::println);
        }

        /*
        Example of using qualifiers to identify a unique bean from
        two different beans in the spring context that have the same type.
         */

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Person devang = context.getBean(Person.class);
            devang.sayHello("Ninad");
        }
    }
}