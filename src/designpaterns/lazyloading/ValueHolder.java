package designpaterns.lazyloading;

import java.util.function.Supplier;

public class ValueHolder <T>{


    private T value = null;
    private Supplier<T> supplier;

    public ValueHolder(Supplier<T> supplier) {
        this.value = value;
        this.supplier = supplier;
    }

    public T getValue() {
        if (value == null){
            System.out.println("Now the supplier fetches the data " + value);
            value = this.supplier.get();
        }
        return value;
    }

    @Override
    public String toString() {
        return "ValueHolder{" +
                "value=" + value +
                '}';
    }
}
