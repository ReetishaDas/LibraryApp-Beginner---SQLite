package com.example.libraryapp_590;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase_0590 extends SQLiteOpenHelper {
    public MyDatabase_0590(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create table library_590(BookName varchar(20),BookID varchar(20),BookAuthor varchar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldV, int newV) {

    }

    void insert(String name,String id,String auth){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("BookName",name);
        cv.put("BookID",id);
        cv.put("BookAuthor",auth);
        db.insert("library_590",null,cv);
    }

    String display(){
        SQLiteDatabase db = this.getReadableDatabase();
        String res="";
        Cursor c;
        c=db.rawQuery("select * from library_590",null);
        while(c.moveToNext()){
            String NEWname=c.getString(0);
            String NEWid=c.getString(1);
            String NEWauth=c.getString(2);
            res += "Book Name: "+NEWname+"\tBook ID: "+NEWid+"\tBook Author: "+NEWauth+"\n";
        }
        db.close();
        return res;
    }

    void delete(String Bid){
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("delete from library_590 where BookID="+"'"+Bid+"'");
    }
}
