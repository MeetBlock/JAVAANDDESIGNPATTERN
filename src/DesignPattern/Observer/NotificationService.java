package DesignPattern.Observer;


// this class holds logic to send sms or email whenever order is placed, it means this is a subscriber class
// observer class
public class NotificationService implements OrderPlacedSubscriber{
    @Override
    public void orderPlaceEvent() {
        System.out.println("Send SMS to customer");
        System.out.println("Send Email to customer");
    }
}
