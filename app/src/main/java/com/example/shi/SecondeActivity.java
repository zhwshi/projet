package com.example.shi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class SecondeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView e = new TextView(this);
        e.setTextSize((float)50.);
        Intent i = getIntent();
        String m = i.getStringExtra("message");
        e.setText(m);
        setContentView(e);
    }
}