package com.kopecky.e_bezpeci;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class KybersikanaActivity extends FragmentActivity {

    ViewPager viewPager;
    ViewPageAdapter adapter;

    private String[] images = {
          "drawable/page_kybersikana1.jpg",
          "drawable/page_kybersikana2.jpg",
          "drawable/page_kybersikana3.jpg",
          "drawable/page_kybersikana4.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kybersikana);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new ViewPageAdapter((Activity)this, images);
        viewPager.setAdapter(adapter);
    }
}