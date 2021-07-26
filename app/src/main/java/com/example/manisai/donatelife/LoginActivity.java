package com.example.manisai.donatelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    Button b;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b=(Button)findViewById(R.id.button2);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(et1.getText().toString().equals("")&& et2.getText().toString().equals("")){

                    Toast.makeText(LoginActivity.this,"please fill the fields",Toast.LENGTH_SHORT).show();
                }


                else if(et1.getText().toString().equals("sai")&& et2.getText().toString().equals("sai123")){

                    Toast.makeText(LoginActivity.this,"welcome sai ",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(LoginActivity.this,ThirdActivity.class);
                    startActivity(i);
                }
                else if(et1.getText().toString().equals("mohan")&& et2.getText().toString().equals("mohan123")){

                    Toast.makeText(LoginActivity.this,"welcome mohan ",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(LoginActivity.this,ThirdActivity.class);
                    startActivity(i);
                }
                else if(et1.getText().toString().equals("baskar")&& et2.getText().toString().equals("baskar123")){

                    Toast.makeText(LoginActivity.this,"welcome baskar ",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(LoginActivity.this,ThirdActivity.class);
                    startActivity(i);
                }
                else if(et1.getText().toString().equals("vasavi")&& et2.getText().toString().equals("vasavi123")){

                    Toast.makeText(LoginActivity.this,"welcome vasavi ",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(LoginActivity.this,ThirdActivity.class);
                    startActivity(i);
                }
                else if(et1.getText().toString().equals("anusha")&& et2.getText().toString().equals("anusha123")){

                    Toast.makeText(LoginActivity.this,"welcome anusha ",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(LoginActivity.this,ThirdActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(LoginActivity.this,"not valid",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b=(Button)findViewById(R.id.button2);
    }
}
