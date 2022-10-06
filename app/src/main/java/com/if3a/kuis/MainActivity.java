package com.if3a.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton btn_signup, btn_login,btn_visitus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_signup = findViewById(R.id.btn_signup);
        btn_login = findViewById(R.id.btn_login);
        btn_visitus = findViewById(R.id.btn_visitus);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent(MainActivity.this, SignUp.class);
                startActivity(signup);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(MainActivity.this,Login.class);
                startActivity(login);
            }
        });

        btn_visitus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visitus= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.palembang.go.id"));
                startActivity(visitus);
            }
        });

    }
}