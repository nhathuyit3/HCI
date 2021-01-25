package com.example.moonlightapplication.moonlight;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.moonlightapplication.R;
import com.example.moonlightapplication.fragments.AccountFragment;
import com.example.moonlightapplication.fragments.HomeFragment;
import com.example.moonlightapplication.fragments.OrderFragment;
import com.example.moonlightapplication.fragments.StoreFragment;

public class MainActivity extends AppCompatActivity {
    private ImageButton imbtHome, imbtOrder, imbtShop, imbtAccount;
    private Fragment fragment = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imbtHome = (ImageButton)findViewById(R.id.imbtHome);
        imbtOrder = (ImageButton)findViewById(R.id.imbtOrder);
        imbtShop = (ImageButton)findViewById(R.id.imbtShop);
        imbtAccount = (ImageButton)findViewById(R.id.imbtnAccount);

        imbtHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new HomeFragment();
            }
        });
        imbtOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new OrderFragment();
            }
        });
        imbtShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new StoreFragment();
            }
        });
        imbtAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new AccountFragment();
            }
        });
    }
}
