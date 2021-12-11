package com.example.midterm2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mText;
    private EditText mEdit;
    String str;

    int size=20;

    Button set,clear,textbig,textsmall,rred,ooran,ggreen,bblue,bbrown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        set=(Button)findViewById(R.id.b1);
        clear=(Button)findViewById(R.id.b2);
        textbig=(Button)findViewById(R.id.t1);
        textsmall=(Button)findViewById(R.id.t2);
        rred=(Button)findViewById(R.id.bred);
        ooran=(Button)findViewById(R.id.boran);
        ggreen=(Button)findViewById(R.id.bgreen);
        bblue=(Button)findViewById(R.id.bblue);
        bbrown=(Button)findViewById(R.id.bbrown);
        mText=(TextView)findViewById(R.id.text1);
        mEdit=(EditText)findViewById(R.id.editText1);

        mEdit.setOnKeyListener(new EditText.OnKeyListener(){
            @Override
            public boolean onKey(View arg0, int arg1, KeyEvent arg2){
                str=mEdit.getText().toString();
                return false;
            }
        });
        set.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                mText.setText(str);
            }
        });
        textbig.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                mText.setTextSize(size++);
            }
        });
        textsmall.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                mText.setTextSize(size--);
            }
        });

        rred.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                int clr= Color.argb(255,255,0,0);
                mText.setTextColor(clr);
            }
        });
        ooran.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                int clr= Color.argb(255,255,128,0);
                mText.setTextColor(clr);
            }
        });
        ggreen.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                int clr= Color.argb(255,0,255,0);
                mText.setTextColor(clr);
            }
        });
        bblue.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                int clr= Color.argb(255,0,0,255);
                mText.setTextColor(clr);
            }
        });
        bbrown.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                int clr= Color.argb(255,132,43,0);
                mText.setTextColor(clr);
            }
        });

    }
}
