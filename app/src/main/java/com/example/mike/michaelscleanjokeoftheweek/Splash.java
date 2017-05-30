package com.example.mike.michaelscleanjokeoftheweek;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Splash extends Activity {

    MediaPlayer drumRoll = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //links the MediaPlayer to the sound file
        drumRoll = MediaPlayer.create(this, R.raw.drumroll);
        //starts the sound file
        drumRoll.start();

        //creates a thread that has the opening screen stay open for 3s
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    //is an intent to open up the next activity
                    Intent intent = new Intent("android.intent.action.Main");
                    //opens the next activity
                    startActivity(intent);
                    //stops the drum roll
                    drumRoll.release();
                }
            }
        };
        //startes the thread
        timer.start();
    }
}
