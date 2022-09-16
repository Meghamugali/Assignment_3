package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button_toast;
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button_toast = findViewById(R.id.button_toast);

    }
    public void showToast(View view) {
        String msg = "Hello!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this,msg,duration);
        //toast.show();
        String count = mShowCount.getText().toString();
        Intent intent=new Intent(this,HomeActivity.class);
        intent.putExtra("ckey" ,msg);
        intent.putExtra("nkey", count);

        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));

        }
    }
}