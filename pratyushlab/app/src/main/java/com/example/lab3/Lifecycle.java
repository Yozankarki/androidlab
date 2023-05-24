package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Lifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle);
        Log.d("Lifecycle","oncreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","Onstart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "OnResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "Onpause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "Onstop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "ondestroy invoked");
    }
}