package com.kopecky.e_bezpeci;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class FakenewsActivity extends FragmentActivity {

    ViewPager viewPager;
    ViewPageAdapter adapter;

    private int[] images = {
            R.drawable.page_fakenews1,
            R.drawable.page_fakenews2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakenews);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new ViewPageAdapter(this, images);
        viewPager.setAdapter(adapter);
    }
}
