package com.example.dh.appdepablo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent unIntent = getIntent();
        Bundle unBundle = unIntent.getExtras();

        String valorNombre = unBundle.getString("nombre", "edad");

        Toast.makeText(this, valorNombre, Toast.LENGTH_SHORT).show();

    }
}
