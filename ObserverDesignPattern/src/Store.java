import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailNotificationImpl;
import Observer.NotificationObserver;
import Observer.SmsNotificationImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Store {
    public static void main(String[] args) {

        StocksObservable observable = new IphoneObservableImpl();

        NotificationObserver observer1 = new EmailNotificationImpl("satyam123@gmail.com",observable);
        NotificationObserver observer2 = new EmailNotificationImpl("satyam321@gmail.com",observable);
        NotificationObserver observer3 = new SmsNotificationImpl("satyam",observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStockCount(10);

    }
}