package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import com.example.myapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1;
    Button btn2;
    Button btn3;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 =(Button)findViewById(R.id.button);
        btn2 =(Button)findViewById(R.id.button2);
        btn3 =(Button)findViewById(R.id.button3);
        txt= (TextView)findViewById(R.id.text);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button){
            txt.setText("a,c,e,i,m,n,o,r,s,u,v,w,x,z");
        }
        if(view.getId()==R.id.button2){
            txt.setText("b,d,f,h,k,l,t ");

        }
        if(view.getId()==R.id.button3){
            txt.setText("g,j,p,q,y,");
        }



    }
}