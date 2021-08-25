package com.example.deltaon_sitetask1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class resultFragment extends Fragment {
    TextView result;
    public resultFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_result, container, false);

        result=view.findViewById(R.id.answer);
        return view;
    }

    public void textview(double val){
        result.setText((int) val);
    }

}