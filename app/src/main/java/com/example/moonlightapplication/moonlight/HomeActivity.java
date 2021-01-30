package com.example.moonlightapplication.moonlight;

import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.moonlightapplication.R;
import com.example.moonlightapplication.fragments.AccountFragment;
import com.example.moonlightapplication.fragments.HomeFragment;
import com.example.moonlightapplication.fragments.OrderFragment;
import com.example.moonlightapplication.fragments.StoreFragment;
import com.example.moonlightapplication.fragments.fragment_tab.CommonFragment;
import com.example.moonlightapplication.fragments.fragment_tab.DrinkFragment;
import com.example.moonlightapplication.fragments.fragment_tab.FoodFragment;

public class HomeActivity extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener, OrderFragment.OnFragmentInteractionListener,
        StoreFragment.OnFragmentInteractionListener, AccountFragment.OnFragmentInteractionListener, CommonFragment.OnFragmentInteractionListener,
        DrinkFragment.OnFragmentInteractionListener, FoodFragment.OnFragmentInteractionListener {
    private Fragment fragment = null;
    private ImageView imgNewsLayout, imgOrderLayout, imgAccountLayout, imgStoreLayout;
    private String TAG = "HomeActivity";
    private FragmentTransaction ft;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initLayout();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, new HomeFragment());
        ft.commit();
        fragment = new HomeFragment();
    }
    private void initLayout(){
        imgNewsLayout = (ImageView) findViewById(R.id.imgNewsLayout);
        imgOrderLayout = (ImageView) findViewById(R.id.imgOrderLayout);
        imgStoreLayout = (ImageView) findViewById(R.id.imgStoreLayout);
        imgAccountLayout = (ImageView) findViewById(R.id.imgAccountLayout);

        imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1), PorterDuff.Mode.MULTIPLY);
        imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),PorterDuff.Mode.MULTIPLY);
        imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),PorterDuff.Mode.MULTIPLY);
        imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);

        imgNewsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1), PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                loadFragment(new HomeFragment());
                Log.d(TAG, "news fragment");
            }
        });
        imgOrderLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1), PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                loadFragment(new OrderFragment());
                Log.d(TAG, "orders fragment");
            }
        });
        imgAccountLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1), PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                loadFragment(new AccountFragment());
                Log.d(TAG, "account fragment");
            }
        });
        imgStoreLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1), PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4), PorterDuff.Mode.MULTIPLY);
                loadFragment(new StoreFragment());
                Log.d(TAG, "store fragment");
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        // create a FragmentManager
        ft = getSupportFragmentManager().beginTransaction();
        // replace the FrameLayout with new Fragment
        ft.replace(R.id.fragment_container, fragment);
        ft.commit(); // save the changes
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
