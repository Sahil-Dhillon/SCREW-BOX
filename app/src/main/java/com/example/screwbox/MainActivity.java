package com.example.screwbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ListView;

import com.firebase.ui.auth.AuthUI;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private static final int RC_SIGN_IN = 123;
    Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                startActivityForResult(
//
//                        AuthUI.getInstance()
//                                .createSignInIntentBuilder()
//                                .setIsSmartLockEnabled(true)
//                                .setLogo(R.drawable.im)
//                                .setAlwaysShowSignInMethodScreen(true)
//                                .setTheme(R.style.AuthenticationTheme)
//                                .setAvailableProviders(Arrays.asList(
//                                        new AuthUI.IdpConfig.GoogleBuilder().build(),
//                                        new AuthUI.IdpConfig.PhoneBuilder().build()))
//                                .setTosAndPrivacyPolicyUrls("https://superapp.example.com/terms-of-service.html",
//                                        "https://superapp.example.com/privacy-policy.html")
////                                .build(),
////
////                        RC_SIGN_IN);
                Intent intent = new Intent(MainActivity.this,home.class);
                startActivity(intent);
                finish();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                },500);




            }
        }, 2000);




    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,home.class);
                startActivity(intent);
                finish();



            }
        }, 2000);


    }
}