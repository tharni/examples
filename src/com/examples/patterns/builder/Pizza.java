
/*
 *
 * Description
 *
 * Author: Ezhil
 * 
 */
package com.examples.patterns.builder;

/**
 * Make pizza
 * 
 * @author Ezhil
 *
 */
public class Pizza {

    String base;
    String type;
    boolean cheese;
    boolean garlic;
    boolean nuts;

    Pizza(PizzaBuilder pizzaBuilder) {
        this.base = pizzaBuilder.getBase();
        this.type = pizzaBuilder.getType();
        this.cheese = pizzaBuilder.isCheese();
        this.garlic = pizzaBuilder.isGarlic();
        this.nuts = pizzaBuilder.isNuts();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isGarlic() {
        return garlic;
    }

    public void setGarlic(boolean garlic) {
        this.garlic = garlic;
    }

    public boolean isNuts() {
        return nuts;
    }

    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }

    public String getBase() {
        return base;
    }
}
