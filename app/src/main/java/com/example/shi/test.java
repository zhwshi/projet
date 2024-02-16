package com.example.shi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity ;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener ;
import android.hardware.SensorManager;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
public class test extends AppCompatActivity implements SensorEventListener {
    private SensorManager mSensorManager;
    private Sensor accelerometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        // on recupere l accelerometre a partir du SensorManager
        accelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        // on associe l ecouteur d’evenements au SensorManager
        mSensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {// TODO Auto−generated method stub
    }

    @Override
    public void onSensorChanged(SensorEvent event) {// TODO Auto−generated method stub
        float gammaX = event.values[0], gammaY = event.values[1], gammaZ = event.values[2];
        Log.d("Valeurs accelerometre", gammaX + "," + gammaY + "," + gammaZ);
    }

}
