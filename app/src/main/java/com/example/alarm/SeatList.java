package com.example.alarm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SeatList extends ArrayAdapter<Smodel> {

    private Activity context;
    private List<Smodel> smodelList;

    public SeatList(Activity context, List<Smodel> smodelList) {
        super(context, R.layout.seatlist_layout, smodelList);
        this.context = context;
        this.smodelList = smodelList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.seatlist_layout, null, true);

        TextView stextViewName = (TextView) listViewItem.findViewById(R.id.SEATNAME);
        TextView stext2ViewName = (TextView) listViewItem.findViewById(R.id.STUDENTNAME);


        Smodel smodel = smodelList.get(position);

        stextViewName.setText(smodel.getSeatname());
        stext2ViewName.setText(smodel.getAssignedstudentid());


        return listViewItem;

    }
}
