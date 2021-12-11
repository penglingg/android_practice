package com.example.final_exam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BIR2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bir2);

        TextView t1=(TextView)findViewById(R.id.text1);
        TextView t2=(TextView)findViewById(R.id.text2);
        TextView t3=(TextView)findViewById(R.id.tt1);
        TextView t4=(TextView)findViewById(R.id.tt2);
        TextView t5=(TextView)findViewById(R.id.tt3);
        Button b1=(Button)findViewById(R.id.button3);
        Button b2=(Button)findViewById(R.id.button4);

        Intent intent = this.getIntent();
        String gender = intent.getStringExtra("gender");
        String weight = intent.getStringExtra("weight");
        String height = intent.getStringExtra("height");
        String year = intent.getStringExtra("year");

        t3.setText(weight);
        t4.setText(height);
        t5.setText(year);
        int a=Integer.parseInt(weight);
        int b=Integer.parseInt(height);
        int c=Integer.parseInt(year);
        double aa=(double)a,cc=(double)c;
        double bb=(double)b;bb=bb/100;
        double BMI,BMR;

        BMI=aa/(bb*bb);


        if(gender.equals("male")){
            BMR=(13.4*aa)+(4.8*bb)-(5.7*cc)+88.4;
        }
        else{
            BMR=(9.3*aa)+(3.0*bb)-(4.3*cc)+447.6;
        }

        if(BMI<16.0){
            t1.setTextColor(Color.parseColor("#FFFF00FF"));
            t1.setText(String.valueOf(BMI)+"嚴重過輕");
        }
        else if(16.0<=BMI && BMI<18.5){
            t1.setTextColor(Color.parseColor("#FF0000FF"));
            t1.setText(String.valueOf(BMI)+"過輕");
        }
        else if(18.5<=BMI && BMI<25.0){
            t1.setTextColor(Color.parseColor("#FF00FF00"));
            t1.setText(String.valueOf(BMI)+"正常");
        }
        else if(25.0<=BMI && BMI<30.0){
            t1.setTextColor(Color.parseColor("#FFFFC000"));
            t1.setText(String.valueOf(BMI)+"過重");
        }
        else if(30.0<=BMI && BMI<35.0){
            t1.setTextColor(Color.parseColor("#FFFA3248"));
            t1.setText(String.valueOf(BMI)+"肥胖");
        }
        else{
            t1.setTextColor(Color.parseColor("#FFC00000"));
            t1.setText(String.valueOf(BMI)+"嚴重肥胖");
        }
        t2.setText(String.valueOf(BMR));

        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent();
                intent2.setClass(BIR2.this,MainActivity.class);
                startActivity(intent2);
                BIR2.this.finish();
            }
        });


    }
}
