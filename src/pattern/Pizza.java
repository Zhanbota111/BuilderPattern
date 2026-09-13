package pattern;

import java.util.Collections;
import java.util.List;

public class Pizza {
    private final String dough;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;

    public Pizza(String dough, String sauce, String cheese, List<String> toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings != null ? List.copyOf(toppings) : Collections.emptyList();
    }

    public String getDough() { return dough; }
    public String getSauce() { return sauce; }
    public String getCheese() { return cheese; }
    public List<String> getToppings() { return toppings; }

    @Override
    public String toString() {
        return "Pizza {" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}