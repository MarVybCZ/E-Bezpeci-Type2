package com.kopecky.e_bezpeci;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HoaxActivity extends FragmentActivity {

    ViewPager viewPager;
    ViewPageAdapter adapter;

    private int[] images = {
            R.drawable.page_hoax1,
            R.drawable.page_hoax2,
            R.drawable.page_hoax3,
            R.drawable.page_hoax4,
            R.drawable.page_hoax5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoax);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new ViewPageAdapter(this, images);
        viewPager.setAdapter(adapter);
    }
}
