package com.example.practice_sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practice_sqlitedb.data.MyDbHandler;
import com.example.practice_sqlitedb.model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHandler db = new MyDbHandler(MainActivity.this);
    }
}