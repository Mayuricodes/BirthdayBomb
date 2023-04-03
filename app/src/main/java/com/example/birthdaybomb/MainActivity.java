package com.example.birthdaybomb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2, t3;
    Handler handler;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        t3 = findViewById(R.id.text3);

        img = findViewById(R.id.img);
        img.setVisibility(View.INVISIBLE);

        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                t1.setText("Happy");

                secMethod();

            }
        }, 1000);
    }

    private void secMethod() {
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                t2.setText("Birthday");

                thirdMethod();

            }
        }, 2000);
    }

    private void thirdMethod() {

        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                t3.setText("Mayuri");

                forMethod();

            }
        }, 2000);
    }

    private void forMethod() {
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                img.setVisibility(View.VISIBLE);
            }
        }, 2000);    }

}

