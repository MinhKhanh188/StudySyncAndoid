package com.example.studysyncandoid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;
    SharedPreferences prefs;
    public static final String PREFS_NAME = "MyPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        // ✅ If already logged in, go to HomeActivity
        if (prefs.getBoolean("isLoggedIn", false)) {
            startActivity(new Intent(this, HomeActivity.class));
            finish(); // Prevent returning to login
            return;
        }

        // ⬇️ Continue to Login screen if not logged in
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.saveButton);

        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            // 🔐 Hardcoded check
            if (username.equals("admin") && password.equals("123456")) {
                prefs.edit()
                        .putBoolean("isLoggedIn", true)
                        .putString("username", username)
                        .apply();

                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, HomeActivity.class));
                finish();
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
