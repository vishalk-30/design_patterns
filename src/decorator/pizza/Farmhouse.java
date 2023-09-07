package decorator.pizza;

public class Farmhouse implements Pizza{

    public Farmhouse() {
    }

    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        String name = "Farmhouse";
        return name + " + ";
    }
}
