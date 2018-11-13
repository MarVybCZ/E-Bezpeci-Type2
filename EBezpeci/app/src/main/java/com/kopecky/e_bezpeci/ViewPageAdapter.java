package com.kopecky.e_bezpeci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPageAdapter extends PagerAdapter {
    //private Activity activity;
    private int[] images;
    private Context context;
    private LayoutInflater inflater;

    public ViewPageAdapter(Context context, int[] images) {
        //this.activity = activity;
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (ConstraintLayout)o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.viewpager_item, container, false);

        ImageView image = (ImageView)itemView.findViewById(R.id.imageView);
        image.setImageResource(images[position]);

        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((ConstraintLayout)object);
    }
}
