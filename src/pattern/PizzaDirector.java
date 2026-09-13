package pattern;

public class PizzaDirector {
    public Pizza makeLargeSpicyPizza(PizzaBuilder builder) {
        return builder.reset()
                .setSize(40)
                .setSauce("Spicy Tomato")
                .addTopping("Jalapeno")
                .setExtraCheese(true)
                .build();
    }

    public Pizza makeStandardPizza(PizzaBuilder builder) {
        return builder.reset()
                .setSize(30)
                .build();
    }
}