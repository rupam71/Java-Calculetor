package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnce, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btnac, btnrevarse, btnsub, btnmul, btnminus, btnplus, btndot, btnparsent, btnequal;
    TextView t, t2;
    float f = -1000;
    float lastValue;
    String lastOp = null;
    String lastCr = "";
    boolean b = false;
    String display = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnce = (Button) findViewById(R.id.btnce);
        btnac = (Button) findViewById(R.id.btnac);
        btnrevarse = (Button) findViewById(R.id.btnrevarse);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btnminus = (Button) findViewById(R.id.btnminus);
        btnplus = (Button) findViewById(R.id.btnplus);
        btndot = (Button) findViewById(R.id.btndot);
        btnparsent = (Button) findViewById(R.id.btnparsent);
        btnequal = (Button) findViewById(R.id.btnequal);

        t = (TextView) findViewById(R.id.textView2);
        t2 = (TextView) findViewById(R.id.textView);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"0";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 0;
                    lastCr = "0";
                    t.setText(lastCr);
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"1";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 1;
                    lastCr = "1";
                    t.setText(lastCr);
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"2";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 2;
                    lastCr = "2";
                    t.setText(lastCr);
                }
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"3";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 3;
                    lastCr = "3";
                    t.setText(lastCr);
                }
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"4";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 4;
                    lastCr = "4";
                    t.setText(lastCr);
                }
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"5";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 5;
                    lastCr = "5";
                    t.setText(lastCr);
                }
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"6";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 6;
                    lastCr = "6";
                    t.setText(lastCr);
                }
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"7";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 7;
                    lastCr = "7";
                    t.setText(lastCr);
                }
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"8";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 8;
                    lastCr = "8";
                    t.setText(lastCr);
                }
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr+"9";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                }
                else {
                    lastValue = 9;
                    lastCr = "9";
                    t.setText(lastCr);
                }
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b == false) {
                    String s = lastCr + ".";
                    lastValue = Float.parseFloat(s);
                    t.setText(s);
                    lastCr = s;
                    b = true;
                } else {
                    btndot.setEnabled(false);
                }
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f== -1000) {
                    f =  lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "+";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
                else if(lastOp != "+"){
                    if(lastOp == "-"){
                        f = f - lastValue;
                        lastValue = 0;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "+";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "*"){
                        f = f * lastValue;
                        lastValue = 0;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "+";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "/"){
                        f = f / lastValue;
                        lastValue = 0;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "+";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "%") {
                        float newValue = (float) lastValue / 100;
                        f = f * newValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "+";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "="){
                        lastValue = 0;
                        f = f + lastValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "+";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                }
                else {
                    f = f + lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "+";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
            }
        });


        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f== -1000){
                    f = lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "-";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
                else if(lastOp != "-"){
                    if(lastOp == "+"){
                        f = f + lastValue;
                        lastValue = 0;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "-";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "*"){
                        f = f * lastValue;
                        lastValue = 0;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "-";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "/"){
                        f = f / lastValue;
                        lastValue = 0;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "-";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "%") {
                        float newValue = (float) lastValue / 100;
                        f = f * newValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "-";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "="){
                        lastValue = 0;
                        f = f - lastValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "-";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                }
                else {
                    f = f - lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "-";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f==-1000){
                    f = lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "*";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
                else if(lastOp != "*"){
                    if (lastOp == "+"){
                        f = f + lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "*";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "-"){
                        f = f - lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "*";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "/"){
                        f = f / lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "*";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "%") {
                        float newValue = (float) lastValue / 100;
                        f = f * newValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "*";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "="){
                        lastValue = 1;
                        f = f * lastValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "*";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                }
                else {
                    f = f * lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "*";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
            }
        });


        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f==-1000){
                    f = lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "/";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
                else if(lastOp != "/"){
                    if (lastOp == "+"){
                        f = f + lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "/";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "-"){
                        f = f - lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "/";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "*"){
                        f = f * lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "/";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "%") {
                        float newValue = (float) lastValue / 100;
                        f = f * newValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "/";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "="){
                        lastValue = 1;
                        f = f / lastValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "/";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                }
                else {
                    f = f / lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "/";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
            }
        });


        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lastOp == "+") {
                    f = f + lastValue;
                    lastOp = "=";
                    int i = (int) f;
                    if (i == f) {
                        t.setText(Integer.toString(i));
                        display = display+lastCr+lastOp+Integer.toString(i);
                        t2.setText(display);
                    }
                    else {
                        t.setText(Float.toString(f));
                        display = display+lastCr+lastOp+Float.toString(f);
                        t2.setText(display);
                    }
                    lastCr = "";
                        b = false;
                }
                else if (lastOp == "-") {
                    f = f - lastValue;
                    int i = (int) f;
                    lastOp = "=";
                    if (i == f) {
                        t.setText(Integer.toString(i));
                        display = display+lastCr+lastOp+Integer.toString(i);
                        t2.setText(display);
                    }
                    else {
                        t.setText(Float.toString(f));
                        display = display+lastCr+lastOp+Float.toString(f);
                        t2.setText(display);
                    }
                    lastCr = "";
                        b = false;
                }
                else if (lastOp == "*") {
                    f = f * lastValue;
                    int i = (int) f;
                    lastOp = "=";
                    if (i == f) {
                        t.setText(Integer.toString(i));
                        display = display+lastCr+lastOp+Integer.toString(i);
                        t2.setText(display);
                    }
                    else {
                        t.setText(Float.toString(f));
                        display = display+lastCr+lastOp+Float.toString(f);
                        t2.setText(display);
                    }
                    lastCr = "";
                        b = false;
                }
                else if (lastOp == "/") {
                    f = f / lastValue;
                    int i = (int) f;
                    lastOp = "=";
                    if (i == f) {
                        t.setText(Integer.toString(i));
                        display = display+lastCr+lastOp+Integer.toString(i);
                        t2.setText(display);
                    }
                    else {
                        t.setText(Float.toString(f));
                        display = display+lastCr+lastOp+Float.toString(f);
                        t2.setText(display);
                    }
                    lastCr = "";
                        b = false;
                }
                else if (lastOp == "%") {
                    float newValue = (float) lastValue / 100;
                    f = f * newValue;
                    int i = (int) f;
                    lastOp = "=";
                    if (i == f) {
                        t.setText(Integer.toString(i));
                        display = display+lastCr+lastOp+Integer.toString(i);
                        t2.setText(display);
                    }
                    else {
                        t.setText(Float.toString(f));
                        display = display+lastCr+lastOp+Float.toString(f);
                        t2.setText(display);
                    }
                    lastCr = "";
                        b = false;
                }
            }
        });

        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    f = -1000; lastValue = 0;
                    lastOp = null;
                    lastCr = "";
                    display = "";
                        b = false;
                    t.setText("0");
            }
        });

        btnrevarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float newValue = lastValue ;
                newValue = newValue - (2*newValue);
                lastValue = newValue;
                int i = (int) newValue;
                    if (i == newValue) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(newValue)); }
            }
        });

        btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastCr != null) {
                    String s = lastCr;
                    if(s.length()>1){
                        String o = s.substring(0, s.length() - 1);
                        lastValue = Float.parseFloat(o);
                        lastCr = o;
                        t.setText(o);
                    } else if (s.length()==1) {
                        t.setText("0");
                        lastCr = "";
                    }
                }
                else {

                }
            }
        });

        btnparsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f==-1000){
                    f = lastValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "%";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
                else if(lastOp != "%"){
                    if (lastOp == "+"){
                        f = f + lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "%";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "-"){
                        f = f - lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "%";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "*"){
                        f = f * lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "%";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if (lastOp == "/"){
                        f = f / lastValue;
                        lastValue = 1;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "%";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                    else if(lastOp == "="){
                        lastValue = 100;
                        float newValue = (float) lastValue / 100;
                        f = f * newValue;
                        int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                        lastOp = "%";
                        display = display+lastCr+lastOp;
                        t2.setText(display);
                        lastCr = "";
                        b = false;
                    }
                }
                else {
                    float newValue = (float) lastValue / 100;
                    f = f * newValue;
                    int i = (int) f;
                    if (i == f) { t.setText(Integer.toString(i)); }
                    else { t.setText(Float.toString(f)); }
                    lastOp = "%";
                    display = display+lastCr+lastOp;
                    t2.setText(display);
                    lastCr = "";
                        b = false;
                }
            }
        });



    }
}