package pattern;

import java.util.List;

public class Pizza {
    private final String dough;
    private final String sauce;
    private final List<String> toppings;
    private final boolean extraCheese;
    private final int sizeCm;

    public Pizza(String dough, String sauce, List<String> toppings, boolean extraCheese, int sizeCm) {
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
        this.extraCheese = extraCheese;
        this.sizeCm = sizeCm;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                ", extraCheese=" + extraCheese +
                ", size=" + sizeCm + "cm" +
                '}';
    }
}