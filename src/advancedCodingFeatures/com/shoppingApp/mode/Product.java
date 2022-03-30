package advancedCodingFeatures.com.shoppingApp.mode;

public class Product {

    private static long serialCode;
    private String name;
    private double price;
    private int quantity;
    private Type type;

   public enum Type{
        BAKERY,
        DRINK,
        MEAT,
        DAIRY
    }

    Database database = new Database();

    public Product(String name, Type type) {
        this.serialCode = setSerialCode();
        this.name = name;
        this.type = type;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public long setSerialCode() {
        long serialCode = (long) (Math.random()*100000);
        return serialCode;
    }
    public long getSerialCode() {
        return serialCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialCode=" + serialCode +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", type=" + type +
                '}';
    }


}
