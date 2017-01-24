package com.example.peheri.sloppysoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button sloppyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sloppyButton = (Button) findViewById(R.id.sloppyButton);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sloppy);

        sloppyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
}
