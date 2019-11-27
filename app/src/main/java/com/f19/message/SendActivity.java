package com.f19.message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendActivity extends AppCompatActivity {

    private static String TAG = "android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: 1");
        final EditText et = findViewById(R.id.message);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                Intent intent = new Intent(SendActivity.this, RecvActivity.class);
                intent.putExtra("message", str);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: 1");
    }
}
