package com.kopecky.e_bezpeci;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SextingActivity extends FragmentActivity {

    ViewPager viewPager;
    ViewPageAdapter adapter;

    private int[] images = {
            R.drawable.page_sexting1,
            R.drawable.page_sexting2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexting);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new ViewPageAdapter(this, images);
        viewPager.setAdapter(adapter);
    }
}
