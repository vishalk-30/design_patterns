package observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {
    @Override
    public void orderPlacedAction() {
        System.out.println("Invoice generated on order placed");
    }
}
