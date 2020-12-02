package Decorator;

public class SauceDecorator extends PizzaDecorator {

    private Pizza pizza;
    private double cost = 50.0;

    public double calculateCost() {
        cost = cost + pizza.calculateCost();
        return cost;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
