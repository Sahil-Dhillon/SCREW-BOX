package com.example.screwbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class homeappliance extends AppCompatActivity {


    Date currentTime = Calendar.getInstance().getTime();

    String phone;
    CardView cardView1;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    CardView cardView5;
    CardView cardView6;
    CardView cardView7;
    CardView cardView8;
    CardView cardView9;
    String order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homeappliance);

        phone = FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber();



        cardView1 = findViewById(R.id.homecard1);
        cardView2 = findViewById(R.id.homecard2);
        cardView3 = findViewById(R.id.homecard3);
        cardView4 = findViewById(R.id.homecard4);
        cardView5 = findViewById(R.id.homecard5);
        cardView6 = findViewById(R.id.homecard6);
        cardView7 = findViewById(R.id.homecard7);
        cardView8 = findViewById(R.id.homecard8);
        cardView9 = findViewById(R.id.homecard9);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(homeappliance.this,checkout.class);
                startActivity(intent1);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(homeappliance.this,checkout.class);
                startActivity(intent1);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(homeappliance.this,checkout.class);
                startActivity(intent1);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(homeappliance.this,checkout.class);
                startActivity(intent1);

            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(homeappliance.this,checkout.class);
                startActivity(intent1);

            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(homeappliance.this,checkout.class);
                startActivity(intent1);

            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(homeappliance.this,checkout.class);
                startActivity(intent1);
            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(homeappliance.this,checkout.class);
                startActivity(intent1);

            }
        });





    }
}