//package Stocks;
//
//
//import CustomExecption.InsufficientSharesExecption;
//import CustomExecption.StockNotFoundExecption;
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException, InsufficientSharesExecption, StockNotFoundExecption {
//
//        Portfolio portfolio1=new Portfolio("tcs","none");
//
//        Trader t1=new Trader(001,"Jaya",portfolio1);
//
//
//buyStock(t1);
//
//
////        Market market=new Market();
////        Portfolio portfolio1=new Portfolio("tata",10,5);
////        Portfolio portfolio2=new Portfolio("infy",1,2);
////        Portfolio portfolio3=new Portfolio("tata",43,52);
////        Portfolio portfolio4=new Portfolio("tata",12,3);
////
////        Trader trader1=new Trader(1,"Jaya",portfolio1,market) ;
////        Trader trader2=new Trader(2,"Abu",portfolio2,market) ;
////        Trader trader3=new Trader(3,"John",portfolio3,market) ;
////        Trader trader4=new Trader(4,"Markam",portfolio4,market) ;
////        Trader trader5=new Trader(5,"Jr",portfolio2,market) ;
////
////        trader1.start();
////        trader2.start();
////        trader3.start();
////        trader4.start();
////        trader5.start();
////
////        trader1.join();
////        trader2.join();
////        trader3.join();
////        trader4.join();
////        trader5.join();
////
////        for (int i=0;i<20;i++){
////            Stock[] ss= new Stock[]{market.getStockIndex(i)};
////            System.out.println(ss.getClass());
////
////        }
////
//////        Portfolio portfolio12=new Portfolio()
//////    Trader trader11=new Trader(1,"Jaya","tcs",12);
////
////        Market market1=new Market();
////        Trader t1=new Trader(1,"Jaya");
////        Trader t2=new Trader(2,"abu");
////
////        market1.dislayavaliablestocks();
////        t1.buys(market,"tcs",2);
////        System.out.println("-----------------");
////        t1.printportfolio();
////
//    }
//    public static void buyStock(Trader trader) throws StockNotFoundExecption {
//        String stockName = trader.getPorfolio().getStockBuyed();
//
//        Stock stock = Market.getStockByName(stockName);
//
//        if (stock != null) {
//            System.out.println("Stock found in market: " + stock);
//            trader.getPorfolio().addStock(stock);
//        } else {
//            throw new StockNotFoundExecption("Stock not found: " + stockName);
//        }
//    }
//}
