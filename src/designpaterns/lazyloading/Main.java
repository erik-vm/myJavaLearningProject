package designpaterns.lazyloading;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

/*
        Flower tulip = new Flower("Tulip", 100d);
        System.out.println(tulip.toString()); //first the tax is not calculated
        tulip.getAfterTax();
        System.out.println(tulip.toString()); //tax is calculated*/

SpaceShip round = new SpaceShip(new ValueHolder<String>(() -> "Round"), new ValueHolder<Integer>(() -> 100));
SpaceShip square = new SpaceShip(new ValueHolder<String>(() -> "Square"), new ValueHolder<Integer>(() -> 200));
SpaceShip pyramid = new SpaceShip(new ValueHolder<String>(() -> "Pyramid"), new ValueHolder<Integer>(() -> 300));

        round.getCrew();
        System.out.println(round);
        round.getName();
        System.out.println(round);

    }
}
