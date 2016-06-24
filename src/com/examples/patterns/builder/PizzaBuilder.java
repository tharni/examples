
/*
 *
 * Description
 *
 * Author: Ezhil
 * 
 */
package com.examples.patterns.builder;

/**
 * This class helps build the pizza
 * 
 * @author Ezhil
 *
 */
public class PizzaBuilder {

    final String base;
    String type;
    boolean cheese;
    boolean garlic;
    boolean nuts;

    private PizzaBuilder() {
        this.base = "thin";
    }

    /**
     * Create pizza with thin base
     * 
     * @return
     */
    public static PizzaBuilder create() {
        return new PizzaBuilder();
    }

    /**
     * Build the Pizza
     * 
     * @return
     */
    public Pizza build() {
        return new Pizza(this);
    }

    /**
     * build pizza with type
     * 
     * @param type
     * @return
     */
    public PizzaBuilder withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * build pizza with Cheese
     * 
     * @return
     */
    public PizzaBuilder withCheese() {
        this.cheese = true;
        return this;
    }

    /**
     * build pizza with Garlic
     * 
     * @return
     */
    public PizzaBuilder withGarlic() {
        this.garlic = true;
        return this;
    }

    /**
     * build pizza with Nuts
     * 
     * @return
     */
    public PizzaBuilder withNuts() {
        this.nuts = true;
        return this;
    }

    String getBase() {
        return base;
    }

    String getType() {
        return type;
    }

    boolean isCheese() {
        return cheese;
    }

    boolean isGarlic() {
        return garlic;
    }

    boolean isNuts() {
        return nuts;
    }

}
