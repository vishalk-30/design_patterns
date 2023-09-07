package decorator.pizza;

public class Margherita implements Pizza{
    public Margherita() {
    }

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        String name = "Margherita";
        return name + " + ";
    }
}
