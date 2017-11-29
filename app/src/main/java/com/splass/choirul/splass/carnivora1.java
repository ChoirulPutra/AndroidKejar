package com.splass.choirul.splass;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class carnivora1 extends AppCompatActivity {
    ImageButton ib;
    Button btnPrev;
    Button btnNext;
    ImageButton ib2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnivora1);
        ib = (ImageButton) findViewById(R.id.imageButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.harimau);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        btnNext = (Button) findViewById(R.id.button3);
        btnPrev = (Button) findViewById(R.id.button2);
        ib2 = findViewById(R.id.imageButton2);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carnivora1.this, carnivora2.class);
                carnivora1.this.startActivity(intent);
                mp.stop();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carnivora1.this, Menu.class);
                carnivora1.this.startActivity(intent);
                mp.stop();
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carnivora1.this, Menu.class);
                carnivora1.this.startActivity(intent);
                mp.stop();
            }
        });
    }
}
