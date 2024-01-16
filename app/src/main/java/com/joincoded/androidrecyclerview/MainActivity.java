package com.joincoded.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.joincoded.androidrecyclerview.Repository.CurrencyAccountRepo;
import com.joincoded.androidrecyclerview.adapter.CurrencyAccountsAdapter;
import com.joincoded.androidrecyclerview.data.Currency;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView currencyRecycler;
    ArrayList<Currency> currencyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyList = CurrencyAccountRepo.getInstance().generateDummyAddCurrencyAccounts();

        currencyRecycler = findViewById(R.id.currencyRecycler);
        currencyRecycler.setLayoutManager(new LinearLayoutManager(this));

        CurrencyAccountsAdapter currencyAccountsAdapter = new CurrencyAccountsAdapter(currencyList);
        currencyRecycler.setAdapter(currencyAccountsAdapter);

    }

}