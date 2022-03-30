package advancedCodingFeatures.com.shoppingApp.mode;

import advancedCodingFeatures.com.shoppingApp.factory.ProductFactory;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Database {


    private Set<Product> products;
    private ProductFactory productFactory = new ProductFactory();

    public Database() {
        products = new HashSet<>();

        Product bread = productFactory.createNewProduct("Bread", Product.Type.BAKERY);
        bread.setQuantity(30);
        bread.setPrice(1.23);
        products.add(bread);

    }

    public Set<Product> getProducts() {
        return products;
    }
}
