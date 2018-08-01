package com.example.android.miwok;


import android.view.View;
import android.widget.Toast;

public class NumbersClickListner implements View.OnClickListener {
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(), "Opens Number List", Toast.LENGTH_SHORT).show();
    }
}
