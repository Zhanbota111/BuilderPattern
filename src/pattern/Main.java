package pattern;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        //Создание стандартных пицц через Director
        PepperoniPizzaBuilder pepperoniBuilder = new PepperoniPizzaBuilder();
        Pizza spicyPepperoni = director.makeLargeSpicyPizza(pepperoniBuilder);
        System.out.println("Director Built Spicy Pepperoni: " + spicyPepperoni);

        //Ручная кастомная сборка через Fluent API
        MargheritaPizzaBuilder margheritaBuilder = new MargheritaPizzaBuilder();
        Pizza customMargherita = margheritaBuilder.reset()
                .setSize(25)
                .setDough("Cheese Crust")
                .addTopping("Olives")
                .setExtraCheese(true)
                .build();

        System.out.println("Custom Built Margherita: " + customMargherita);
    }
}