package CustomExecption;

public class InsufficientSharesExecption extends Exception{
    public  InsufficientSharesExecption(String msg){
        super(msg);
        System.out.println("InsufficientSharesExecption "+msg);
    }
}