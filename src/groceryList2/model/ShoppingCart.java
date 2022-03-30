package groceryList2.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class ShoppingCart {
    Database database;
    Set<Product> shoppingCart;

    public ShoppingCart(Database database){
        this.database =database;
        shoppingCart = new LinkedHashSet<>();
    }
public void addToCart(Product product){
        database.getProductFromList(database.productList.indexOf(product));
        shoppingCart.add(product);
}
}
