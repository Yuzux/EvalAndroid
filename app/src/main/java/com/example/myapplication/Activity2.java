package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.content.Intent;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        if(intent !=null){
            String str = "";
            if(intent.hasExtra("nom")){
                str = intent.getStringExtra("nom");
            }
            TextView tv = (TextView) findViewById(R.id.text_view_id);

            tv.setText(str);
        }

        Log.e("DEVE0304", "Activity2:onCreate()");

    }
}