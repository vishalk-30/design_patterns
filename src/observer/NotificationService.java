package observer;

public class NotificationService implements  OrderPlacedSubscriber{

    @Override
    public void orderPlacedAction() {
        System.out.println("Notification sent on Order Placed");

    }
}
