package com.example.sjcet.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Switch;
import android.widget.TextView;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    @Override
    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String str = intent.getStringExtra("Message_Key");
        tv.setText(str);
    }

    public void onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater = new MenuInflater();
        Inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public void onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        R.id.signout:
        {
        Toast.makeText(this, "signout clicked", Toast.LENGTH_SHORT).show();
        break;
        }
        super.onOptionsItemSelected(item);
    }
}
