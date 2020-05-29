package com.example.oswaldocunalata_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    TextView celdaNom, celPago, res1,res2,res3 , tvUsuResu;

    Bundle nombre3, pagoMensual,si,si1,no,no1, fut, baq, ten, usures;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        celdaNom = findViewById(R.id.tvNombreRe);
        celPago = findViewById(R.id.tvPagoMenRes);
        res1 = findViewById(R.id.tvPre1);
        res2 = findViewById(R.id.tvPre2);
        res3 = findViewById(R.id.tvPre3);

       /* usures = getIntent().getExtras();
        String recibir8 = usures.getString("datoEnviado");
        tvUsuResu.setText(recibir8);

         nombre3 = getIntent().getExtras();
        String recibir7 = nombre3.getString("datoEnviado4");
        celdaNom.setText(recibir7);



       pagoMensual = getIntent().getExtras();
        String recibirPag = pagoMensual.getString("datoEnviado5");
        pago.setText(recibirPag);
//si-no*/
        si = getIntent().getExtras();
        String recibir = si.getString("datoEnviado1");
        res1.setText(recibir);

        no = getIntent().getExtras();
        String recibir1 = no.getString("datoEnviado1");
        res1.setText(recibir1);
    //Check
        fut = getIntent().getExtras();
        String recibir2 = fut.getString("datoEnviado2");
        res2.setText(recibir2);

        baq = getIntent().getExtras();
        String recibir3 = baq.getString("datoEnviado2");
        res2.setText(recibir3);

        ten = getIntent().getExtras();
        String recibir4 = ten.getString("datoEnviado2");
        res2.setText(recibir4);

        //Si-no
        si1 = getIntent().getExtras();
        String recibir5 = si1.getString("datoEnviado3");
        res3.setText(recibir5);

        no1 = getIntent().getExtras();
        String recibir6 = no1.getString("datoEnviado3");
        res3.setText(recibir6);

    }
}
