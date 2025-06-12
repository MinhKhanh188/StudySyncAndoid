package com.example.studysyncandoid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        boolean isLoggedIn = prefs.getBoolean("isLoggedIn", false);

        if (isLoggedIn) {
            startActivity(new Intent(this, HomeActivity.class));
        } else {
            startActivity(new Intent(this, MainActivity.class)); // This is your login screen
        }
        finish(); // Close SplashActivity
    }
}
