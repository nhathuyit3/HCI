package com.example.moonlightapplication.paypal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.moonlightapplication.R;

public class PaymentDetails extends AppCompatActivity {
    private TextView txtID, txtAmount, txtStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);
        txtID = (TextView)findViewById(R.id.txtID);

    }
}