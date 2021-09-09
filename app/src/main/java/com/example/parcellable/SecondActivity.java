package com.example.parcellable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;

import org.parceler.Parcels;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();

    }

    public void init(){

        Parcelable secndParcelbleObj = getIntent().getParcelableExtra("key");
        UserData scndUsrDataObj = Parcels.unwrap(secndParcelbleObj);

        Toast.makeText(this, scndUsrDataObj.toString() , Toast.LENGTH_LONG).show();

    }
}