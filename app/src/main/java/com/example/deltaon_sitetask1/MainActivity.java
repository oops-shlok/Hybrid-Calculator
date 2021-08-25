package com.example.deltaon_sitetask1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements inputFragment.inputFragmentlistener{
    private static final String INPUT = "input";
    private static final String RESULT = "result";
    inputFragment input;
    resultFragment res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        input = new inputFragment();
        fragmentManager.beginTransaction().add(R.id.input,input,INPUT).commit();
        res=new resultFragment();
        fragmentManager.beginTransaction().add(R.id.result,res,RESULT).commit();

    }

    @Override
    public void input(double answer) {
        res.textview(answer);
    }
}