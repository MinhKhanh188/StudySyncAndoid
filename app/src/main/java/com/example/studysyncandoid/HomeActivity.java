package com.example.studysyncandoid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    TextView welcomeText;
    Button closeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcomeText = findViewById(R.id.textViewWelcome);
        closeBtn = findViewById(R.id.buttonClose);

        String name = getIntent().getStringExtra("userName");
        welcomeText.setText("Welcome, " + name + "!");

        closeBtn.setOnClickListener(v -> finishAffinity()); // closes the app
    }
}
