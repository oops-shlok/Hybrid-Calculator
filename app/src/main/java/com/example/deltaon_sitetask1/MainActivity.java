package com.example.deltaon_sitetask1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements inputFragment.inputFragmentlistener{
    inputFragment input;
    resultFragment res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = new inputFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.input,input).commit();
        res=new resultFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.result,res).commit();

    }

    @Override
    public String input(String answer) {
        res.textview(answer);
        return answer;
    }
}