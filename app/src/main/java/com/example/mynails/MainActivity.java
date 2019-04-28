package com.example.mynails;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalendarView scheduleCalendar;
    TextView textMyDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scheduleCalendar = (CalendarView) findViewById(R.id.scheduleCalendar);
        textMyDate = (TextView) findViewById(R.id.textMyDate);

        // Выбор даты в календаре
        scheduleCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year , int month, int dayOfMonth) {
                String date =  (dayOfMonth+1) + "/" + month + "/" + year;
                textMyDate.setText(date);
            }
        });
    }
}
