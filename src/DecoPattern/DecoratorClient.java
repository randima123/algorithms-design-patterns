package DecoPattern;

public class DecoratorClient {

    public void testDecorator() {
        Room room = new JaccuziDecorator(new TheaterDecorator(new LuxuryRoom()));
        double price = room.calculatePrice();
        String dec = room.description();
        String priceDesc = room.priceDescription();
        System.out.println("Price " + price);
        System.out.println(dec);
        System.out.println(priceDesc);
    }
}
