package Stocks;


public class Market {

  public static Stock stock1 = new Stock(1, "TCS", 1000.00, 10);
  public static Stock stock2 = new Stock(2, "TataSteel", 2000.00, 20);
  public static Stock stock3 = new Stock(3, "HDFC Bank", 3000.00, 30);

  public static void main(String[] args) {


    printMarketStatus();


    Trader trader1 = new Trader(1, "Alice");
    Trader trader2 = new Trader(2, "Bob");
    Trader trader3 = new Trader(3, "Charlie");


    trader1.start();
    trader2.start();
    trader3.start();


    try {
      trader1.join();
      trader2.join();
      trader3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }


    System.out.println("---- Final Market Status -------------");
    printMarketStatus();
  }

  public static void printMarketStatus() {
    System.out.println("Market Stocks:");
    System.out.println(stock1);
    System.out.println(stock2);
    System.out.println(stock3);
    System.out.println();
  }

  //    public static Stock stock1 = new Stock(1, "TCS", 1000.00, 10);
//    public static Stock stock2 = new Stock(2, "TataSteel", 2000.00, 20);
//    public static Stock stock3 = new Stock(3, "HDFC Bank", 3000.00, 30);
//
//    public static Stock getStockByName(String name) {
//      if (stock1.getStockName().equalsIgnoreCase(name)) {
//        return stock1;
//      } else if (stock2.getStockName().equalsIgnoreCase(name)) {
//        return stock2;
//      } else if (stock3.getStockName().equalsIgnoreCase(name)) {
//        return stock3;
//      } else {
//        return null;
//      }
//    }
//
//  public static Stock getStock1() {
//    return stock1;
//  }
//
//  public static void setStock1(Stock stock1) {
//    Market.stock1 = stock1;
//  }
//
//  public static Stock getStock2() {
//    return stock2;
//  }
//
//  public static void setStock2(Stock stock2) {
//    Market.stock2 = stock2;
//  }
//
//  public static Stock getStock3() {
//    return stock3;
//  }
//
//  public static void setStock3(Stock stock3) {
//    Market.stock3 = stock3;
//  }
//  Stock stock1=new Stock(1,"TCS",1000.00,10);
//  Stock stock2=new Stock(1,"TataSteel",2000.00,20);
//  Stock stock3=new Stock(1,"HDFC Bank",3000.00,30);
//


//    private Stock[] stocks=new Stock[20];
//
////    public Market() {
////       stocks[0]= new Stock(1,"NHPCLtd",1000,10);
////       stocks[1]= new Stock(2,"TCS",1200,78);
////       stocks[2]= new Stock(3,"TATA",500,12);
////       stocks[3]= new Stock(4,"AirIndia",1009,14);
////       stocks[4]= new Stock(5,"ucoBank",2000,98);
////       stocks[5]= new Stock(6,"ITC",2350,100);
////       stocks[6]= new Stock(7,"IOB",1243,78);
////       stocks[7]= new Stock(8,"yesBank",10000,349);
////       stocks[8]= new Stock(9,"vodafoneIdea",1105,87);
////       stocks[9]= new Stock(10,"allenSolly",1002,12);
////       stocks[10]= new Stock(11,"pantloons",5400,78);
////       stocks[11]= new Stock(12,"HDFC",20000,101);
////       stocks[12]= new Stock(13,"JSW",4023,55);
////       stocks[13]= new Stock(14,"Swiggy",4235,64);
////       stocks[14]= new Stock(15,"zomato",1432,65);
////       stocks[15]= new Stock(16,"TataSteel",2123,34);
////       stocks[16]= new Stock(17,"AdaniGroups",1420,16);
////       stocks[17]= new Stock(18,"AxisBank",6510,10);
////       stocks[18]= new Stock(19,"Wipro",7650,77);
////       stocks[19]= new Stock(20,"Infy",1330,65);
////    }
//
//  public Stock getStockName(String name){
//        for(int i=0;i< stocks.length;i++){
//            if(stocks[i]!=null && stocks[i].getStockName().equalsIgnoreCase(name)){
//                return stocks[i];
//            }
//        }
//        return null;
//  }
//
//  public Stock getStockIndex(int index){
//        if(index>=0 && index<stocks.length){
//            return stocks[index];
//        }
// return null;
//  }
//
//    public Stock[] getStocks(int i) {
//        return stocks;
//    }
//
//    public void setStocks(Stock[] stocks) {
//        this.stocks = stocks;
//    }
//    Stock stock1=new Stock(1,"tcs",1000,5);
//    Stock stock2=new Stock(2,"tatasteel",2000,10);
//    Stock stock3=new Stock(3,"HDFCbank",3000,15);
//
//    public Stock getStockByName(String stockName) throws StockNotFoundExecption {
//        if (stock1.getStockName().equalsIgnoreCase(stockName))
//            return stock1;
//        if (stock2.getStockName().equalsIgnoreCase(stockName))
//            return stock2;
//        if (stock3.getStockName().equalsIgnoreCase(stockName))
//            return stock3;
//        throw new StockNotFoundExecption("Stock namr is "+stockName);
//    }
//    public void dislayavaliablestocks(){
//        System.out.println();
//        System.out.println(stock1.stockName+"  "+stock1.availableShares);
//        System.out.println(stock2.stockName+"  "+stock2.availableShares);
//        System.out.println(stock3.stockName+"  "+stock3.availableShares);
//    }
}
