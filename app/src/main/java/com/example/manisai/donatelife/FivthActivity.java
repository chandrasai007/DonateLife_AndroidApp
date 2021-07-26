package com.example.manisai.donatelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FivthActivity extends AppCompatActivity {
    Button b4;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivth);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText8);

        b4=(Button)findViewById(R.id.reg);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("")&& et2.getText().toString().equals("")) {

                    Toast.makeText(FivthActivity.this, "please fill the fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(FivthActivity.this, "Welcome to Donate Life", Toast.LENGTH_LONG).show();
                    Toast.makeText(FivthActivity.this, "Donate Your Organs ," + "Give Life to Others", Toast.LENGTH_LONG).show();
                    
                    Intent i = new Intent(FivthActivity.this, ThirdActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
