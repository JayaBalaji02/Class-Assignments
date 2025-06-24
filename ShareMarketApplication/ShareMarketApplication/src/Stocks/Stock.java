package Stocks;

public class Stock {
//    long stockId;
//    String stockName;
//    double pricePerShare;
//    long availableShares;
//
//    public Stock(long stockId, String stockName, double pricePerShare, long availableShares) {
//        this.stockId = stockId;
//        this.stockName = stockName;
//        this.pricePerShare = pricePerShare;
//        this.availableShares = availableShares;
//    }
//
//    public long getStockId() {
//        return stockId;
//    }
//
//    public void setStockId(long stockId) {
//        this.stockId = stockId;
//    }
//
//    public String getStockName() {
//        return stockName;
//    }
//
//    public void setStockName(String stockName) {
//        this.stockName = stockName;
//    }
//
//    public double getPricePerShare() {
//        return pricePerShare;
//    }
//
//    public void setPricePerShare(double pricePerShare) {
//        this.pricePerShare = pricePerShare;
//    }
//
//    public long getAvailableShares() {
//        return availableShares;
//    }
//
//    public void setAvailableShares(long availableShares) {
//        this.availableShares = availableShares;
//    }

    private int stockId;
    private String name;
    private double price;
    private int quantity;

    public Stock(int stockId, String name, double price, int quantity) {
        this.stockId = stockId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public synchronized boolean buy(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            return true;
        }
        return false;
    }

    public synchronized void sell(int qty) {
        quantity += qty;
    }

    public int getStockId() { return stockId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public synchronized int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return stockId + " - " + name + ": ₹" + price + ", Qty: " + quantity;
    }
}
