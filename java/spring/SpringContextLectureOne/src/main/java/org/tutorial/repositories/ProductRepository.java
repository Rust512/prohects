package org.tutorial.repositories;

import org.springframework.stereotype.Repository;

/**
 * Using stereotype annotations: @Repository
 */
@Repository
public class ProductRepository {
    /**
     * Add a product.
     */
    public void add() {
        System.out.println("a new product was added");
    }
}
