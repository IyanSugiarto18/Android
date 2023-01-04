package com.iyansugiarto.sportenterpreneur.Activity.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.iyansugiarto.sportenterpreneur.R;

public class login extends AppCompatActivity {

    EditText edUsername , edPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            String username = edUsername.getText().toString();
            String password = edPassword.getText().toString();

            RequestQueue queue = Volley.newRequestQueue(this);
            String url = "https://www.google.com";

// Request a string response from the provided URL.
            StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            // Display the first 500 characters of the response string.
                            textView.setText("Response is: " + response.substring(0,500));
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    textView.setText("That didn't work!");
                }
            });

// Add the request to the RequestQueue.
            queue.add(stringRequest);
        });
    }
}