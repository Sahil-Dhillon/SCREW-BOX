package com.example.screwbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.firebase.ui.auth.AuthUI;

import java.util.Arrays;

public class function3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_function3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent intent = new Intent(function3.this,userinfo.class);

                startActivity(intent);
                finish();



            }
        }, 2000);
    }
}