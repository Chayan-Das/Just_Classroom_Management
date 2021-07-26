package com.example.alarm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.simpleapp.SuperAdmin.SuperAdminHelperClass;

import java.util.List;

public class NotAssignedStudentAdapter extends ArrayAdapter<SuperAdminHelperClass> {
    private Activity context;
    private List<SuperAdminHelperClass> stlist;

    public NotAssignedStudentAdapter(Activity context, List<SuperAdminHelperClass> stlist ){
        super(context, R.layout.not_assigned_student_list, stlist);
        this.context = context;
        this.stlist = stlist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.not_assigned_student_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.NSTUDENTNAME);
        TextView textViewName1 = (TextView) listViewItem.findViewById(R.id.DEPARTMENT);
        TextView textViewName2 = (TextView) listViewItem.findViewById(R.id.YEAR);


        SuperAdminHelperClass superAdminHelperClass= stlist.get(position);

        textViewName.setText(superAdminHelperClass.getFullname());
        textViewName1.setText(superAdminHelperClass.getDepartment());
        textViewName2.setText(superAdminHelperClass.getYear());


        return listViewItem;

    }





}
