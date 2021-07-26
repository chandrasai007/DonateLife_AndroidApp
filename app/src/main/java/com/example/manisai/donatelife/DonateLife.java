package com.example.manisai.donatelife;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Manisai on 26-01-2017.
 */

public class DonateLife extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    }
}
