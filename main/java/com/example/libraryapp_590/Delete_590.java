package com.example.libraryapp_590;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Delete_590 extends AppCompatActivity {
EditText del;
MyDatabase_0590 db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete590);
        del=findViewById(R.id.editTextTextPersonName4);
        db=new MyDatabase_0590(getApplicationContext(),"Library",null,1);
    }
    public void Back_del(View v){
        finish();
    }

    public void deletedata(View v){
        String B_id=del.getText().toString();
        db.delete(B_id);
        Toast.makeText(getApplicationContext(),"RECORD DELETED",Toast.LENGTH_LONG).show();
    }
}