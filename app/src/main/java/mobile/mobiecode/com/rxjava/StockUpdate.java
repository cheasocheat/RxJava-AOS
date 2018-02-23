package mobile.mobiecode.com.rxjava;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by cheasocheat on 2/23/18.
 */

public class StockUpdate implements Serializable {
    private final String stockSymbol;
    private final BigDecimal price;
    private final Date date;

    public StockUpdate(String stockSymbol, BigDecimal price, Date date){
        this.stockSymbol = stockSymbol;
        this.price = price;
        this.date = date;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }
}
