package com.example.final_exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name,email,year,weight,height;
    String sname,semail,syear,sweight,sheight;
    Button bir,bsa,ibw,exit;
    RadioGroup rg;
    RadioButton rb1,rb2;
    String str;
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=(RadioGroup)findViewById(R.id.radioGroup2);
        rb1=(RadioButton)findViewById(R.id.radioButton5);
        rb2=(RadioButton)findViewById(R.id.radioButton6);

        rg.check(R.id.radioButton5);
        rg.setOnCheckedChangeListener(radGrpRegionOnCheckedChange);

        bir=(Button)findViewById(R.id.BIR);
        bsa=(Button)findViewById(R.id.BSA);
        ibw=(Button)findViewById(R.id.IBW);
        exit=(Button)findViewById(R.id.Exit);

        name=(EditText)findViewById(R.id.Name);
        email=(EditText)findViewById(R.id.Email);
        year=(EditText)findViewById(R.id.Year);
        weight=(EditText)findViewById(R.id.Weight);
        height=(EditText)findViewById(R.id.Height);

        tt=(TextView) findViewById(R.id.tt);





        name.setOnKeyListener(new EditText.OnKeyListener(){
            @Override
            public boolean onKey(View arg0, int arg1, KeyEvent arg2){
                sname=name.getText().toString();
                return false;
            }
        });
        email.setOnKeyListener(new EditText.OnKeyListener(){
            @Override
            public boolean onKey(View arg0, int arg1, KeyEvent arg2){
                semail=email.getText().toString();
                return false;
            }
        });
        year.setOnKeyListener(new EditText.OnKeyListener(){
            @Override
            public boolean onKey(View arg0, int arg1, KeyEvent arg2){
                syear=year.getText().toString();
                return false;
            }
        });
        weight.setOnKeyListener(new EditText.OnKeyListener(){
            @Override
            public boolean onKey(View arg0, int arg1, KeyEvent arg2){
                sweight=weight.getText().toString();
                return false;
            }
        });
        height.setOnKeyListener(new EditText.OnKeyListener(){
            @Override
            public boolean onKey(View arg0, int arg1, KeyEvent arg2){
                sheight=height.getText().toString();
                return false;
            }
        });

        bir.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1=new Intent();
                intent1.setClass(MainActivity.this,BIR1.class);
                intent1.putExtra("gender",str);
                intent1.putExtra("weight",sweight);
                intent1.putExtra("height",sheight);
                intent1.putExtra("year",syear);
                startActivity(intent1);
                MainActivity.this.finish();
            }
        });
        ibw.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1=new Intent();
                intent1.setClass(MainActivity.this,IBW1.class);
                intent1.putExtra("gender",str);
                intent1.putExtra("weight",sweight);
                intent1.putExtra("height",sheight);
                startActivity(intent1);
                MainActivity.this.finish();
            }
        });
    }
    private RadioGroup.OnCheckedChangeListener radGrpRegionOnCheckedChange =
            new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId)
                {
                    switch (checkedId)
                    {
                        case R.id.radioButton5:
                            tt.setText("male");
                            break;

                        case R.id.radioButton6:
                            tt.setText("female");
                            break;

                    }
                    str= String.valueOf(tt.getText());
                }
            };

}