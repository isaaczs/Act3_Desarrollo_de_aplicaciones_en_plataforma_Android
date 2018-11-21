package com.zermeno.isaac.act3_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void infoUsuario(View view) {
        Usuario u = new Usuario();

        u.nombre = ((EditText)findViewById(R.id.inputNombre)).getText().toString();
        u.pApellido = ((EditText)findViewById(R.id.inputPrimerApellido)).getText().toString();
        u.sApellido = ((EditText)findViewById(R.id.inputSegundoApellido)).getText().toString();
        u.edad = Integer.parseInt(((EditText)findViewById(R.id.inputEdad)).getText().toString());


        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        intent.putExtra("user", u);
        startActivity(intent);
    }
}
