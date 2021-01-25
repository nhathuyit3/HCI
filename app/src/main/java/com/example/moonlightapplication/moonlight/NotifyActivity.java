package com.example.moonlightapplication.moonlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.moonlightapplication.R;


public class NotifyActivity extends AppCompatActivity {
    private ImageView imgForward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        imgForward = (ImageView)findViewById(R.id.imgForward);
    }
}