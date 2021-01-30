package com.example.moonlightapplication.moonlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.moonlightapplication.R;

public class MemberInformationActivity extends AppCompatActivity {
    private ImageView imgback1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_information);
        imgback1 = (ImageView)findViewById(R.id.imgBack1);
        imgback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}