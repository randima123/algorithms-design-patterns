package DecoPattern;

public class DeluxeRoom implements Room {

    private double price = 15000.0;
    private String description = "Deluxe Room";
    private String priceDescription = "Deluxe Room Price";

    @Override
    public double calculatePrice() {
        return price = price + 0;
    }

    @Override
    public String description() {
        return description = "Description:" + " " + description;
    }

    @Override
    public String priceDescription() {
        return priceDescription = "Price Description:" + " " + priceDescription;
    }

    public String getPriceDescription() {
        return priceDescription;
    }

    public void setPriceDescription(String priceDescription) {
        this.priceDescription = priceDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
