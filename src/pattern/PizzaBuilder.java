package pattern;

public interface PizzaBuilder {
    PizzaBuilder setDough(String dough);
    PizzaBuilder setSauce(String sauce);
    PizzaBuilder setCheese(String cheese);
    PizzaBuilder addTopping(String topping);
    Pizza build();
}