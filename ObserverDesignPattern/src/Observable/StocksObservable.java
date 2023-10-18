package Observable;

import Observer.NotificationObserver;

public interface StocksObservable {
    void add(NotificationObserver observer);

    void remove(NotificationObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockAdded);

    int getStockCount();


}
