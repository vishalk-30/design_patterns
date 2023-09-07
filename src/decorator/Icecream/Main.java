package decorator.Icecream;

public class Main {
    public static void main(String[] args) {

        Dessert dessert =   new VanillaScoop(
                                new ChocoScoop(
                                    new VanillaCone(
                                        new ChocoSyrup(
                                            new OrangeCone()))));

        System.out.println(dessert.getCost());
        System.out.println(dessert.getDescription());
    }
}
