package com.example.oswaldocunalata_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText nombre, montoInicial;
    TextView usuario, pagoMensual;
    Bundle usuario1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre = findViewById(R.id.etNombre);
        montoInicial = findViewById(R.id.etMontoInicial);
        pagoMensual = findViewById(R.id.tvPagoMensual);
        usuario = findViewById(R.id.tvUsuarioRe);

        usuario1 = getIntent().getExtras();
        String recibir = usuario1.getString("datoEnviado");
        usuario.setText(recibir);

    }
    public void Calcular (View cal){

        double monto= 1800, resultado, valor1, valor2;
        valor1 = Integer.parseInt(montoInicial.getText().toString());


        resultado =(((monto-valor1)/3)*0.05+((monto-valor1)/3) );
        pagoMensual.setText(String.format("%.1f", resultado));

    }
    public void GuardarRe(View gr) {
        Intent guarR = new Intent(Registro.this, Encuesta.class);

        guarR.putExtra("datoEnviado4", nombre.getText().toString());
        guarR.putExtra("datoEnviado5", pagoMensual.getText().toString());
        startActivity(guarR);

        Toast.makeText(getApplicationContext(), "Datos guardados Correctamente", Toast.LENGTH_SHORT).show();
    }
}
