package com.example.apamr.livecricket;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar prog;

    Button lets;
    int progStatus=0;
    Handler handle= new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prog=(ProgressBar)findViewById(R.id.progress);

        lets=(Button)findViewById(R.id.check1);

        lets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progStatus < 100){
                    progStatus++;
                    android.os.SystemClock.sleep(50);
                    handle.post(new Runnable() {
                        @Override
                        public void run() {
                            prog.setProgress(progStatus);
                        }
                    });
                }
                    handle.post(new Runnable() {
                        @Override
                        public void run() {

                            lets.setVisibility(View.VISIBLE);
                        }
                    });
            }

        }).start();
    }
}
