package DesignPattern.Observer;

public class InvoiceGenerator implements  OrderPlacedSubscriber{
    @Override
    public void orderPlaceEvent() {
        System.out.println("Invoice is generated for customer");
    }
}
