package org.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {
        "org.tutorial.repositories",
        "org.tutorial.services"
})
public class ProjectConfig {
    /**
     * Inserting a data-source to the spring context.
     *
     * @return an instance of any class that implements the DataSource interface.
     */
    @Bean
    public DataSource dataSource() {
        var driverManager = new DriverManagerDataSource();
        driverManager.setUrl("jdbc:mysql://localhost:3306/spring-jdbc-tutorial");
        driverManager.setUsername("root");
        driverManager.setPassword("Devang@1729");
        return driverManager;
    }

    /**
     * For reducing the boilerplate code for JDBC connection to a database.
     * This bean will be used to interact with the database.
     *
     * @param dataSource wiring with the data-source bean.
     * @return an instance of any class that implements the JdbcTemplate interface.
     */
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    /**
     * Inserting the transaction manager to the spring context.
     *
     * @param dataSource wiring with the data-source bean.
     * @return an instance of any class that implements the PlatformTransactionManager interface.
     * If you want to implement a user-defined transaction manager, this interface must be implemented.
     */
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
