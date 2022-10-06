package com.if3a.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.button.MaterialButton;

public class SignUp extends AppCompatActivity {
    private EditText et_fullname, et_email,et_password,et_confirmpassword;
    private Spinner sp_negara;
    private MaterialButton btn_signup1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        et_fullname = findViewById(R.id.et_fullname);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        et_confirmpassword = findViewById(R.id.et_confirmpassword);
        sp_negara = findViewById(R.id.sp_negara);
        btn_signup1 = findViewById(R.id.btn_signup1);

        btn_signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fullname= et_fullname.getText().toString();
                String email = et_email.getText().toString();
                String password = et_password.getText().toString();
                String confirmpassword = et_confirmpassword.getText().toString();
                String spinnernegara = sp_negara.getSelectedItem().toString();

                if (fullname.trim().isEmpty()){
                    et_fullname.setError("Nama tidak boleh kosong");
                }
                else if (email.trim().isEmpty()) {
                    et_email.setError("Email tidak boleh kosong");
                }
                else if (password.trim().isEmpty()){
                    et_password.setError("Password tidak boleh kosong");
                }
                else if (confirmpassword.trim().isEmpty() || confirmpassword != password){
                    et_confirmpassword.setError("Mohon diisi dengan akurat");
                }
                else{
                   Intent signup1 = new Intent(SignUp.this,Login.class);
                   startActivity(signup1);
                }
            }
        });


    }
}