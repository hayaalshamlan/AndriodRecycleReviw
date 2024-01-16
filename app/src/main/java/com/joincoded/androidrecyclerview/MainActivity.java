package com.joincoded.androidrecyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.joincoded.androidrecyclerview.adapter.CurrencyAccountsAdapter;
import com.joincoded.androidrecyclerview.data.Currency;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView currencyRecycler;
    ArrayList<Currency> currencyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCurrencyAccounts();

        currencyRecycler = findViewById(R.id.currencyRecycler);
        currencyRecycler.setLayoutManager(new LinearLayoutManager(this));

        CurrencyAccountsAdapter currencyAccountsAdapter = new CurrencyAccountsAdapter(currencyList);
        currencyRecycler.setAdapter(currencyAccountsAdapter);

    }
    public void addCurrencyAccounts(){
        Currency KWD = new Currency("KWD", "Kuwait dinar", 78);
        currencyList.add(KWD);
        Currency USD = new Currency("USD", "United", 69);
        currencyList.add(USD);
        Currency EUR = new Currency("EUR", "Euro", 39);
        currencyList.add(EUR);
        Currency AED = new Currency("AED", "Emirati Dirham", 84);
        currencyList.add(AED);
    }
}