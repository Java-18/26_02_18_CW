package com.sheygam.java_18_26_02_18_cw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MultiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        String action = getIntent().getAction();
        if (action != null && action.equals("my.first.action")) {
            Toast.makeText(this, "Was started with first action", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Was started with second", Toast.LENGTH_SHORT).show();
        }
    }
}
