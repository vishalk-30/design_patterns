package decorator.Icecream;

public class VanillaCone implements Dessert{

    private Dessert dessert;
    public VanillaCone() {
    }

    public VanillaCone(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public int getCost() {
        int cost = 15;
        if (dessert == null){
            return cost;
        }
        return dessert.getCost() + cost;
    }

    @Override
    public String getDescription() {
        String description = "Vanilla Cone";
        if (dessert == null){
            return description + ", ";
        }
        return dessert.getDescription() + description + ", ";
    }
}
