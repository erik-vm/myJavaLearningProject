package groceryList2.model;

public class Product {
    private long id;
    private String name;

    public Product(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " +name + " | id: "+id;
    }
}
