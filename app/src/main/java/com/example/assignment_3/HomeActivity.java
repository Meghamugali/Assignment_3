package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView tvname ;
    private TextView tvcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent=getIntent();
        String name = getIntent().getExtras().getString("nkey");
        tvname = findViewById(R.id.tvname);
        tvname.setText(name);
        String count= getIntent().getExtras().getString("ckey");
        tvname = findViewById(R.id.tvcount);
        tvname.setText(count);

    }
}