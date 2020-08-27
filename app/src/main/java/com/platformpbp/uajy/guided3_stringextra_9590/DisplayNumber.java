package com.platformpbp.uajy.guided3_stringextra_9590;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayNumber extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra("inputanAngka");

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Angka yang anda inputkan adalah " + message);

        setContentView(textView);
    }
}