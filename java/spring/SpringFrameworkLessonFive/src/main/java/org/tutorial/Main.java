package org.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tutorial.config.ProjectConfig;
import org.tutorial.services.ProductService;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService service = context.getBean(ProductService.class);
            service.addOneStudentAndThrowException();
        }
    }
}