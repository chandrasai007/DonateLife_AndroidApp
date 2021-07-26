package com.example.manisai.donatelife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class donarslist extends AppCompatActivity {
    DatabaseReference dref;
    ListView listView;
    ArrayList<String> list =new ArrayList<>();
    ArrayAdapter<String> adapter;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donarslist);
         listView=(ListView)findViewById(R.id.listview);
         adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);
         listView.setAdapter(adapter);
         dref= FirebaseDatabase.getInstance().getReference();
         dref.addChildEventListener(new ChildEventListener() {
             @Override
             public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    String value=dataSnapshot.getValue(String.class);
                    list.add(value);
                 adapter.notifyDataSetChanged();
             }

             @Override
             public void onChildChanged(DataSnapshot dataSnapshot, String s) {

             }

             @Override
             public void onChildRemoved(DataSnapshot dataSnapshot) {
                 String value=dataSnapshot.getValue(String.class);
                 list.remove(value);
                 adapter.notifyDataSetChanged();
             }

             @Override
             public void onChildMoved(DataSnapshot dataSnapshot, String s) {

             }

             @Override
             public void onCancelled(DatabaseError databaseError) {

             }
         });
     }
}
