package pattern;

import java.util.ArrayList;
import java.util.List;

public class PepperoniPizzaBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private String cheese;
    private final List<String> toppings = new ArrayList<>();

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        if (dough == null || sauce == null) {
            throw new IllegalStateException("Pizza construction failed: Dough and Sauce are required.");
        }
        return new Pizza(dough, sauce, cheese, toppings);
    }
}