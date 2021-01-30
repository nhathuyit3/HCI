package com.example.moonlightapplication.moonlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.moonlightapplication.R;

public class MyCoupleActivity extends AppCompatActivity {
    private ImageView imgbacktomenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_couple);
        imgbacktomenu = (ImageView)findViewById(R.id.imgbackmenu);
        imgbacktomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}