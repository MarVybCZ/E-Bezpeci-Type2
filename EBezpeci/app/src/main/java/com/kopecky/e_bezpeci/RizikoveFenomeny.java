package com.kopecky.e_bezpeci;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

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

    public void kybergroomingClick(View view) {
        Intent intent = new Intent(this, KybergroomingActivity.class);
        startActivity(intent);
    }

    public void sextingClick(View view) {
        Intent intent = new Intent(this, SextingActivity.class);
        startActivity(intent);
    }

    public void webcamtrollingClick(View view) {
        Intent intent = new Intent(this, WebcamtrollingActivity.class);
        startActivity(intent);
    }

    public void challengeClick(View view) {
        Intent intent = new Intent(this, ChallengeActivity.class);
        startActivity(intent);
    }

    public void fakenewsClick(View view) {
        Intent intent = new Intent(this, FakenewsActivity.class);
        startActivity(intent);
    }

    public void hoaxClick(View view) {
        Intent intent = new Intent(this, HoaxActivity.class);
        startActivity(intent);
    }
}
