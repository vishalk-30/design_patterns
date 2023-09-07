package decorator.pizza;

public class BBQChicken implements Pizza{
    public BBQChicken() {
    }

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        String name = "BBQChicken";
        return name + " + ";
    }
}
