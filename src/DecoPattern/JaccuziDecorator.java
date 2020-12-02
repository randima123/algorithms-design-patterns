package DecoPattern;

public class JaccuziDecorator extends RoomDecorator {

    private double taxPrice = 7000.0;
    private String description = "plus Jacuzzi";

    public JaccuziDecorator(Room room) {
        super(room);
    }

    @Override
    public double calculatePrice() {
        return room.calculatePrice() + taxPrice;
    }

    @Override
    public String description() {
        return room.description() + " " + description;
    }

    @Override
    public String priceDescription() {
        return room.priceDescription() + " " + description;
    }

    public double getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(double taxPrice) {
        this.taxPrice = taxPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
