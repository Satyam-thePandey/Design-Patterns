package Observer;

import Observable.StocksObservable;

public class EmailNotificationImpl implements NotificationObserver{

    String emailId;
    StocksObservable observableObj;
    public EmailNotificationImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observableObj = observable;
    }
    @Override
    public void update() {
        sendEmail(emailId);
    }

    private void sendEmail(String emailId) {
        System.out.println("Email sent to "+ emailId);
    }

}
