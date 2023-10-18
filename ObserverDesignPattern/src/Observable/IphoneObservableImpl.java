package Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    List<NotificationObserver> observerList = new ArrayList<>();
    int stockCount = 0;


    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockAdded) {
        if (stockCount == 0)
            notifySubscribers();

        stockCount = stockCount + stockAdded;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

}
