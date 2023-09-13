package com.example.passwordmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.CarrierConfigManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textView;

    TextView eMail;

    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void actionOnClick(View view){

        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.myTextView);
        eMail = findViewById(R.id.inputEmail);
        password = findViewById(R.id.inputPassword);

       textView.setText("KEK123");





    }


}