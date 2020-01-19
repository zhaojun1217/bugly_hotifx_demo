package com.zhaoj.buglu_hotfix_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tencent.bugly.Bugly;

public class MainActivity extends AppCompatActivity {

    private Button btnHotfix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHotfix = findViewById(R.id.btnHotfix);

        btnHotfix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "btnHotFix", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
