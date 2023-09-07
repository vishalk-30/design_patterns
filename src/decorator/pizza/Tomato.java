package decorator.pizza;

public class Tomato implements Pizza{
    private Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }
    public int getCost() {
        int cost = 30;
        return pizza.getCost() + cost;
    }

    @Override
    public String getDescription() {
        String name = "Tomato";
        return pizza.getDescription() + name + " + ";
    }
}
