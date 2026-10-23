package com.example.login; // <-- Yahan apna sahi package name likhein

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        LinearLayout centerLayout = findViewById(R.id.centerLayout);
        TextView tagline = findViewById(R.id.taglineText);

        centerLayout.setAlpha(0f);
        centerLayout.setScaleX(0.9f);
        centerLayout.setScaleY(0.9f);

        centerLayout.animate().alpha(1f).scaleX(1f).scaleY(1f).setDuration(800).start();
        tagline.animate().alpha(1f).setStartDelay(400).setDuration(800).start();

        // Yahan Handler theek kar diya gaya hai
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 1500);
    }
}