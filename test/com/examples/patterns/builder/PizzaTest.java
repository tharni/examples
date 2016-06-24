
/*
 *
 * Description
 *
 * Author: Ezhil
 * 
 */
package com.examples.patterns.builder;

import static org.junit.Assert.*;
import org.junit.Test;

import com.examples.patterns.builder.Pizza;
import com.examples.patterns.builder.PizzaBuilder;

public class PizzaTest {

    @Test
    public void testForPlainPizza() {
        Pizza pizza = PizzaBuilder.create().build();
        assertEquals(null, pizza.getType());
        assertTrue(!pizza.isGarlic());
        assertTrue(!pizza.isCheese());
        assertTrue(!pizza.isNuts());
    }

    @Test
    public void testForPizzaWithAllAddOns() {
        Pizza pizza = PizzaBuilder.create().withType("veg").withGarlic().withCheese().withNuts().build();
        assertEquals("veg", pizza.getType());
        assertTrue(pizza.isGarlic());
        assertTrue(pizza.isCheese());
        assertTrue(pizza.isNuts());
    }

    @Test
    public void testPizzaContainsGarlicAndVegetables() {
        Pizza pizza = PizzaBuilder.create().withType("veg").withGarlic().build();
        assertTrue(pizza.isGarlic());
        assertEquals("veg", pizza.getType());
    }

    @Test
    public void testPizzaNotContainsGarlic() {
        Pizza pizza = PizzaBuilder.create().withType("Chicken").build();
        assertTrue(!pizza.isGarlic());
    }

    @Test
    public void testPizzaContainsCheeseAndVegetables() {
        Pizza pizza = PizzaBuilder.create().withType("veg").withCheese().build();
        assertTrue(pizza.isCheese());
        assertEquals("veg", pizza.getType());
    }

    @Test
    public void testPizzaNotContainsCheese() {
        Pizza pizza = PizzaBuilder.create().withType("Chicken").build();
        assertTrue(!pizza.isCheese());
    }

    @Test
    public void testPizzaContainsNutsAndVegetables() {
        Pizza pizza = PizzaBuilder.create().withType("veg").withNuts().build();
        assertTrue(pizza.isNuts());
        assertEquals("veg", pizza.getType());
    }

    @Test
    public void testPizzaNotContainsNuts() {
        Pizza pizza = PizzaBuilder.create().withType("Chicken").build();
        assertTrue(!pizza.isNuts());
    }

    @Test
    public void testForChickenPizza() {
        Pizza pizza = PizzaBuilder.create().withType("Chicken").build();
        assertEquals("Chicken", pizza.getType());
    }
}
