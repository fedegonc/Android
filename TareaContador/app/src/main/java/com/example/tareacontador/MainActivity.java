package com.example.tareacontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    private static final String COUNT_KEY = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt(COUNT_KEY);
            mShowCount.setText(String.valueOf(mCount));
        }
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(String.valueOf(mCount));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(COUNT_KEY, mCount);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mCount = savedInstanceState.getInt(COUNT_KEY);
        mShowCount.setText(String.valueOf(mCount));
    }
}
