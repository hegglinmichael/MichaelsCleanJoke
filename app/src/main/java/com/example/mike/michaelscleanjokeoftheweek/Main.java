package com.example.mike.michaelscleanjokeoftheweek;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.TextView;

/**
 * Created by mike on 8/9/2015.
 */
public class Main extends Activity {

    //creates the textview for the joke
    TextView jokeLine = null;
    TextView punchLine = null;
    //creates the mediaplayer for the opening sound
    MediaPlayer dunSound = null;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        //links the te4xtview to the xml
        jokeLine = (TextView)findViewById(R.id.JokeLine);
        punchLine = (TextView)findViewById(R.id.PunchLine);
        //links the mediaPlayer to the sound file
        dunSound = MediaPlayer.create(this, R.raw.mainnoise);
        //starts the sound whwn the main screen opens
        dunSound.start();
    }

}
