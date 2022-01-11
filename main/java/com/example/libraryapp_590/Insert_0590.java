package com.example.libraryapp_590;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Insert_0590 extends AppCompatActivity {
EditText Bn,BID,Ba;
MyDatabase_0590 db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert0590);
        Bn=findViewById(R.id.editTextTextPersonName);
        BID=findViewById(R.id.editTextTextPersonName2);
        Ba=findViewById(R.id.editTextTextPersonName3);
        db=new MyDatabase_0590(getApplicationContext(),"Library",null,1);
    }
    public void Insert(View v){
        String BookName=Bn.getText().toString();
        String BookID=BID.getText().toString();
        String BookAuth=Ba.getText().toString();
        db.insert(BookName,BookID,BookAuth);
        Toast.makeText(getApplicationContext(),"RECORD INSERTED", Toast.LENGTH_LONG).show();
    }
    public void Back(View v){
        finish();
    }
}