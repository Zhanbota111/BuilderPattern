# Builder Pattern — Pizza Construction System

This project demonstrates the **Builder Creational Pattern** implemented in Java (JDK 17).

## System Components
- **Product (`Pizza`)**: Complex object representing a customized pizza.
- **Builder (`PizzaBuilder`)**: Abstract interface defining step-by-step construction.
- **Concrete Builders (`PepperoniPizzaBuilder`, `MargheritaPizzaBuilder`)**: Build specific pizza variants using a fluent interface.
- **Director (`PizzaDirector`)**: Manages reusable creation workflows for preset pizzas.
- **Client (`Main`)**: Demonstrates step-by-step custom builds and Director presets.

## How to Run
1. Open the project in IntelliJ IDEA (JDK 17+).
2. Navigate to `src/pattern/Main.java`.
3. Run the `main` method.