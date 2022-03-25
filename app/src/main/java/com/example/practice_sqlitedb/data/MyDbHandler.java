package com.example.practice_sqlitedb.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.practice_sqlitedb.model.Contact;
import com.example.practice_sqlitedb.params.Params;

public class MyDbHandler extends SQLiteOpenHelper {


    public MyDbHandler(Context context) {
        super(context, Params.DB_NAME, null, Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE " + Params.TABLE_NAME + "(" +
                    Params.KEY_ID + " INTEGER PRIMARY KEY," + Params.KEY_NAME
                    + " TEXT, " + Params.KEY_PHONE + " TEXT" + ")";
        Log.d("dbharry","Query being run is: " + create);
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addContact(Contact contact){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Params.KEY_NAME,contact.getName());
        values.put(Params.KEY_PHONE,contact.getPhoneNumber());
        Log.d("dbharry","Successfully inserted");
        db.close();
    }
}
