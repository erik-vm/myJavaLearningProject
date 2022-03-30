package designpaterns.lazyloading;

public class SpaceShip {


    private ValueHolder<String> name;
    private ValueHolder<Integer> crew;


    public SpaceShip(ValueHolder<String> name, ValueHolder<Integer> crew) {
        this.name = name;
        this.crew = crew;
    }


    @Override
    public String toString() {
        return "SpaceShip{" +
                "name=" + name +
                ", crew=" + crew +
                '}';
    }

    public String getName() {
        return name.getValue();
    }

    public Integer getCrew() {
        return crew.getValue();
    }
}
