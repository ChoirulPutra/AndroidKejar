package com.splass.choirul.splass;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class carnivora4 extends AppCompatActivity {

    ImageButton ib;
    Button btnLogin2;
    Button btnLogin3;
    ImageButton ib2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnivora4);
        ib = (ImageButton) findViewById(R.id.imageButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.serigala);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        ib2 = findViewById(R.id.imageButton2);
        btnLogin3 = (Button)findViewById(R.id.button3);
        btnLogin2 = (Button)findViewById(R.id.button2);

        btnLogin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carnivora4.this, carnivora5.class);
                carnivora4.this.startActivity(intent);
                mp.stop();
            }
        });

        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carnivora4.this,carnivora3.class);
                carnivora4.this.startActivity(intent);
                mp.stop();
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(carnivora4.this, Menu.class);
                carnivora4.this.startActivity(intent);
                mp.stop();
            }
        });
    }
}
