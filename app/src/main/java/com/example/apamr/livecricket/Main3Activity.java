package com.example.apamr.livecricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button btnFour;
    Button btnSix;
    Button btnOnes;
    Button btnExtras;
    TextView textTotalScore;
    TextView txtFinal;
    int total_runs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
      btnFour=(Button)findViewById(R.id.button1);
      btnSix=(Button)findViewById(R.id.six);
      btnOnes=(Button)findViewById(R.id.single);
      btnExtras=(Button)findViewById(R.id.extra);
      txtFinal=(TextView)findViewById(R.id.textFinal);




        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total_runs += 4;
                //Toast.makeText(getApplicationContext(),"'"+total_runs+"' Total runs",Toast.LENGTH_SHORT).show();
                txtFinal.setText("Total Score is: "+total_runs);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total_runs += 6;
                Toast.makeText(getApplicationContext(),"'"+total_runs+"' Total runs",Toast.LENGTH_SHORT).show();
                txtFinal.setText("Total Score is: "+total_runs);
            }
        });


        btnOnes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total_runs += 1;
                Toast.makeText(getApplicationContext(),"'"+total_runs+"' Total runs",Toast.LENGTH_SHORT).show();
                txtFinal.setText("Total Score is: "+total_runs);
            }
        });

        btnExtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total_runs += 1;

                txtFinal.setText("Total Score is: "+total_runs);
            }
        });
    }
}
