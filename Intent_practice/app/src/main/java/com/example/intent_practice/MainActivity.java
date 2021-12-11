package com.example.intent_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    String str1,str2;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.button1);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);



        et1.setOnKeyListener(new EditText.OnKeyListener(){
            @Override
            public boolean onKey(View arg0, int arg1, KeyEvent arg2){
                str1=et1.getText().toString();
                return false;
            }
        });
        et2.setOnKeyListener(new EditText.OnKeyListener(){
            @Override
            public boolean onKey(View arg0, int arg1, KeyEvent arg2){
                str2=et2.getText().toString();
                return false;
            }
        });

        bt1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){


                Intent intent1=new Intent();
                intent1.setClass(MainActivity.this,ActivitySub_add.class);
                intent1.putExtra("a",str1);
                intent1.putExtra("b",str2);
                startActivity(intent1);
                MainActivity.this.finish();
            }
        });



    }
}
