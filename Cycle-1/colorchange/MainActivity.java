package com.example.sjcet.colorchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    View v;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v= this.getWindow().getDecorView();
        b=(Button) findViewById(R.id.bt);
    }

    public void click(View view) {
        v.setBackgroundResource(android.R.color.holo_orange_light);
    }
}
