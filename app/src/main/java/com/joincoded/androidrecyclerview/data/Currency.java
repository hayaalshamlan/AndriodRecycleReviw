package com.joincoded.androidrecyclerview.data;

public class Currency {

    private String currencyCode;
    private String currencyName;
    private int exchangeRate;

    public Currency(String currencyCodes, String currencyNames, int exchangeRates){
        currencyCode = currencyCodes;
        currencyName = currencyNames;
        exchangeRate = exchangeRates;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    public int getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(int exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
