package AbstractFactory;

public class LiningFactory extends ProductFactory {

    public static Product createProduct(String type) {
        Product product;
        switch (type) {
            case "Racket":
                product = new LiningRacket();
                break;
            case "Shoe":
                product = new YonexShoe();
                break;
            default:
                return null;
        }
        return product;
    }
}
