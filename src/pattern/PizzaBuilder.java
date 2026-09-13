package pattern;

public interface PizzaBuilder {
    PizzaBuilder reset();
    PizzaBuilder setDough(String dough);
    PizzaBuilder setSauce(String sauce);
    PizzaBuilder addTopping(String topping);
    PizzaBuilder setExtraCheese(boolean extraCheese);
    PizzaBuilder setSize(int sizeCm);
    Pizza build();
}