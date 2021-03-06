package com.example.deltaon_sitetask1;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class inputFragment extends Fragment {

    public inputFragment(){

    }
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private Button clear;
    TextView input;
    TextView result;
    private final char ADD = '+';
    private final char SUB = '-';
    private final char MUL = '*';
    private final char DIV = '/';
    private final char EQUAL = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    private inputFragmentlistener listener;
    String c="";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input, container, false);


        one=view.findViewById(R.id.one);
        two=view.findViewById(R.id.two);
        three=view.findViewById(R.id.thre);
        four=view.findViewById(R.id.four);
        five=view.findViewById(R.id.five);
        six=view.findViewById(R.id.six);
        seven=view.findViewById(R.id.seven);
        eight=view.findViewById(R.id.eight);
        nine=view.findViewById(R.id.nine);
        zero=view.findViewById(R.id.zero);
        add=view.findViewById(R.id.add);
        sub=view.findViewById(R.id.sub);
        mul=view.findViewById(R.id.mul);
        div=view.findViewById(R.id.div);
        equal=view.findViewById(R.id.equals);
        input=view.findViewById(R.id.edit);
        clear=view.findViewById(R.id.clear);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"1");
                listener.input(input.getText().toString()+"");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"2");
                listener.input(input.getText().toString()+"");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"3");
                listener.input(input.getText().toString()+"");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"4");
                listener.input(input.getText().toString()+"");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"5");
                listener.input(input.getText().toString()+"");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"6");
                listener.input(input.getText().toString()+"");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"7");
                listener.input(input.getText().toString()+"");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"8");
                listener.input(input.getText().toString()+"");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"9");
                listener.input(input.getText().toString()+"");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"0");
                listener.input(input.getText().toString()+"");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION=ADD;
                listener.input(val1 +"+");
                input.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION=SUB;
                listener.input(val1 +"-");
                input.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION=MUL;
                listener.input(val1 +"*");
                input.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                ACTION=DIV;
                listener.input(val1 +"/");
                input.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                listener.input(String.valueOf(val1));
                input.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Double.NaN;
                val2=Double.NaN;
                listener.input("");
            }
        });

        return view;


    }

    public void calculate(){
        if(!Double.isNaN(val1)) {
            val2 = Double.parseDouble(input.getText().toString());

            if(ACTION==ADD){
                val1=val1+val2;
            }
            if(ACTION==SUB) {
                val1 = val1 - val2;
            }
            if(ACTION==MUL){
                val1=val1*val2;
            }
            if(ACTION==DIV){
                val1=val1/val2;
            }

        }

        else{
            val1 = Double.parseDouble(input.getText().toString());}
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof inputFragmentlistener) {
            listener = (inputFragmentlistener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement Keyboard_inputlistner");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
    public interface inputFragmentlistener
    {
        String input(String answer);
    }

}