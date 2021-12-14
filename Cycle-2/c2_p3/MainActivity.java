package com.example.sjcet.c2_p3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=findViewById(R.id.edt);
        btn=findViewById(R.id.btn);
    }

    public void pass(View view) {
        String str = edt.getText().toString();
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("Message_Key",str);
        startActivity(intent);
    }
}
