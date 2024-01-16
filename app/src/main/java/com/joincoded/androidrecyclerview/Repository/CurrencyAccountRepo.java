package com.joincoded.androidrecyclerview.Repository;

import com.joincoded.androidrecyclerview.data.Currency;

import java.util.ArrayList;

public class CurrencyAccountRepo {
    private static CurrencyAccountRepo instance;

    private CurrencyAccountRepo() {

    }

    public static CurrencyAccountRepo getInstance() {
        if (instance == null)
            instance = new CurrencyAccountRepo();
        return instance;
    }

    public ArrayList<Currency> generateDummyAddCurrencyAccounts() {
        ArrayList<Currency> addCurrencyAccounts = new ArrayList<>();
//        for (int i=0; i<10; i++){
//            Currency currency = new Currency("AED", "Emirati Dirham", 84);
//            addCurrencyAccounts.add(currency);
//        }
        Currency currency = new Currency("AED", "Emirati Dirham", 84);
        addCurrencyAccounts.add(currency);
        return addCurrencyAccounts;
    }

}
