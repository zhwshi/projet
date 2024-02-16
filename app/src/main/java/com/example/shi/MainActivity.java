package com.example.shi;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TEST", "Test");
        setContentView(R.layout.activity_main );
        Button b = findViewById(R.id.button);
        b.setText("enter");
        b.setTextSize((float)50.);
        Button c = findViewById(R.id.button2);
        c.setText("new ");
        c.setTextSize((float)50.);

        final EditText e = (EditText) findViewById(R.id.editTextText);

        EditText t = new EditText(this);



        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent lancementSecondeActivite = new Intent(MainActivity.this , SecondeActivity.class );
                lancementSecondeActivite.putExtra("message", e.getText(). toString ());
                startActivity (lancementSecondeActivite);
            }
        });
        c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View f){
                Log.d("Valeurs accelerometre", "Test");
                Intent lancementSecondeActivite2 = new Intent(MainActivity.this , test.class );
                lancementSecondeActivite2.putExtra("message", e.getText(). toString ());
                startActivity (lancementSecondeActivite2);
            }
        });
    }
}