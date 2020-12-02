package AbstractFactory;

public class YonexFactory extends ProductFactory {

    public static Product createProduct(String type) {

        Product product;
        switch (type) {
            case "Racket":
                product = new YonexRacket();
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
