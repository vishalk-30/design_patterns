package observer;

public class InventoryManagement implements OrderPlacedSubscriber{

    @Override
    public void orderPlacedAction() {
        System.out.println("Update Inventory order has been placed");

    }
}
