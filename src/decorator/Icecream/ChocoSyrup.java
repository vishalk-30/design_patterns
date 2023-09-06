package decorator.Icecream;

public class ChocoSyrup implements  Dessert{
    private Dessert dessert;

    public ChocoSyrup(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public int getCost() {
        int cost = 20;
        return dessert.getCost() + cost;
    }

    @Override
    public String getDescription() {
        String description = "Choco Syrup";
        return dessert.getDescription() + description + ", ";
    }
}
