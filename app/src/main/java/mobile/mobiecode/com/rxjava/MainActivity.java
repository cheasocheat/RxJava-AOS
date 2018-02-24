package mobile.mobiecode.com.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;
    private StockDataAdapter stockDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

       /* Observable.just("Hello! Please use me!")
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                       // edtHello.setText(s);
                    }
                });*/

       recyclerView.setHasFixedSize(true);
       layoutManager = new LinearLayoutManager(this);
       recyclerView.setLayoutManager(layoutManager);

       stockDataAdapter = new StockDataAdapter();
       recyclerView.setAdapter(stockDataAdapter);

       Observable.just("APPLE","GOOGLE","TWITTER", "YAHOO", "ICLOUD","SAMSUNG", "LG","NOKIA",
               "HTC")
               .subscribe(new Consumer<String>() {
                   @Override
                   public void accept(String s) throws Exception {
                       stockDataAdapter.add(s);
                   }
               });

    }
}
