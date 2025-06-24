package Tradeable;

import CustomExecption.InsufficientSharesExecption;
import CustomExecption.StockNotFoundExecption;
import Stocks.Stock;

public interface Tradeable {

    void buyStock(Stock stock, int quantity);
    void sellStock(Stock stock, int quantity);
}
