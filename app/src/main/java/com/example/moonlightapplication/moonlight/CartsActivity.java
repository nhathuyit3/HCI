package com.example.moonlightapplication.moonlight;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.moonlightapplication.R;

public class CartsActivity extends AppCompatActivity {
    private ImageView imgCouple, imgbacktohome;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carts);
        imgbacktohome = (ImageView)findViewById(R.id.imgBacktohome);
        imgbacktohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CartsActivity.this, HomeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }

//    @Nullable
//    @Override
//    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
//        imgCouple = (ImageView)findViewById(R.id.imgcouple);
//        imgCouple.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showDialog();
//            }
//        });
//        return super.onCreateView(name, context, attrs);
//    }
//    private void showDialog(){
//        final Dialog dialog;
//        dialog = new Dialog(getApplicationContext());
//        dialog.setContentView(R.layout.layout_couple);
//        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
//        Window window = dialog.getWindow();
//        window.setGravity(Gravity.CENTER);
//        window.getAttributes().windowAnimations = R.style.DialogAnimation;
//        dialog.setCancelable(true);
//        window.setLayout(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
//        dialog.show();
//    }
}
