package com.example.linearcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText et;
    Button b[]=new Button[19];
    int id[]={R.id.btClr,R.id.btBack,R.id.btPer,R.id.btDiv,
            R.id.bt7,R.id.bt8,R.id.bt9,R.id.btMul,
            R.id.bt4,R.id.bt5,R.id.bt6,R.id.btSub,
            R.id.bt3,R.id.bt2,R.id.bt1,R.id.btAdd,
            R.id.btDot,R.id.bt0,R.id.btEql};

            int i;
    String num="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et);


        for(i=0;i<b.length;i++)
        {
            b[i]=findViewById(id[i]);
            b[i].setOnClickListener(this);
        }


    }

    @Override
    public void onClick(View view) {
        Button bt=(Button)view;

        String label=bt.getText().toString();
        char ch=label.charAt(0);
        if(ch>='0' && ch<='9')
        {
            num=num+ch;
        }
        else if(ch=='C')
        {
            et.setText(" ");
        }
        else if(ch=='B')
        {
            num=num.substring(0,num.length()-1);
        }
        et.setText(num);
    }
}