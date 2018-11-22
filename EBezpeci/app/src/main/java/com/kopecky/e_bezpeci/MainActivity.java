package com.kopecky.e_bezpeci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import android.media.MediaPlayer;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.VVBlesk);
        videoView.setVideoPath("android.resource://"+  getPackageName() + "/raw/video");

        //https://stackoverflow.com/questions/4746075/seamless-video-loop-with-videoview
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
                mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING);
            }
        });

        videoView.start();
    }

    public void rizikoveFenomenyClick(android.view.View view){
        Intent intent = new Intent(this, RizikoveFenomeny.class);
        startActivity(intent);
    }

    public void krizoveClick(View view) {
        Intent intent = new Intent(this, KrizoveActivity.class);
        startActivity(intent);
    }

    public void pomocClick(View view) {
        Intent intent = new Intent(this, PomocActivity.class);
        startActivity(intent);
    }
}
