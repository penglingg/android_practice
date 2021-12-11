package com.example.intent_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySub_add extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button bt2=(Button)findViewById(R.id.button2);
        TextView t1=(TextView)findViewById(R.id.textView2);
        TextView t2=(TextView)findViewById(R.id.textView4);
        TextView ans=(TextView)findViewById(R.id.textView6);

        Intent intent = this.getIntent();
        String name1 = intent.getStringExtra("a");
        String name2 = intent.getStringExtra("b");

        int a=Integer.parseInt(name1);
        int b=Integer.parseInt(name2);
        int answer=a+b;
        t1.setText(name1);
        t2.setText(name2);
        String answ=String.valueOf(answer);
        ans.setText(answ);

        bt2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent3=new Intent();
                intent3.setClass(ActivitySub_add.this,MainActivity.class);
                startActivity(intent3);
                ActivitySub_add.this.finish();
            }
        });




    }
}
