package com.example.studysyncandoid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InstagramLoginActivity extends AppCompatActivity {
    EditText usernameEditText, passwordEditText;
    Button loginButton;
    TextView messageTextView;  // Add this

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram_login);

        usernameEditText = findViewById(R.id.editText3);
        passwordEditText = findViewById(R.id.editText4);
        loginButton = findViewById(R.id.button);
        messageTextView = findViewById(R.id.messageTextView);

        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (username.equals("admin") && password.equals("123456")) {
                messageTextView.setText("Instagram Login Successful! 🌸");
            } else {
                messageTextView.setText("Invalid credentials, please try again.");
            }
        });
    }
}
