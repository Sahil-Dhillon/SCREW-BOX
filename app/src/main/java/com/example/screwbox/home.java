package com.example.screwbox;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityOptionsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Arrays;
import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.inappmessaging.model.Text;

public class home extends AppCompatActivity {
    private static final int RC_SIGN_IN = 123;
    private AppBarConfiguration mAppBarConfiguration;
    TextView user_name;
    static String user_id;
//    public static class SaveSharedPreference
//    {
//
//
//        static SharedPreferences getSharedPreferences(Context ctx) {
//            return PreferenceManager.getDefaultSharedPreferences(ctx);
//        }
//
//        public static void setUserid(Context ctx, String userid)
//        {
//            SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
//            editor.putString(user_id, userid);
//            editor.apply();
//        }
//
//        public static String getUserid(Context ctx)
//        {
//            return getSharedPreferences(ctx).getString(FirebaseAuth.getInstance().getUid(), "");
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "call 9653568039 for any query", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);






//        SaveSharedPreference.setUserid(home.this,FirebaseAuth.getInstance().getUid());
//
//        if(SaveSharedPreference.getUserid(home.this).length() == 0)
//        {
//            Toast.makeText(this, "Sign in to continue", Toast.LENGTH_SHORT).show();
////            // call Login Activity
//
//        }
//        else
//        {
//            Toast.makeText(this, "Signed in", Toast.LENGTH_SHORT).show();
//            // Stay at the current activity.
//        }
//        TextView textView = findViewById(R.id.textView4);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent =new Intent(home.this,homeappliance.class);
//                startActivity(intent);
//            }
//        });

        startActivityForResult(

                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setIsSmartLockEnabled(true)
                        .setLogo(R.drawable.im)
                        .setAlwaysShowSignInMethodScreen(true)
                        .setTheme(R.style.AuthenticationTheme)
                        .setAvailableProviders(Arrays.asList(
                                new AuthUI.IdpConfig.PhoneBuilder().build(),
                                new AuthUI.IdpConfig.GoogleBuilder().build()))
                        .setTosAndPrivacyPolicyUrls("https://superapp.example.com/terms-of-service.html",
                                "https://superapp.example.com/privacy-policy.html")
                        .build(),

                RC_SIGN_IN);


    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void cam(View view){
        Intent in = new Intent(this,camera.class); startActivity(in);

    }
    public void auto(View view){
        Intent in = new Intent(this,autoactivity.class); startActivity(in);

    }
    public void comp(View view){
        Intent in = new Intent(this,computer.class); startActivity(in);

    }
    public void home(View view){
        Intent in = new Intent(this,homeappliance.class); startActivity(in);

    }
    public void wire(View view){
        Intent in = new Intent(this,wiring.class); startActivity(in);

    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}