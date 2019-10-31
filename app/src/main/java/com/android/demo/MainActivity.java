package com.android.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.demolibrary.Utils;

public class MainActivity extends AppCompatActivity {

    TextView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alert = (TextView) findViewById(R.id.alert);
        alert.setText(Utils.DemoAlert());

    }
}
