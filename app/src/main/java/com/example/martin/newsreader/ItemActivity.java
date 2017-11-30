package com.example.martin.newsreader;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.martin.newsreader.R;

public class ItemActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
    }

}