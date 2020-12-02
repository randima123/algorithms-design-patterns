package AbstractFactory;

public class ProductFactory {

    public static Product create(String type, String brand) {

        Product product;
        switch (brand) {
            case "Yonex":
                product = YonexFactory.createProduct(type);
                break;
            case "Lining":
                product = LiningFactory.createProduct(type);
                break;
            default:
                return null;
        }
        return product;
    }
}
