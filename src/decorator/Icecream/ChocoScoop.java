package decorator.Icecream;

public class ChocoScoop implements  Dessert{
        private Dessert dessert;

    public ChocoScoop(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public int getCost() {
        int cost = 30;
        return dessert.getCost() + cost;
    }

    @Override
    public String getDescription() {
        String description = "Choco Scoop";
        return dessert.getDescription() + description + ", ";
    }
}
