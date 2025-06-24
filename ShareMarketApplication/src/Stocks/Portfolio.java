package Stocks;

import CustomExecption.StockNotFoundExecption;

public class Portfolio {
    String stockBuyed;
    String stockSelled;

    public Portfolio(String tata, int i, int i1) {
    }

    public Portfolio(String stockBuyed, String stockSelled) {
        this.stockBuyed = stockBuyed;
        this.stockSelled = stockSelled;
    }

    public Portfolio() {

    }


    public String getStockBuyed() {
        return stockBuyed;
    }

    public void setStockBuyed(String stockBuyed) {
        this.stockBuyed = stockBuyed;
    }

    public String getStockSelled() {
        return stockSelled;
    }

    public void setStockSelled(String stockSelled) {
        this.stockSelled = stockSelled;
    }

    Stock[] stocks=new Stock[5];
    public void addStock(Stock stock,int index){
        stocks[index]=stock;
    }

    public Stock getStocksName(String name)throws StockNotFoundExecption {
        for(Stock stock:stocks){
            if(stock!=null && stock.getStockName().equalsIgnoreCase(name)) {
                return stock;
            }
        }throw new StockNotFoundExecption(name+" Stock is not found");

    }

    public Stock[] getStocks() {
        return stocks;
    }
    public void printPortfolio(){
        System.out.println("stock bought "+(stockBuyed!=null?stockBuyed:"none"));
        System.out.println("stock sold "+(stockSelled!=null?stockSelled:"None"));
    }
}
