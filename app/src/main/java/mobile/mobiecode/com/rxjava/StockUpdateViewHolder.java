package mobile.mobiecode.com.rxjava;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by cheasocheat on 2/23/18.
 */

public class StockUpdateViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.stock_item)
    protected TextView stockItem;

    public StockUpdateViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
