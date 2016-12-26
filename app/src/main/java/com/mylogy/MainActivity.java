package com.mylogy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mylogy.MyLogs;


public class MainActivity extends AppCompatActivity {
    TextView textViewColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewColor = (TextView) findViewById(R.id.textViewColor);

        textViewColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyLogs.print = true;
                MyLogs.d("MyLogs Error", "Debug");
                MyLogs.i("MyLogs Error", "INFO");
                MyLogs.e("MyLogs Error", "error");
                MyLogs.v("MyLogs Error", "VERBOSE");
                MyLogs.w("MyLogs Error", "WARN");

            }
        });
    }
}
