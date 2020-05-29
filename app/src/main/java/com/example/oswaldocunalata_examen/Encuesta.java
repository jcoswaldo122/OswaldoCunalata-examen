package com.example.oswaldocunalata_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {
    TextView nombre;
    RadioButton tvSi, tvNo, tvSi1, tvNo1;
    CheckBox fut,basq,teni;

    Bundle name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        nombre = findViewById(R.id.tvNombreRe);
        tvSi = findViewById(R.id.rbSi);
        tvSi1 = findViewById(R.id.rbSi1);
        tvNo = findViewById(R.id.rbNo);
        tvNo1 = findViewById(R.id.tvNo2);

        fut = findViewById(R.id.cb1);
        basq = findViewById(R.id.cb2);
        teni = findViewById(R.id.cb3);

        name = getIntent().getExtras();
        String recibir = name.getString("datoEnviado");
        nombre.setText(recibir);
    }
    public void GuardarEncuesta(View g){
        Intent guaEn = new Intent(Encuesta.this, Resumen.class);
        if (tvSi.isChecked() == true) {
            guaEn.putExtra("datoEnviado1", tvSi.getText().toString());
        } else if (tvNo.isChecked() == true) {
            guaEn.putExtra("datoEnviado1", tvNo.getText().toString());
        }

        if (fut.isChecked() == true) {
            guaEn.putExtra("datoEnviado2", fut.getText().toString());
        } else if (basq.isChecked() == true) {
            guaEn.putExtra("datoEnviado2", basq.getText().toString());
        }else if (teni.isChecked()==true){
            guaEn.putExtra("datoEnviado2", teni.getText().toString());

        }


        if (tvSi1.isChecked() == true) {
            guaEn.putExtra("datoEnviado3", tvSi1.getText().toString());
        } else if (tvNo1.isChecked() == true) {
            guaEn.putExtra("datoEnviado3", tvNo1.getText().toString());
        }
        startActivity(guaEn);

    }
}
