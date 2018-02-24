package mobile.mobiecode.com.rxjava;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheasocheat on 2/23/18.
 */

public class StockDataAdapter extends RecyclerView.Adapter<StockUpdateViewHolder> {
    private final List<StockUpdate> lstDatas = new ArrayList<>();

    @Override
    public void onBindViewHolder(StockUpdateViewHolder holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public int getItemCount() {
        return lstDatas.size();
    }

    @Override
    public StockUpdateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_update_item,parent, false);
        StockUpdateViewHolder viewHolder = new StockUpdateViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StockUpdateViewHolder holder, int position) {
        StockUpdate stockUpdate = lstDatas.get(position);
        holder.setStockSymbol(stockUpdate.getStockSymbol());
        holder.setPrice(stockUpdate.getPrice());
        holder.setDate(stockUpdate.getDate());
    }

   /* public void add(String stockItem){
        this.lstDatas.add(stockItem);
        notifyItemInserted(lstDatas.size()-1);
    }*/

   public void add(StockUpdate stockUpdate){
       this.lstDatas.add(stockUpdate);
       notifyItemInserted(lstDatas.size()-1);
   }

}
