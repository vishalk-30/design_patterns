package decorator.pizza;

public class Cheese implements Pizza{
    private Pizza pizza;

    public Cheese (Pizza pizza) {
        this.pizza = pizza;
    }
    public int getCost() {
        int cost = 80;
        return pizza.getCost() + cost;
    }

    @Override
    public String getDescription() {
        String name = "Cheese";
        return pizza.getDescription() + name + " + ";
    }
}
