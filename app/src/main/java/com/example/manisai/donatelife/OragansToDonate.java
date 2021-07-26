package com.example.manisai.donatelife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class OragansToDonate extends AppCompatActivity {

    private CheckBox ao,ey,ht,lu,li,kin,pan;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oragans_to_donate);

        addListenerOnChkIos();
        addListenerOnButton();
    }

    public void addListenerOnChkIos() {

        ao = (CheckBox) findViewById(R.id.ao);

        ao.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(OragansToDonate.this, " you selected all organs ", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void addListenerOnButton() {

        ao = (CheckBox) findViewById(R.id.ao);
        ht = (CheckBox) findViewById(R.id.ht);
        ey = (CheckBox) findViewById(R.id.ey);
        lu = (CheckBox) findViewById(R.id.lu);
        pan = (CheckBox) findViewById(R.id.pan);
        li = (CheckBox) findViewById(R.id.li);
        kin = (CheckBox) findViewById(R.id.kin);
        bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {

                Intent i = new Intent(OragansToDonate.this, LocationActivity.class);
                startActivity(i);

            }
        });

    }
}