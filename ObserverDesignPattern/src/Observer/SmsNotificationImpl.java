package Observer;

import Observable.StocksObservable;

public class SmsNotificationImpl implements NotificationObserver{

    String userName;
    StocksObservable observableObj;

    public SmsNotificationImpl(String userName, StocksObservable observable){
        this.userName=userName;
        this.observableObj=observable;
    }
    @Override
    public void update() {
        sendSms(userName);
    }

    private void sendSms(String userName) {
        System.out.println("Msg has been sent to "+userName);
    }
}
