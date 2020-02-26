package com.teamproject.lifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "myTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"1.onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG,"2.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"3.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"4.onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"5.onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"2-0.onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"6.onDestroy()");
    }

    public void onClickCall(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
