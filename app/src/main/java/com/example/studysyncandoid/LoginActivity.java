package com.example.studysyncandoid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText nameField;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameField = findViewById(R.id.editTextName);
        loginBtn = findViewById(R.id.buttonLogin);

        loginBtn.setOnClickListener(v -> {
            String name = nameField.getText().toString().trim();
            if (!name.isEmpty()) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("userName", name);
                startActivity(intent);
                finish(); // close LoginActivity
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        nameField.setText(""); // clear field when returning after minimize
    }
}

