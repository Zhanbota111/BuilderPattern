package pattern;

public class PizzaDirector {
    public Pizza makeClassicMargherita(PizzaBuilder builder) {
        return builder.setDough("Thin Crust")
                .setSauce("Tomato Sauce")
                .setCheese("Mozzarella")
                .addTopping("Fresh Basil")
                .build();
    }

    public Pizza makeSpicyPepperoni(PizzaBuilder builder) {
        return builder.setDough("Thick Crust")
                .setSauce("Spicy Tomato Sauce")
                .setCheese("Mozzarella")
                .addTopping("Pepperoni Slices")
                .addTopping("Jalapenos")
                .build();
    }
}