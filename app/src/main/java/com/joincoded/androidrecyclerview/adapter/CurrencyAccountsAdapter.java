package com.joincoded.androidrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.joincoded.androidrecyclerview.R;
import com.joincoded.androidrecyclerview.data.Currency;
import java.util.ArrayList;

public class CurrencyAccountsAdapter extends RecyclerView.Adapter<CurrencyAccountsAdapter.CurrencyAccountViewHolder >{


    ArrayList<Currency> accountsList;

    public CurrencyAccountsAdapter(ArrayList<Currency> accountsList){
        this.accountsList = accountsList;

    }

    @NonNull
    @Override
    public CurrencyAccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_currency,
                parent,
                false
        );
        return new CurrencyAccountViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyAccountViewHolder holder, int position) {
        Currency currency = accountsList.get(position);
        holder.CurrencyCode.setText(currency.getCurrencyCode());
        holder.CurrencyName.setText(currency.getCurrencyName());
        holder.ExchangeRate.setText(String.valueOf(currency.getExchangeRate()));
    }

    @Override
    public int getItemCount() {

        return accountsList.size();
    }
    public static class CurrencyAccountViewHolder extends RecyclerView.ViewHolder{
        TextView CurrencyCode;
        TextView CurrencyName;
        TextView ExchangeRate;
        public CurrencyAccountViewHolder(@NonNull View itemView){
            super(itemView);
            CurrencyCode = itemView.findViewById(R.id.CurrencyCode);
            CurrencyName = itemView.findViewById(R.id.CurrencyName);
            ExchangeRate = itemView.findViewById(R.id.ExchangeRate);
        }
    }
}
