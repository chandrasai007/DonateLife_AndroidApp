package com.example.manisai.donatelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText8);

        b4=(Button)findViewById(R.id.reg);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("")&& et2.getText().toString().equals("")) {

                    Toast.makeText(FourthActivity.this, "please fill the fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i = new Intent(FourthActivity.this, FivthActivity.class);
                    startActivity(i);
                }
            }
        });

    }
}
