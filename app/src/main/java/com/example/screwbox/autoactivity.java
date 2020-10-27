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

public class autoactivity extends AppCompatActivity {


    Date currentTime = Calendar.getInstance().getTime();

    CardView cardView1;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    CardView cardView5;
    CardView cardView6;




    String phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_autoactivity);

        phone = FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber();



        cardView1 = findViewById(R.id.autocard1);
        cardView2 = findViewById(R.id.autocard2);
        cardView3 = findViewById(R.id.autocard3);
        cardView4 = findViewById(R.id.autocard4);
        cardView5 = findViewById(R.id.autocard5);
        cardView6 = findViewById(R.id.autocard6);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(autoactivity.this,checkout.class);   intent1.putExtra("order","----");
                startActivity(intent1);

            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(autoactivity.this,checkout.class);   intent1.putExtra("order","----");
                startActivity(intent1);


            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(autoactivity.this,checkout.class);   intent1.putExtra("order","----");
                startActivity(intent1);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(autoactivity.this,checkout.class);   intent1.putExtra("order","----");
                startActivity(intent1);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(autoactivity.this,checkout.class);   intent1.putExtra("order","----");
                startActivity(intent1);

            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(autoactivity.this,checkout.class);
                intent1.putExtra("order","----");
                startActivity(intent1);
            }
        });



    }
}