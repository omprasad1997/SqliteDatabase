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

        //creating contact object for db
        Contact harry = new Contact();
        harry.setPhoneNumber("2113245656");
        harry.setName("Harry");

        //adding contact to db
        db.addContact(harry);

        Contact omprasad = new Contact();
        omprasad.setPhoneNumber("43413245656");
        omprasad.setName("Omprasad");

        //adding contact to db
        db.addContact(omprasad);

        Contact pushpak = new Contact();
        pushpak.setPhoneNumber("7843245656");
        pushpak.setName("Pushpak");

        //adding contact to db
        db.addContact(pushpak);


    }
}