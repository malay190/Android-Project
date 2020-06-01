package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b9,b8,b7,b6,b5,b4,b3,b2,b1,b0,badd,bsub,bmul,bdiv,bequal,bdot,bclear;
    TextView t1,t2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b9 = (Button) findViewById(R.id.btn9);
        b8 = (Button) findViewById(R.id.btn8);
        b7 = (Button) findViewById(R.id.btn7);
        b6 = (Button) findViewById(R.id.btn6);
        b5 = (Button) findViewById(R.id.btn5);
        b4 = (Button) findViewById(R.id.btn4);
        b3 = (Button) findViewById(R.id.btn3);
        b2 = (Button) findViewById(R.id.btn2);
        b1 = (Button) findViewById(R.id.btn1);
        b0 = (Button) findViewById(R.id.btn0);
        badd = (Button) findViewById(R.id.btnadd);
        bsub = (Button) findViewById(R.id.btnsub);
        bmul = (Button) findViewById(R.id.btnmul);
        bdiv = (Button) findViewById(R.id.btndiv);
        bequal = (Button) findViewById(R.id.btnequal);
        bdot = (Button) findViewById(R.id.btndot);
        bclear =(Button) findViewById(R.id.btnclear);

        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t1.set
                    }
                }

        );

        bclear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t1.clearComposingT
                    }
                }
        );







    }
}
