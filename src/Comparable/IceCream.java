package Comparable;

import java.util.Objects;

public class IceCream implements Comparable<IceCream> {

    private String flavour;
    private double price;
    private String brand;

    public IceCream() {
    }

    public IceCream(String flavour, double price, String brand) {
        this.flavour = flavour;
        this.price = price;
        this.brand = brand;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(IceCream o) {
        return Double.compare(price, o.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavour='" + flavour + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
