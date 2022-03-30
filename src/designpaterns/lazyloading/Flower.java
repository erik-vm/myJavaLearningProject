package designpaterns.lazyloading;

public class Flower {

    private String name;
    private Double price;
    private Double afterTax = null;


    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getAfterTax() {
        if (afterTax == null){
            this.afterTax = this.price*1.25;
            System.out.println("We have calc price with tax...");
        }
        return afterTax;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", afterTax=" + afterTax +
                '}';
    }
}
