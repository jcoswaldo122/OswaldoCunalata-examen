package com.example.oswaldocunalata_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView usuario, contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = findViewById(R.id.etNombre);
        contraseña = findViewById(R.id.etPassword1);
    }

    public void Guardar(View g){
        String usu = usuario.getText().toString();
        String pass = contraseña.getText().toString();

        if (usu.equals("estudiante2020")&&pass.equals("uisrael2020")){
            Intent gua = new Intent(Login.this, Registro.class);
            gua.putExtra("datoEnviado", usuario.getText().toString());
            startActivity(gua);
        }else {
            Toast.makeText(getApplicationContext(),"usuario incorecto", Toast.LENGTH_SHORT).show();
        }

    }
}
