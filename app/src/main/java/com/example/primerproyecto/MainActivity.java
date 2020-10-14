package com.example.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String mostrar;
    String primernumero;
    String segundonumero;
    double alaragon;
    double m1=0,m2=0,m3=0,m4=0,m5=0,m6=0,m7=0,m8=0,m9=0,m0=0,l=0;


int C=0,s=0,r=0,m=0,d=0,o=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void miclik(View view) {


        switch (view.getId()){
            case R.id.bt1:
                Button b= (Button) view;


                TextView t1= (TextView) findViewById(R.id.ht3);

                 mostrar = t1.getText().toString();
                 m1=Double.parseDouble(mostrar);
                 if(m1==0)
                 {
                     mostrar="1";
                     t1.setText(mostrar);
                     m1++;
                 }else{
                     mostrar=mostrar+"1";
                     t1.setText(mostrar);
                 }


                break;

            case R.id.bt2:
                Button b2= (Button) view;

                TextView t2= (TextView) findViewById(R.id.ht3);
                mostrar = t2.getText().toString();
                m1=Double.parseDouble(mostrar);
                if(m1==0)
                {
                    mostrar="2";
                    t2.setText(mostrar);
                    m1++;
                }else{
                    mostrar=mostrar+"2";
                    t2.setText(mostrar);
                }

                break;

            case R.id.bt3:
                Button b3= (Button) view;

                TextView t3= (TextView) findViewById(R.id.ht3);
                mostrar=t3.getText().toString();
                m1=Double.parseDouble(mostrar);
                if(m1==0)
                {
                    mostrar="3";
                    t3.setText(mostrar);
                    m1++;
                }else{
                    mostrar=mostrar+"3";
                    t3.setText(mostrar);
                }
                 break;

            case R.id.bt4:
                Button b4= (Button) view;

                TextView t4= (TextView) findViewById(R.id.ht3);
                mostrar=t4.getText().toString();
                m1=Double.parseDouble(mostrar);
                if(m1==0)
                {
                    mostrar="4";
                    t4.setText(mostrar);
                    m1++;
                }else{
                    mostrar=mostrar+"4";
                    t4.setText(mostrar);
                }
                break;

            case R.id.bt5:
                Button b5= (Button) view;

                TextView t5= (TextView) findViewById(R.id.ht3);
                mostrar=t5.getText().toString();
                m1=Double.parseDouble(mostrar);
                if(m1==0)
                {
                    mostrar="5";
                    t5.setText(mostrar);
                    m1++;
                }else{
                    mostrar=mostrar+"5";
                    t5.setText(mostrar);
                }
                break;

            case R.id.bt6:
                Button b6= (Button) view;

                TextView t6= (TextView) findViewById(R.id.ht3);
                mostrar=t6.getText().toString();
                m1=Double.parseDouble(mostrar);
                if(m1==0)
                {
                    mostrar="6";
                    t6.setText(mostrar);
                    m1++;
                }else{
                    mostrar=mostrar+"6";
                    t6.setText(mostrar);
                }
                 break;

            case R.id.bt7:
                Button b7= (Button) view;

                TextView t7= (TextView) findViewById(R.id.ht3);
                mostrar=t7.getText().toString();
                m1=Double.parseDouble(mostrar);
                if(m1==0)
                {
                    mostrar="7";
                    t7.setText(mostrar);
                    m1++;
                }else{
                    mostrar=mostrar+"7";
                    t7.setText(mostrar);
                }
                 break;


            case R.id.bt8:
                Button b8= (Button) view;

                TextView t8= (TextView) findViewById(R.id.ht3);
                mostrar=t8.getText().toString();
                m1=Double.parseDouble(mostrar);

                if(m1==0)
                {
                    mostrar="8";
                    t8.setText(mostrar);
                    m1++;

                }else{
                    mostrar=mostrar+"8";
                    t8.setText(mostrar);
                }
                break;

            case R.id.bt9:
                Button b9= (Button) view;

                TextView t9= (TextView) findViewById(R.id.ht3);
                mostrar=t9.getText().toString();
                m1=Double.parseDouble(mostrar);
                if(m1==0)
                {
                    mostrar="9";
                    t9.setText(mostrar);
                    m1++;
                }else{
                    mostrar=mostrar+"9";
                    t9.setText(mostrar);
                }
                 break;

            case R.id.bt0:
                Button b0= (Button) view;

                TextView t0= (TextView) findViewById(R.id.ht3);
                mostrar=t0.getText().toString();
                mostrar=mostrar+"0";
                t0.setText(mostrar);

            case R.id.btq:
                Button bq= (Button) view;

                TextView tq= (TextView) findViewById(R.id.ht3);
                mostrar=tq.getText().toString();
                mostrar=mostrar+".";
                tq.setText(mostrar);

            case R.id.ht3:
                TextView lbl=(TextView) view;
                break;

        }

    }

    public void operacion(View view) {

        switch (view.getId()) {
            case R.id.sumaa:

                    TextView su = (TextView) findViewById(R.id.ht3);
                    primernumero = su.getText().toString();
                    su.setText("0");

                    s++;
                    m1=0;

                break;

            case R.id.restaa:

                    TextView re = (TextView) findViewById(R.id.ht3);
                    primernumero = re.getText().toString();
                    re.setText("0");

                    r++;
                    m1=0;

break;
            case R.id.multiplicacionn:

                    TextView mu = (TextView) findViewById(R.id.ht3);
                    primernumero = mu.getText().toString();
                    mu.setText("0");

                    m++;
                    m1=0;

                break;

            case R.id.divisionn:

                    TextView di = (TextView) findViewById(R.id.ht3);
                    primernumero = di.getText().toString();
                    di.setText("0");

                    d++;
                    m1=0;

                break;

            case R.id.porcentaje:

                TextView q = (TextView) findViewById(R.id.ht3);
                primernumero = q.getText().toString();
                q.setText("0");

                o++;
                m1=0;

                break;

            case R.id.igual:

                if (s==1) {

                    TextView sa = (TextView) findViewById(R.id.ht3);
                    segundonumero = sa.getText().toString();
                    alaragon = Double.parseDouble(primernumero) + Double.parseDouble(segundonumero);
                    sa.setText(String.valueOf(alaragon));
                    s=0;

                    m1=0;
                }
                else if (r==1)
                {
                    TextView sa = (TextView) findViewById(R.id.ht3);
                    segundonumero = sa.getText().toString();
                    alaragon = Double.parseDouble(primernumero) - Double.parseDouble(segundonumero);
                    sa.setText(String.valueOf(alaragon));
                    r=0;
                    C=0;
                }

                else if (m==1){
                    TextView sa = (TextView) findViewById(R.id.ht3);
                    segundonumero = sa.getText().toString();
                    alaragon = Double.parseDouble(primernumero) * Double.parseDouble(segundonumero);
                    sa.setText(String.valueOf(alaragon));
                    m=0;
                    C=0;
                }
                else if (d==1){
                    TextView sa = (TextView) findViewById(R.id.ht3);
                    segundonumero = sa.getText().toString();
                    alaragon = Double.parseDouble(primernumero) / Double.parseDouble(segundonumero);
                    sa.setText(String.valueOf(alaragon));
                    d=0;
                    C=0;
                }
                else if (d==1){
                    TextView sa = (TextView) findViewById(R.id.ht3);
                    segundonumero = sa.getText().toString();
                    alaragon = Double.parseDouble(primernumero) / Double.parseDouble(segundonumero);
                    sa.setText(String.valueOf(alaragon));
                    d=0;
                    C=0;
                }
                else{
                    TextView sa = (TextView) findViewById(R.id.ht3);
                    segundonumero = sa.getText().toString();
                    alaragon = Double.parseDouble(primernumero) /100 * Double.parseDouble(segundonumero);
                    sa.setText(String.valueOf(alaragon));
                    d=0;
                    C=0;
                }

                break;
            case R.id.AC:
                TextView sa = (TextView) findViewById(R.id.ht3);
                mostrar="0";
                sa.setText(mostrar);
                s=0;r=0;m=0;d=0;
                m1=0;


        }
    }
}