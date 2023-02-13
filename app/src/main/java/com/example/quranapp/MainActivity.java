package com.example.quranapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mainView=(RecyclerView) findViewById(R.id.mainRecyclerView);
        mainView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList paraNames=new ArrayList<String>();
        for(int i=0;i<30;i++)
        {
            String temp="Para Number "+(i+1)+" ";
            System.out.print(temp);
            paraNames.add(temp);
        }
        mainView.setAdapter(new mainViewAdapter(paraNames));
    }

}