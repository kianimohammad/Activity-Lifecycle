package com.f19.message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecvActivity extends AppCompatActivity {

    private static String TAG = "android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recv);

        Log.i(TAG, "onCreate: 2");
        TextView textView = findViewById(R.id.txt);
        Intent intent = getIntent();
        String str = intent.getExtras().getString("message");
        textView.setText(str);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: 2");
    }
}
