package decorator.pizza;

public class Olive implements Pizza{
    private Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        int cost = 20;
        return pizza.getCost() + cost;
    }

    @Override
    public String getDescription() {
        String name = "Olive";
        return pizza.getDescription() + name + " + ";
    }
}
