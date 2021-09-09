package com.example.parcellable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void myListener(View view) {

        UserData userdatObj = new UserData("abcd",1234);

        Parcelable parcelableObj = Parcels.wrap(userdatObj);

        Intent secondScrnInt = new Intent(MainActivity.this,SecondActivity.class);

        secondScrnInt.putExtra("key",parcelableObj);

        startActivity(secondScrnInt);


    }
}