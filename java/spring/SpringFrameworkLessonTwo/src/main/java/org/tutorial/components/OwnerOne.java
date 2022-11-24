package org.tutorial.components;

import org.springframework.stereotype.Component;

@Component
public class OwnerOne {
    private final CatOne cat;

    public OwnerOne(CatOne cat) {
        this.cat = cat;
    }

    public CatOne getCat() {
        return cat;
    }


    @Override
    public String toString() {
        return "OwnerOne{" +
                "cat=" + cat +
                '}';
    }
}
