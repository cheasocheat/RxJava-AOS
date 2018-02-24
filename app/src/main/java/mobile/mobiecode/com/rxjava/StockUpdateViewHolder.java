package mobile.mobiecode.com.rxjava;

import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by cheasocheat on 2/23/18.
 */

public class StockUpdateViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.stock_item_symbol)
    protected TextView stockSymbol;

    @BindView(R.id.stock_item_price)
    protected TextView price;

    @BindView(R.id.stock_item_date)
    protected TextView date;

    private static final NumberFormat PRICE_FORMAT = new DecimalFormat("#0.00");

    public StockUpdateViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setStockSymbol(String stockSymbol){
        this.stockSymbol.setText(stockSymbol);
    }

    public void setPrice(BigDecimal price){
        this.price.setText(PRICE_FORMAT.format(price));
    }

    public void setDate(Date date){
        this.date.setText(DateFormat.format("yyyy-MM-dd hh:mm",date));
    }
}
