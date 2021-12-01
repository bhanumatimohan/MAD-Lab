package com.example.sjcet.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view) {
        Toast.makeText(this, "ACCEPTED", Toast.LENGTH_SHORT).show();
    }

    public void decline(View view) {
        Toast.makeText(this, "ACCESS DENIED",Toast.LENGTH_SHORT).show();
    }
}
