package com.example.final_exam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IBW1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ibw1);
        Button b1=(Button)findViewById(R.id.button5);
        Button b2=(Button)findViewById(R.id.button6);

        TextView t1=(TextView)findViewById(R.id.t6);
        TextView t2=(TextView)findViewById(R.id.t7);

        Intent intent = this.getIntent();
        final String gender = intent.getStringExtra("gender");
        final String weight = intent.getStringExtra("weight");
        final String height = intent.getStringExtra("height");


        t1.setText(weight);
        t2.setText(height);


        b1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent();
                intent2.setClass(IBW1.this,IBW2.class);
                intent2.putExtra("gender",gender);
                intent2.putExtra("weight",weight);
                intent2.putExtra("height",height);

                startActivity(intent2);
                IBW1.this.finish();
            }
        });
        b2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent();
                intent2.setClass(IBW1.this,MainActivity.class);
                startActivity(intent2);
                IBW1.this.finish();
            }
        });

    }
}
