package DesignPattern.Observer;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService =  new NotificationService();
        InvoiceGenerator invoiceGenerator =  new InvoiceGenerator();
        Amazon amazon =  new Amazon();

        // added the service to the publishers list
        amazon.addOrderPlacedSubscriber(notificationService);
        amazon.addOrderPlacedSubscriber(invoiceGenerator);
        amazon.orderPlaced();
    }
}
