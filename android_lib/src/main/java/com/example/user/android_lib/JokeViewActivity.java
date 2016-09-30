package com.example.user.android_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeViewActivity extends AppCompatActivity {
    public static String extraKey="JOKE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_view);

        String joke=getIntent().getStringExtra(extraKey);
        TextView jokeView = (TextView)findViewById(R.id.joke_display);
        jokeView.setText(joke);
    }
}
