package com.zhaoj.buglu_hotfix_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.bugly.Bugly;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button btnHotfix;
    private ImageView imgLogo;
    private TextView tvSetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHotfix = findViewById(R.id.btnHotfix);
        imgLogo = findViewById(R.id.imgLogo);
        tvSetText = findViewById(R.id.tvSetText);

        btnHotfix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "这里是热更新的点击事件", Toast.LENGTH_SHORT).show();
            }
        });
        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "这里是logo的点击事件", Toast.LENGTH_SHORT).show();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");// HH:mm:ss
                //获取当前时间
                Date date = new Date(System.currentTimeMillis());
                tvSetText.setText("Date获取当前日期时间" + simpleDateFormat.format(date));
            }
        });
    }
}
