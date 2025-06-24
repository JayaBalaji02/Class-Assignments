package Stocks;

public class Stock {
    long stockId;
    String stockName;
    long pricePerShare;
    long availableShares;

    public Stock(long stockId, String stockName, long pricePerShare, long availableShares) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.pricePerShare = pricePerShare;
        this.availableShares = availableShares;
    }

    public long getStockId() {
        return stockId;
    }

    public void setStockId(long stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public long getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(long pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public long getAvailableShares() {
        return availableShares;
    }

    public void setAvailableShares(long availableShares) {
        this.availableShares = availableShares;
    }
    @Override
    public  String toString(){
        return "Stock id "+stockId+" stock name"+ stockName+" price is "+pricePerShare+" avaiable shares "+availableShares;
    }
}
