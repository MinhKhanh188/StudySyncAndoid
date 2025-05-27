package com.example.studysyncandoid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FacebookLoginActivity extends AppCompatActivity {
    EditText emailEditText, passwordEditText;
    Button loginButton;
    TextView messageTextView; // Optional: to show login result

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facebook_login);

        emailEditText = findViewById(R.id.editText);
        passwordEditText = findViewById(R.id.editText2);
        loginButton = findViewById(R.id.button);

        // If you want a result message, add this TextView in your XML first
        // messageTextView = findViewById(R.id.messageTextView);

        loginButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (email.equals("admin") && password.equals("123456")) {
                // You can show a toast or a messageTextView
                // messageTextView.setText("Facebook Login Successful! 💙");
            } else {
                // messageTextView.setText("Incorrect email or password.");
            }
        });
    }
}
