package decorator.pizza;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Pizza pizza =   new Paneer(
                            new Cheese(
                                    new Tomato(
                                            new BBQChicken())));

        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}
