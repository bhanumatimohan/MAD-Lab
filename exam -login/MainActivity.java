package com.example.sjcet.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    EditText e1;
    EditText e2;
    TextView t1;
    TextView t2;
    Button btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        btn=(Button) findViewById(R.id.btn);
    }

    public void save(View view) {
        String user, pass;
        user=e1.getText().toString();
        pass=e2.getText().toString();

        if (user.isEmpty())
        {
            Toast.makeText(this,"username is empty",Toast.LENGTH_SHORT).show();
        }
        else if (pass.isEmpty())
        {
            Toast.makeText(this,"password is empty",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Login successful",Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("MESSAGE_KEY",user);
        startActivity(intent);
    }
}
