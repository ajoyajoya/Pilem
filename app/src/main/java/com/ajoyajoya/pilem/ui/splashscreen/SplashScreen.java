package com.ajoyajoya.pilem.ui.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.ui.MainActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() -> {

            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            finish();
        },2000);
    }
}
