package pattern;

import java.util.ArrayList;
import java.util.List;

public class MargheritaPizzaBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private List<String> toppings;
    private boolean extraCheese;
    private int sizeCm;

    public MargheritaPizzaBuilder() {
        this.reset();
    }

    @Override
    public PizzaBuilder reset() {
        this.dough = "Thin";
        this.sauce = "Tomato";
        this.toppings = new ArrayList<>();
        this.toppings.add("Mozzarella");
        this.toppings.add("Basil");
        this.extraCheese = false;
        this.sizeCm = 30;
        return this;
    }

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
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public PizzaBuilder setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }

    @Override
    public PizzaBuilder setSize(int sizeCm) {
        this.sizeCm = sizeCm;
        return this;
    }

    @Override
    public Pizza build() {
        if (sizeCm < 15 || sizeCm > 50) {
            throw new IllegalStateException("Pizza size must be between 15 and 50 cm");
        }
        return new Pizza(dough, sauce, new ArrayList<>(toppings), extraCheese, sizeCm);
    }
}