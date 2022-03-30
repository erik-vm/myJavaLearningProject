package advancedCodingFeatures.com.shoppingApp.factory;

import advancedCodingFeatures.com.shoppingApp.mode.Product;

public class ProductFactory {

    public Product createNewProduct(String name, Product.Type type) {
        Product product = new Product(name, type);
        return product;
    }
}
