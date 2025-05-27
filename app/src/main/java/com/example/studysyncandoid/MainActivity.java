package com.example.studysyncandoid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studysyncandoid.adapter.TaskAdapter;
import com.example.studysyncandoid.data.TaskDatabase;
import com.example.studysyncandoid.model.Task;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button buttonInstagramLogin, buttonFacebookLogin;
    TextView debugTextView;  // add this

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInstagramLogin = findViewById(R.id.buttonInstagramLogin);
        buttonFacebookLogin = findViewById(R.id.buttonFacebookLogin);
        debugTextView = findViewById(R.id.debugTextView);

        buttonInstagramLogin.setOnClickListener(v -> {
            debugTextView.setText("Instagram button clicked 💜");
            Intent intent = new Intent(MainActivity.this, InstagramLoginActivity.class);
            startActivity(intent);
        });

        buttonFacebookLogin.setOnClickListener(v -> {
            debugTextView.setText("Facebook button clicked 💙");
            Intent intent = new Intent(MainActivity.this, FacebookLoginActivity.class);
            startActivity(intent);
        });
    }
}
