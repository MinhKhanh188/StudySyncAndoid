package com.example.studysyncandoid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button logoutButton;
    Button closeButton;
    TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logoutButton = findViewById(R.id.logoutButton);
        closeButton = findViewById(R.id.buttonClose);
        textViewWelcome = findViewById(R.id.textViewWelcome);

        // 🌟 Load saved username
        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String username = prefs.getString("username", "User");
        textViewWelcome.setText("Welcome, " + username + "!");

        // 🔐 Logout logic
        logoutButton.setOnClickListener(v -> {
            SharedPreferences.Editor editor = prefs.edit();
            editor.clear(); // Clear all stored data
            editor.apply();

            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        // ❌ Close app logic
        closeButton.setOnClickListener(v -> {
            finishAffinity(); // 💥 Close app
        });
    }
}
