package decorator.pizza;

public class Pepperoni implements Pizza{
    public Pepperoni() {
    }

    @Override
    public int getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        String name = "Pepperoni";
        return name + " + ";
    }
}
