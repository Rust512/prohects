package org.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.tutorial.beans.BeanOne;
import org.tutorial.beans.BeanThree;
import org.tutorial.beans.BeanTwo;

@Configuration
@ComponentScan(basePackages = {
        "org.tutorial.components",
        "org.tutorial.services",
        "org.tutorial.repositories"
})
public class ProjectConfig {

    /**
     * simple bean
     * @return object of BeanOne class
     */
    @Bean
    public BeanOne beanOne() {
        return new BeanOne();
    }

    /**
     * primary bean
     * @return object of BeanTwo class
     */
    @Bean
    @Primary
    public BeanTwo beanTwo() {
        BeanTwo two = new BeanTwo();
        two.setText("Hello");
        return two;
    }

    /**
     * secondary(?) bean
     * @return object of BeanTwo class
     */
    @Bean
    public BeanTwo beanTwoDuplicate() {
        BeanTwo two = new BeanTwo();
        two.setText("World");
        return two;
    }

    /**
     * Bean with name: first
     * @return object of BeanThree class
     */
    @Bean(name = "first")
    public BeanThree beanThreeFirst() {
        BeanThree three = new BeanThree();
        three.setProperty(4);
        return three;
    }

    /**
     * Bean with name: second
     * @return object of BeanThree class
     */
    @Bean(name = "second")
    public BeanThree beanThreeSecond() {
        BeanThree three = new BeanThree();
        three.setProperty(7);
        return three;
    }

}
