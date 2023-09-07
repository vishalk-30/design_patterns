package decorator.pizza;

public class Paneer implements Pizza{
    private Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }
    public int getCost() {
        int cost = 60;
        return pizza.getCost() + cost;
    }

    @Override
    public String getDescription() {
        String name = "Panner";
        return pizza.getDescription() + name + " + ";
    }
}
