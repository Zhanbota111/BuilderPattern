package pattern;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        // 1. Создание через Director
        PizzaBuilder margheritaBuilder = new MargheritaPizzaBuilder();
        Pizza margherita = director.makeClassicMargherita(margheritaBuilder);
        System.out.println("Built via Director: " + margherita);

        // 2. Создание вручную через Builder (Fluent API)
        Pizza customPizza = new PepperoniPizzaBuilder()
                .setDough("Stuffed Crust")
                .setSauce("Barbecue")
                .setCheese("Cheddar")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .build();
        System.out.println("Built directly via Client: " + customPizza);
    }
}