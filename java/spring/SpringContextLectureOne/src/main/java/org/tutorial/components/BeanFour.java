package org.tutorial.components;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Making beans using @Component annotation
 */
@Component
public class BeanFour {
    /**
     * How to initialize this attribute?
     * (See next JavaDoc for answer!)
     */
    private String text;

    /**
     * One possible way is to use a @PostConstruct annotation,
     * which gets executed just after the object is initialized.
     * This works only if this class is a bean managed by spring.
     */

    @PostConstruct
    private void init() {
        this.text = "HELLO";
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
