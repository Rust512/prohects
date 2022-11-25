package org.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.tutorial.repositories", "org.tutorial.demo"})
public class ProjectConfig {
    /**
     * For defining the database connection
     * @return instance of an implementation of DataSource interface (DriverManagerDataSource in our case)
     */
    @Bean
    public DataSource dataSource() {
        var driverManager = new DriverManagerDataSource();
        driverManager.setUrl("jdbc:mysql://localhost/spring-jdbc-tutorial");
        driverManager.setUsername("root");
        driverManager.setPassword("Devang@1729");
        return driverManager;
    }

    /**
     * Uses the DataSource to create the connection with the database and
     * reduces boilerplate code compared to vanilla JDBC.
     * @param dataSource autowired from the same ProjectConfig
     * @return instance of an implementation of the JdbcTemplate interface
     */
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
