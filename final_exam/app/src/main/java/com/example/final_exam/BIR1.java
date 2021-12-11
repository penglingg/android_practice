package com.example.final_exam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BIR1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bir1);
        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);

        TextView t1=(TextView)findViewById(R.id.t1);
        TextView t2=(TextView)findViewById(R.id.t2);
        TextView t3=(TextView)findViewById(R.id.t3);
        TextView t4=(TextView)findViewById(R.id.t4);


        Intent intent = this.getIntent();
        final String gender = intent.getStringExtra("gender");
        final String weight = intent.getStringExtra("weight");
        final String height = intent.getStringExtra("height");
        final String year = intent.getStringExtra("year");

        t1.setText(weight);
        t2.setText(height);
        t3.setText(year);
        t4.setText(gender);

        b1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent();
                intent2.setClass(BIR1.this,BIR2.class);
                intent2.putExtra("gender",gender);
                intent2.putExtra("weight",weight);
                intent2.putExtra("height",height);
                intent2.putExtra("year",year);
                startActivity(intent2);
                BIR1.this.finish();
            }
        });
        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent();
                intent2.setClass(BIR1.this,MainActivity.class);
                startActivity(intent2);
                BIR1.this.finish();
            }
        });

    }
}
