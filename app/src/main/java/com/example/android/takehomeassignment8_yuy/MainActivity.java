package com.example.android.takehomeassignment8_yuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Statement> statements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StatementsAdapter(statements,this));
    }


    public void initialData(){
       statements = new ArrayList<>();
       statements.add(new Statement(R.string.no1,R.string.question1,R.mipmap.marvel_1,false));
       statements.add(new Statement(R.string.no2,R.string.question2,R.mipmap.marvel_2,true));
       statements.add(new Statement(R.string.no3,R.string.question3,R.mipmap.marvel_3,true));
       statements.add(new Statement(R.string.no4,R.string.question4,R.mipmap.marvel_4,false));
       statements.add(new Statement(R.string.no5,R.string.question5,R.mipmap.marvel_5,true));
       statements.add(new Statement(R.string.no6,R.string.question6,R.mipmap.marvel_6,false));
    }
}
