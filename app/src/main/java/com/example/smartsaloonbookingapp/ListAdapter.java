package com.example.smartsaloonbookingapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter {
private Activity mContext;
List<Booking> bookingList;
    public ListAdapter(Activity mContext, List<Booking> bookingList){
        super(mContext, R.layout.list_item, bookingList);
        this.mContext = mContext;
        this.bookingList = bookingList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = mContext.getLayoutInflater();
        View listItemView = inflater.inflate(R.layout.list_item, null,true);

        TextView tvSalonService = listItemView.findViewById(R.id.tv_salon_service);
        TextView tvServiceStyle = listItemView.findViewById(R.id.tv_service_style);
        TextView tvServicePrice = listItemView.findViewById(R.id.tv_service_price);
        TextView tvServiceDate = listItemView.findViewById(R.id.tv_service_date);

        Booking booking = bookingList.get(position);

        tvSalonService.setText(booking.getSalonService());
        tvServiceStyle.setText(booking.getServiceStyle());
        tvServicePrice.setText(booking.getServicePrice());
        tvServiceDate.setText(booking.getServiceDate());

        return listItemView;
    }
}
