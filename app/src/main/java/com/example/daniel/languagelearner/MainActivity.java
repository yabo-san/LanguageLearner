package com.example.daniel.languagelearner;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//Kevin is cool
    public void hello(View view){
        MediaPlayer mplayer = MediaPlayer.create(this,R.raw.helloamharic);
        mplayer.start();
        mplayer.reset();

    }

    public void goodbye(View view){
        MediaPlayer mplayer = MediaPlayer.create(this,R.raw.goodbye);
        mplayer.start();
    }

    public void how1(View view){
        MediaPlayer mplayer = MediaPlayer.create(this, R.raw.howareyoumale);
        mplayer.start();
        mplayer.reset();

    }

    public void how2(View view){
        MediaPlayer mplayer = MediaPlayer.create(this,R.raw.howareyoufemale);
        mplayer.start();
        mplayer.reset();
    }
    public void thank(View view){
        MediaPlayer mplayer = MediaPlayer.create(this,R.raw.thankyouamharic);
        mplayer.start();
        mplayer.reset();

    }
    public void konjo(View view){
        MediaPlayer mplayer = MediaPlayer.create(this,R.raw.konjo);
        mplayer.start();
        mplayer.reset();


    }
    public void yene(View view) {
        MediaPlayer mplayer = MediaPlayer.create(this, R.raw.mynameisam);
        mplayer.start();
        mplayer.reset();

    }
    public void sorry(View view) {
        MediaPlayer mplayer = MediaPlayer.create(this, R.raw.imsorry);
        mplayer.start();
        mplayer.reset();

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
