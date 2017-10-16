package com.example.rossmaguire.visionapitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activityAnalyzeInDomain(View v) {
        Intent intent = new Intent(this, AnalyseImageActivity.class);
        startActivity(intent);
    }
}
