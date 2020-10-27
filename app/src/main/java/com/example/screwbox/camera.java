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

public class camera extends AppCompatActivity {
    Date currentTime = Calendar.getInstance().getTime();

    String phone;

    CardView cardView1;
    CardView cardView2;
    CardView cardView5;
    CardView cardView3;
    CardView cardView4;
    CardView cardView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_camera);

        phone = FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber();


        cardView1 = findViewById(R.id.camcard1);
        cardView2 = findViewById(R.id.camcard2);
        cardView3 = findViewById(R.id.camcard3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(camera.this,checkout.class);
                startActivity(intent1);

            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(camera.this,checkout.class);
                startActivity(intent1);


            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(camera.this,checkout.class);
                startActivity(intent1);

            }
        });

    }
}