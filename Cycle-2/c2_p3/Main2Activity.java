package com.example.sjcet.c2_p3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class Main2Activity extends AppCompatActivity {
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txv=findViewById(R.id.txv);
        Intent intent = getIntent();
        String str = intent.getStringExtra("Message_Key");
        // display the string into textView
        txv.setText(str);
    }
}
