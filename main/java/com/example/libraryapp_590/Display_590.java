package com.example.libraryapp_590;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Display_590 extends AppCompatActivity {
TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display590);
        display=findViewById(R.id.textView9);
        Intent intent = getIntent();
        String datadisplay=intent.getStringExtra("Data");
        display.setText(datadisplay);
    }
    public void Back_dis(View v){
        finish();
    }
}