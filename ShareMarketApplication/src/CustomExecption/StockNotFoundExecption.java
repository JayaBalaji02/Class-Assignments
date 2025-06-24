package CustomExecption;

public class StockNotFoundExecption extends Exception{
     public StockNotFoundExecption(String msg) {
super(msg);
         System.out.println("stockNotFoundExecption " + msg);
     }
 }
