package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private TextInputLayout usuario;
    private TextInputLayout contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = findViewById(R.id.usuarioTextFaild);
        contra = findViewById(R.id.contraTextFaild);
    }
    private boolean validarU(){
        String valN = usuario.getEditText().getText().toString().trim();

        if(valN.isEmpty()){
            usuario.setError("Complete el campo");
            return false;
        }else{
            usuario.setError(null);
            return true;
        }
    }
    private boolean validarC(){
        String valN = contra.getEditText().getText().toString().trim();

        if(valN.isEmpty()){
            contra.setError("Complete el campo");
            return false;
        }else{
            contra.setError(null);
            return true;
        }
    }
    public void Siguiente(View view) {
        Intent sigueinte = new Intent(this, register.class);
        startActivity(sigueinte);
    }
    public void Siguiente3(View view) {
        if(!validarU() || !validarC()){
            return;
        }
        String input = "Bienvenido";
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        Intent sigueinte3 = new Intent(this, MenuInicio.class);
        startActivity(sigueinte3);
    }
    public void Invitado(View view) {
        Intent sigueinte = new Intent(this, MenuInicio.class);
        startActivity(sigueinte);
    }
    public void Olvido(View view) {
        String input = "Recupere su contraseña";
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        Intent sigueinte = new Intent(this, OlvidadoActivity.class);
        startActivity(sigueinte);
    }
}
