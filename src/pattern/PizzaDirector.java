package pattern;

public class PizzaDirector {
    public Pizza makeClassicMargherita(PizzaBuilder builder) {
        return builder.setDough("Thin Crust")
                .setSauce("Tomato Sauce")
                .setCheese("Mozzarella")
          фpackage pattern;

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
        }      .addTopping("Fresh Basil")
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