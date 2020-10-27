package com.example.screwbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;

public class userinfo extends AppCompatActivity {

    DatabaseReference reff;
    TextView phone;
    TextView name ;
    TextView address ;
    TextView email ;
    Button button ;
    TextView user_name;
    TextView user_address;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);



//        phone  = findViewById(R.id.phoneid);
//        name = findViewById(R.id.nameid);
//        address = findViewById(R.id.addressid);
//        email = findViewById(R.id.emailid);
//        user_name = (TextView) findViewById(R.id.username);
//
//
//        button = (Button)findViewById(R.id.btnproceed);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text_address = address.getText().toString();
//                String text_name = name.getText().toString();
//                String text_phone = phone.getText().toString();
//                String text_email = email.getText().toString();
//
//                if (TextUtils.isEmpty(text_name)){
//                    Toast.makeText(userinfo.this, "Enter name", Toast.LENGTH_SHORT).show();
//                } else if (text_phone.length() < 10){
//                    Toast.makeText(userinfo.this, "Invalid Phone no.", Toast.LENGTH_SHORT).show();
//                } else if (TextUtils.isEmpty(text_address)) {
//                    Toast.makeText(userinfo.this, "Enter address", Toast.LENGTH_SHORT).show();
//                }else if (TextUtils.isEmpty(text_email)){
//                    Toast.makeText(userinfo.this, "Enter email", Toast.LENGTH_SHORT).show();
//                } else {
////                    ((checkout) getApplicationContext()).setUseraddress(text_address);
//                    //user_address.setText(text_address.);
//                    //user_name.setText(text_name);
//                    reff= FirebaseDatabase.getInstance().getReference().child("users");
//                    reff.push().setValue(text_name+" "+text_address+" "+text_phone + " "+ text_email);
//
//
//                    Intent intent = new Intent(userinfo.this,home.class);
//                    startActivity(intent);
//                    finish();
//
//                }
//            }
//        });



    }

}
