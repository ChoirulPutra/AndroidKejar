package com.splass.choirul.splass;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username,password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        Button button = (Button) findViewById(R.id.button);

        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ini adalah pesan Toast", Toast.LENGTH_LONG).show();// Set your own toast  message
            }
        });*/
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText3);
        btnLogin = (Button)findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("123")) {
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this, Menu.class);
                    login.this.startActivity(intent);
                    finish();
                } else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}