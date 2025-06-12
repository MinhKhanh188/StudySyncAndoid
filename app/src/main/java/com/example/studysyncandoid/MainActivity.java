package com.example.studysyncandoid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Button saveButton;
    SharedPreferences prefs;
    public static final String PREFS_NAME = "MyPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        saveButton = findViewById(R.id.saveButton);

        prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        // Load previously saved data
        loadSavedData();

        saveButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Save to SharedPreferences
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("username", username);
            editor.putString("password", password); // Note: don't store real passwords like this!
            editor.putBoolean("isLoggedIn", true);
            editor.apply();

            Toast.makeText(this, "Login info saved!", Toast.LENGTH_SHORT).show();
        });
    }

    private void loadSavedData() {
        boolean isLoggedIn = prefs.getBoolean("isLoggedIn", false);
        if (isLoggedIn) {
            String savedUser = prefs.getString("username", "");
            String savedPass = prefs.getString("password", "");

            usernameEditText.setText(savedUser);
            passwordEditText.setText(savedPass);

            Toast.makeText(this, "Welcome back, " + savedUser, Toast.LENGTH_SHORT).show();
        }
    }
}
