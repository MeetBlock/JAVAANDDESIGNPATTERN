package DesignPattern.Observer;

import javax.management.OperationsException;
import java.util.ArrayList;
import java.util.List;

// publisher
public class Amazon {
    // make the amazon class singleton as we don't want to make multiple list of subscriber
    // as orderPlacedSubscriber is the common shared resource
    private List<OrderPlacedSubscriber> orderPlacedSubsriber;

    public Amazon() {
        // this is list of subscriber after order placed
        this.orderPlacedSubsriber = new ArrayList<>();
    }

    public void orderPlaced(){
        // business logic for order place
        // once order place, sent an event to observer class to send email sms and invoice
        for(OrderPlacedSubscriber o: orderPlacedSubsriber){
            o.orderPlaceEvent();
        }
    }
    public void addOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubsriber){
         this.orderPlacedSubsriber.add(orderPlacedSubsriber);
    }

    public void removeOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubsriber){
        this.orderPlacedSubsriber.remove(orderPlacedSubsriber);
    }
}
