package com.example.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.widget.Toast;
import java.util.TimeZone;



import androidx.appcompat.app.AppCompatActivity;



public class Appointments extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
                // Create an intent to add a new event to the calendar
                Intent intent = new Intent(Intent.ACTION_INSERT)
                        .setData(CalendarContract.Events.CONTENT_URI)
                        .putExtra(CalendarContract.Events.TITLE, "A Test Event from android app")
                        .putExtra(CalendarContract.Events.ALL_DAY, true)
                        .putExtra(CalendarContract.Events.EVENT_TIMEZONE, TimeZone.getDefault().getID())
                        .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, System.currentTimeMillis())
                        .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, System.currentTimeMillis() + 60 * 60 * 1000);

                // Start the calendar app to add the event
                startActivity(intent);










    }
}


