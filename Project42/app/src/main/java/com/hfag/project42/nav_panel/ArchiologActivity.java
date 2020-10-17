package com.hfag.project42.nav_panel;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.hfag.project42.R;

public class ArchiologActivity extends AppCompatActivity {
    public MediaPlayer musicOfPark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archiolog);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        musicOfPark = MediaPlayer.create(this, R.raw.hummer);
        musicOfPark.start();
    }
}