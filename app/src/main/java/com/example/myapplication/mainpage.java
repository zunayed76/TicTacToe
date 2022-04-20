package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class mainpage extends AppCompatActivity implements View.OnClickListener{
    Button human;
    Button computer;
    Button easy;
    Button normal;
    Button hardcore;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        human = (Button) findViewById(R.id.playwithhuman);
        computer = (Button) findViewById(R.id.playwithcomputer);
        easy = (Button) findViewById(R.id.easycomputer);
        normal = (Button) findViewById(R.id.normalcomputer);
        hardcore = (Button) findViewById(R.id.hardcorecomputer);
        human.setOnClickListener(this);
        computer.setOnClickListener(this);
        easy.setOnClickListener(this);
        normal.setOnClickListener(this);
        hardcore.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.playwithhuman:
                Intent human = new Intent(mainpage.this, human.class);
                startActivity(human);
                break;
            case R.id.playwithcomputer:
                easy.setVisibility(View.VISIBLE);
                normal.setVisibility(View.VISIBLE);
                hardcore.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"Please Select Difficulty!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.easycomputer:
                Intent easy = new Intent(mainpage.this, easy.class);
                startActivity(easy);
                break;
            case R.id.normalcomputer:
                Intent normal = new Intent(mainpage.this, normal.class);
                startActivity(normal);
                break;
            case R.id.hardcorecomputer:
                Intent hardcore = new Intent(mainpage.this, hardcore.class);
                startActivity(hardcore);
                break;
        }
    }
}
