package com.kopecky.e_bezpeci;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WebcamtrollingActivity extends FragmentActivity {

    ViewPager viewPager;
    ViewPageAdapter adapter;

    private int[] images = {
            R.drawable.page_webcamtrolling1,
            R.drawable.page_webcamtrolling2,
            R.drawable.page_webcamtrolling3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webcamtrolling);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new ViewPageAdapter(this, images);
        viewPager.setAdapter(adapter);
    }
}
