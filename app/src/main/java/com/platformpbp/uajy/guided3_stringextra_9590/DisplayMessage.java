package com.platformpbp.uajy.guided3_stringextra_9590;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Anda Memilih Warna " + message);

        if(message == "Merah"){
            textView.setTextColor(Color.parseColor("#FF0000"));
        }
        else if(message == "Hijau"){
            textView.setTextColor(Color.parseColor("#00FF00"));
        }
        else if(message == "Biru"){
            textView.setTextColor(Color.parseColor("#0000FF"));
        }
        setContentView(textView);
    }
}