package observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> orderPlacedSubscriberList;

    public Amazon() {
        this.orderPlacedSubscriberList = new ArrayList<>();
    }

    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.add(orderPlacedSubscriber);

    }

    public void deRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }

    public void orderPlacedNotification(){
        for(OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscriberList){
            orderPlacedSubscriber.orderPlacedAction();
        }
    }







}
