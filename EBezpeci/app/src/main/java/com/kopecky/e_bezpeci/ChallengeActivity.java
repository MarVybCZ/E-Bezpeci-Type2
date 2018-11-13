package com.kopecky.e_bezpeci;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChallengeActivity extends FragmentActivity {

    ViewPager viewPager;
    ViewPageAdapter adapter;

    private int[] images = {
            R.drawable.page_challenge1,
            R.drawable.page_challenge2,
            R.drawable.page_challenge3,
            R.drawable.page_challenge4,
            R.drawable.page_challenge5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new ViewPageAdapter(this, images);
        viewPager.setAdapter(adapter);
    }
}
