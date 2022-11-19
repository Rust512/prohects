package org.tutorial.components;

import org.springframework.stereotype.Component;
import org.tutorial.beans.Cat;

@Component
public class OwnerOne {
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "OwnerOne{" +
                "cat=" + cat +
                '}';
    }
}
