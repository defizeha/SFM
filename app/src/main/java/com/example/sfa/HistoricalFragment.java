package com.example.sfa;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.ResourceBundle;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalFragment extends Fragment {

    DatePicker datePicker;
    TextView displayDate;
    Button changeDate;
    int month;

//    @NonNull
    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState){

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_historical, container, false);

        datePicker = (DatePicker) view.findViewById(R.id.datePicker);
        displayDate = (TextView) view.findViewById(R.id.display_date);
        displayDate.setText("Display Date");
        changeDate = (Button) view.findViewById(R.id.change_date_button);

        displayDate.setText(currentDate());
        changeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDate.setText(currentDate());
            }
        });
        return view;
    }

    public String currentDate() {
        StringBuilder mcurrentDate = new StringBuilder();
        month = datePicker.getMonth() + 1;
        mcurrentDate.append("Date: " + month + "/" +
                datePicker.getDayOfMonth() + "/" + datePicker.getYear());
        return mcurrentDate.toString();
//        final Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//
//        return new DatePickerDialog(getActivity(), (DatePickerDialog.OnDateSetListener) getActivity(), year, month, day);
//    }
//    public void onDateSet(DatePicker view, int year, int month, int day) {
//        //Do something with the date chosen by the user
//        TextView tv = (TextView) getActivity().findViewById(R.id.tv);
//        tv.setText("Date changed...");
//        tv.setText(tv.getText() + "\nYear: " + year);
//        tv.setText(tv.getText() + "\nMonth: " + month);
//        tv.setText(tv.getText() + "\nDay of Month: " + day);
//
//        String stringOfDate = day + "/" + month + "/" + year;
//        tv.setText(tv.getText() + "\n\nFormatted date: " + stringOfDate);
    }

}
