package com.example.nirdeshmidterm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResFrag extends Fragment {
    TextView resultText;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_res, container, false);
        return v;
    }
    public void showData(String data){
        resultText = v.findViewById(R.id.resultview);
        resultText.setText(data);
    }
}