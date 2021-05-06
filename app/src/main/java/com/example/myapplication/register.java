package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.ViewGroupUtils;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class register extends AppCompatActivity {

    private TextInputLayout nombre1;
    private TextInputLayout apP;
    private TextInputLayout apM;
    private TextInputLayout correoE;
    private TextInputLayout contraN;
    private CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nombre1 = findViewById(R.id.nombreTextFaild);
        apP = findViewById(R.id.apellidoPTextFaild);
        apP = findViewById(R.id.apellidoPTextFaild);
        apM = findViewById(R.id.apellidoMTextFaild);
        correoE = findViewById(R.id.correo2TextFaild);
        contraN = findViewById(R.id.contra2TextFaild);
        check = findViewById(R.id.check);
    }
    private boolean validarN(){
        String valN = nombre1.getEditText().getText().toString().trim();

        if(valN.isEmpty()){
            nombre1.setError("Complete el campo");
            return false;
        }else{
            nombre1.setError(null);
            return true;
        }
    }
    private boolean validarAP(){
        String valN = apP.getEditText().getText().toString().trim();

        if(valN.isEmpty()){
            apP.setError("Complete el campo");
            return false;
        }else{
            apP.setError(null);
            return true;
        }
    }
    private boolean validarAM(){
        String valN = apM.getEditText().getText().toString().trim();

        if(valN.isEmpty()){
            apM.setError("Complete el campo");
            return false;
        }else{
            apM.setError(null);
            return true;
        }
    }
    private boolean validarC(){
        String valN = correoE.getEditText().getText().toString().trim();

        if(valN.isEmpty()){
            correoE.setError("Complete el campo");
            return false;
        }else{
            correoE.setError(null);
            return true;
        }
    }
    private boolean validarCN(){
        String valN = contraN.getEditText().getText().toString().trim();

        if(valN.isEmpty()){
            contraN.setError("Complete el campo");
            return false;
        }else{
            contraN.setError(null);
            return true;
        }
    }
    private boolean validarCH(){

        if(!check.isChecked()){
            check.setError("Seleccione la casilla");
            return false;
        }else{
            check.setError(null);
            return true;
        }
    }
    public void Anterior(View v){
        if(!validarN() || !validarAP() || !validarAM() || !validarC() || !validarCN() || !validarCH()){
            return;
        }
        String input = "Registrado";
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        Intent sigueinte3 = new Intent(this, MenuInicio.class);
        startActivity(sigueinte3);
            }
}


