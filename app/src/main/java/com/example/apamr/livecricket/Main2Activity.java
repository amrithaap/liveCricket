package com.example.apamr.livecricket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Main2Activity extends AppCompatActivity {
    ProgressBar spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spin=(ProgressBar)findViewById(R.id.progSpin);
        spin.setVisibility(View.GONE);
        Button b2=(Button)findViewById(R.id.btn1);
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               spin.setVisibility(View.VISIBLE);
               //Intent intent=new Intent(getApplicationContext(),Main3Activity.class);
               //startActivity(intent);
           }
       });

    }
}
