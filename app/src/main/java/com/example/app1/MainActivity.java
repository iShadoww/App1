package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etn = (EditText)findViewById(R.id.Txt_Name);
        etp = (EditText)findViewById(R.id.txt_password);
    }
    //Metodo boton siguiente
    public void siguiente(View view){
        Intent siguiente = new Intent(this, Activity2.class);
        startActivity(siguiente);
    }

    public void Guardar(View view){
        String nombre = etn.getText().toString();
        String password = etp.getText().toString();

        if(nombre.length() ==0){
            Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_LONG).show();
        }
        if(password.length() ==0){
            Toast.makeText(this, "Ingrese un password", Toast.LENGTH_LONG).show();
        }
        if(nombre.length() !=0 && password.length() !=0){
            Toast.makeText(this, "Registrado, presione siguiente", Toast.LENGTH_LONG).show();
        }
    }
}