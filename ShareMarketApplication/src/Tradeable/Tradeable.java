package Tradeable;

import CustomExecption.InsufficientSharesExecption;
import CustomExecption.StockNotFoundExecption;

public interface Tradeable {
    void buyStock() throws StockNotFoundExecption;
    void sellStock() throws InsufficientSharesExecption;
}
