package com.example.final_exam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IBW2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ibw2);

        TextView t1=(TextView)findViewById(R.id.tt3);
        TextView t2=(TextView)findViewById(R.id.tt2);
        TextView t3=(TextView)findViewById(R.id.textView30);
        TextView t4=(TextView)findViewById(R.id.textView36);

        Button b1=(Button)findViewById(R.id.button7);
        Button b2=(Button)findViewById(R.id.button8);

        Intent intent = this.getIntent();
        String gender = intent.getStringExtra("gender");
        String weight = intent.getStringExtra("weight");
        String height = intent.getStringExtra("height");


        t1.setText(weight);
        t2.setText(height);

        int a=Integer.parseInt(weight);
        int b=Integer.parseInt(height);
        double aa=(double)a,bb=(double)b,IBW,x,y;

        if(gender.equals("male")){
            IBW=(bb-170)*0.6+62.0;
        }
        else{
            IBW=(bb-158)*0.5+52.0;
        }
        x=IBW*0.9;y=IBW*1.1;

        t3.setText(String.valueOf(IBW)+"kg");
        t3.setText("["+String.valueOf(x)+","+String.valueOf(y)+"]kg");


        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent();
                intent2.setClass(IBW2.this,MainActivity.class);
                startActivity(intent2);
                IBW2.this.finish();
            }
        });


    }
}
