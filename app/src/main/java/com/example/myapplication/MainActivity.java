package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void changeLabelColor(View view){
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        TextView lab1 = (TextView) findViewById(R.id.label1);
        lab1.setBackgroundColor(color);
    }

    public void goToActivity2(View view){
        String str = "Fucheng LY";
        Intent intent = new Intent(this, Activity2.class);

        intent.putExtra("nom", str);

        startActivity(intent);

        Log.e("DEVE0304", "MainActivity.goToActivity2()");
    };


    public void doSomePrinting(View view) {

        Log.e("DEVE0304", "MainActivity:doSomePrinting()");

        String [] list_of_languages = {"Java", "Python", "Php", "Ruby on Rail", "C++"};

        for (int idx = 0 ; idx < list_of_languages.length ; idx ++)
            Log.e("DEVE0304", "" + idx + " : " + list_of_languages[idx]);

    }
}