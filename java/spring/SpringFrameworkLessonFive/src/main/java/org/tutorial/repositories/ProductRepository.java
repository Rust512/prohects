package org.tutorial.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductRepository {
    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Add a student to the database
     * @param name name of the student.
     */
    public void addStudent(String name) {
        String query = "INSERT INTO student VALUES (NULL, ?)";
        jdbcTemplate.update(query, name);
    }
}
