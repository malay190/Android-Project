package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;

import java.nio.file.AccessMode;

public class MainActivity extends AppCompatActivity {
    Button b9,b8,b7,b6,b5,b4,b3,b2,b1,b0,badd,bsub,bmul,bdiv,bequal,bdot,bclear;
    TextView t1,t2;
    EditText e1,e2;
    private static final String ADDITION = "+";
    private static final String SUBTRACTION = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static final String EQU = "=";
    private static String ACTION;
    private double val1 = Double.NaN;
    private double val2;
    private double Result;

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

        b0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "0");
                    }
                }

        );

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "1");
                    }
                }

        );

        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "2");
                    }
                }

        );

        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "3");
                    }
                }

        );

        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "4");
                    }
                }

        );

        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "5");
                    }
                }

        );

        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "6");
                    }
                }

        );

        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "7");
                    }
                }

        );

        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t1.setText(t1.getText().toString() + "8");
                    }
                }

        );

        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        t2.setText(t2.getText().toString() + "9");
                    }
                }

        );

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(t2.getText().toString() + ".");
            }
        });

        badd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        );

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                t2.setText(t2.getText().toString()+"+");
                t1.setText(String.valueOf(val1));


            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                t1.setText(String.valueOf(val1) + "-");

            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                t1.setText(String.valueOf(val1) + "*");
                t2.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                t1.setText(String.valueOf(val1) + "/");
                t2.setText(null);
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                t1.setText(String.valueOf(val1));
                // 5 + 4 = 9
                t2.setText(null);
            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t2.getText().length() > 0){
                    CharSequence name = t2.getText().toString();
                    t2.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    t2.setText(null);
                    t1.setText(null);
                }
            }
        });


    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(t2.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQU:
                    break;
                default:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(t2.getText().toString());
        }
    }


}
