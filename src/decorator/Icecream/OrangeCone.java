package decorator.Icecream;

public class OrangeCone implements Dessert{

    private Dessert dessert;

    public OrangeCone(){

    }
    public OrangeCone(Dessert dessert){
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
        String description = "Orange Cone";
        if (dessert == null){
            return description + ", ";
        }
        return dessert.getDescription() + description + ", ";
    }
}
