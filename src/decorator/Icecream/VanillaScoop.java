package decorator.Icecream;

public class VanillaScoop implements Dessert{
    private  Dessert dessert;

    public VanillaScoop(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public int getCost() {
        int cost = 30;
        return dessert.getCost() + cost;

    }

    @Override
    public String getDescription() {
        String description = "Vanilla Scoop";
        return dessert.getDescription() + description + ", ";
    }
}
