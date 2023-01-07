package org.tutorial.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tutorial.repositories.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Add one student named 'Devang' to the database.
     * using the @Transactional annotation, the method is not wrapped in a transaction.
     * If the method throws any exception during its execution, all database transactions will be rolled back.
     * By default, only the runtime exceptions trigger a rollback in the transaction.
     * checked exceptions do not trigger a rollback after getting thrown..
     */
    @Transactional
    public void addOneStudent() {
        this.productRepository.addStudent("Devang");
    }

    /**
     * Spring, being a framework, allows us to easily modify the default behavior.
     * By using the noRollbackFor and rollbackFor properties in the @Transaction annotations,
     * We can specify for which classes the transactions not be rolled back and for which classes it will be rolled back.
     * The transaction will be rolled back only if the exception (specified in the rollbackFor property or RuntimeException by default)
     * if propagated outside the method.
     */
    @Transactional(noRollbackFor = {RuntimeException.class}, rollbackFor = {Exception.class})
    public void addOneMoreStudent() {
        this.productRepository.addStudent("Ninad");
    }

}
