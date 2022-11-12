package org.tutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tutorial.repositories.ProductRepository;

/**
 * Using stereotype annotations: @Service
 */
@Service
public class ProductDeliveryService {
    /**
     * This annotation is used to define parent-child relationship between beans (Dependency Injection).
     * There are three ways of using this annotation.
     * <ul>
     *     <li>Use it directly above the attribute (for which the class is defined as a component/stereotype),</li>
     *     <li>Use it to inject into the arguments of a parameterized constructor (recommended), and</li>
     *     <li>use it to inject into the arguments of a setter.</li>
     * </ul>
     */
    @Autowired
    private ProductRepository productRepository;

    public void addSomeProducts() {
        productRepository.add();
        productRepository.add();
        productRepository.add();
    }
}
