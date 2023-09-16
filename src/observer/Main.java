package observer;

public class Main {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InventoryManagement inventoryManagement = new InventoryManagement();
        NotificationService notificationService = new NotificationService();


        amazon.registerSubscriber(invoiceGenerator);
        amazon.registerSubscriber(inventoryManagement);
        amazon.registerSubscriber(notificationService);
        amazon.orderPlacedNotification();

        System.out.println("------------------------");
        amazon.deRegisterSubscriber(inventoryManagement);
        amazon.orderPlacedNotification();



    }
}
