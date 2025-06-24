package Stocks;

import CustomExecption.InsufficientSharesExecption;
import CustomExecption.StockNotFoundExecption;
import Tradeable.Tradeable;

public class Trader extends Thread  {
//public class Trader extends Thread implements Tradeable {
    long traderId;
    String traderName;

    Portfolio porfolio;
    Market market;


//    public void run(){
//        try {
//            buyStock();
//        } catch (StockNotFoundExecption e) {
//            System.out.println("Error is "+e.getMessage());
//        }
//        try {
//            sellStock();
//        } catch (InsufficientSharesExecption e) {
//            System.out.println("Error is "+e.getMessage());
//        }
//    }

//    @Override
//    public void buyStock() throws StockNotFoundExecption {
//        Stock stock=market.getStockName(porfolio.getStockBuyed());
//        if (stock==null) {
//            throw new StockNotFoundExecption(porfolio.getStockBuyed());
//        }
//        long qunatity= Long.parseLong(porfolio.getStockBuyed());
//        if (qunatity==0){
//            throw new StockNotFoundExecption(porfolio.getStockBuyed()+"not having stocks for this shares");
//        }
//        stock.setAvailableShares(stock.getAvailableShares()-qunatity);
//        System.out.println("buyed stock "+traderName+"quantity is "+ qunatity +" "+stock.getStockName()
//        +" price "+stock.getPricePerShare()+"available stocks"+stock.getAvailableShares());
//    }
//
//    @Override
//    public void sellStock() throws InsufficientSharesExecption {
//        Stock stock=market.getStockName(porfolio.getStockSelled());
//        if (stock==null){
////            throw new InsufficientSharesExecption(porfolio.getStockSelled());
//        }
//        long qunatity= Long.parseLong(porfolio.getStockSelled());
//        if (qunatity==0){
////            throw new InsufficientSharesExecption(porfolio.getStockSelled()+"not having stocks for this shares");
//        }
//        stock.setAvailableShares(stock.getAvailableShares()+qunatity);
//        System.out.println("buyed stock "+traderName+"quantity is "+ qunatity +" "+stock.getStockName()
//                +" price "+stock.getPricePerShare()+"available stocks"+stock.getAvailableShares());
//
//    }

    public Trader(long traderId, String traderName, Portfolio porfolio, Market market) {
        this.traderId = traderId;
        this.traderName = traderName;
        this.porfolio = porfolio;
        this.market = market;
    }

    public long getTraderId() {
        return traderId;
    }

    public void setTraderId(long traderId) {
        this.traderId = traderId;
    }

    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    public Portfolio getPorfolio() {
        return porfolio;
    }

    public void setPorfolio(Portfolio porfolio) {
        this.porfolio = porfolio;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
//    public void buyStock1(Stock stock,int quanitiy) throws InsufficientSharesExecption {
//        if(stock.getAvailableShares()<quanitiy){
//            throw new InsufficientSharesExecption(stock.getAvailableShares());
//        }
//        stock.setAvailableShares(stock.getAvailableShares()-quanitiy);
//        System.out.println(traderName+"trader name"+quanitiy+" qunaitty buyed"+stock.getStockName()+"buyed stock name");
//
//    }
    public Portfolio getPortfolio(){
        return porfolio;
    }

//    Portfolio portfolio12=new Portfolio();

    public Trader(int id,String name){
        this.traderId=id;
        this.traderName=name;
    }
    Portfolio portfolio123=new Portfolio();
    public void buys(Market market,String stockname, int qunatity) throws StockNotFoundExecption, InsufficientSharesExecption {
        Stock stock=market.getStockName(stockname);
        if(stock.availableShares<qunatity){
            throw new InsufficientSharesExecption("shares not avaliabale");
        }

        if (portfolio123.stockBuyed!=null && portfolio123.stockBuyed.equalsIgnoreCase(stockname)){
            stock.availableShares-=qunatity;
            System.out.println(traderName+" trader name "+qunatity+" share name"+stockname);
        }
    }
    public void printportfolio(){
        System.out.println(traderName+" trader anme");
        portfolio123.printPortfolio();
    }
}
