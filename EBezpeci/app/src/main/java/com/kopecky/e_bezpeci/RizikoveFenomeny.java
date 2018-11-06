package com.kopecky.e_bezpeci;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public class RizikoveFenomeny extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rizikove_fenomeny);
    }

    public void zpetClick(android.view.View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void kybersikanaClick(android.view.View view){
        Intent intent = new Intent(this, KybersikanaActivity.class);
        startActivity(intent);
    }
}
