package groceryList2.model;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Database {

    Set<Product> productSet;
    List<Product> productList;

    public Database(){
        productSet = new LinkedHashSet<>();
        productList = new ArrayList<>(productSet);

        Product bread = new Product(123, "Bread");
        Product milk = new Product(456, "Milk");
        Product sugar = new Product(789, "Sugar");
        Product candy = new Product(012, "Candy");
        Product eggs = new Product(345, "Eggs");

        productSet.add(bread);
        productSet.add(milk);
        productSet.add(sugar);
        productSet.add(candy);
        productSet.add(eggs);

    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public Product getProductFromList(int position){
        return productList.get(position);
    }
}
