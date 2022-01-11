package com.example.libraryapp_590;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button Insert,Delete,Display;
MyDatabase_0590 db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Insert=findViewById(R.id.button);
        Display=findViewById(R.id.button2);
        Delete=findViewById(R.id.button3);
        db=new MyDatabase_0590(getApplicationContext(),"Library",null,1);
        Insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_insert=new Intent(MainActivity.this,Insert_0590.class);
                startActivity(intent_insert);
            }
        });
        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_display=new Intent(MainActivity.this,Display_590.class);
                String data=db.display();
                intent_display.putExtra("Data",data);
                startActivity(intent_display);
                Toast.makeText(getApplicationContext(),"Displayed Record",Toast.LENGTH_SHORT).show();
            }
        });
        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_delete=new Intent(MainActivity.this,Delete_590.class);
                startActivity(intent_delete);
            }
        });
    }



}