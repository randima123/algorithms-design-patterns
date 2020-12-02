package Decorator;

public class CheesePizza implements Pizza {

    private String description;
    private double cost = 100.0;

    public double calculateCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
