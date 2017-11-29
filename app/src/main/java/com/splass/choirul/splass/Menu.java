package com.splass.choirul.splass;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    ImageButton btnCarnivora, btnHerbivora, btnOmnivora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnCarnivora = findViewById(R.id.btnCarnivora);
        btnHerbivora = findViewById(R.id.btnHerbivora);
        btnOmnivora = findViewById(R.id.btnOmnivora);

        btnCarnivora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Button Carnivora Clicked!",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Menu.this, carnivora1.class);
                    Menu.this.startActivity(intent);
            }
        });

        btnHerbivora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika login berhasil
                Toast.makeText(getApplicationContext(), "Button Herbivora Clicked!",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, herbivora1.class);
                Menu.this.startActivity(intent);
            }
        });

        btnOmnivora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika login berhasil
                Toast.makeText(getApplicationContext(), "Button Omnivora Clicked!",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Menu.this, Omnivora1.class);
                Menu.this.startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Menu.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
