package com.example.appmove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button upp;
    Button lleft;
    Button rright;
    Button ddown;
    ImageView ppic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        upp=(Button)findViewById(R.id.up);
        lleft=(Button)findViewById(R.id.left);
        rright=(Button)findViewById(R.id.right);
        ddown=(Button)findViewById(R.id.down);
        ppic=findViewById(R.id.pic);

        upp.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ppic.layout(ppic.getLeft(),ppic.getTop()-80,ppic.getRight(),ppic.getBottom()-80);
            }
        });
        lleft.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ppic.layout(ppic.getLeft()-80,ppic.getTop(),ppic.getRight()-80,ppic.getBottom());
            }
        });
        rright.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ppic.layout(ppic.getLeft()+80,ppic.getTop(),ppic.getRight()+80,ppic.getBottom());
            }
        });
        ddown.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ppic.layout(ppic.getLeft(),ppic.getTop()+80,ppic.getRight(),ppic.getBottom()+80);
            }
        });


    }
}
