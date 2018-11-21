package com.zermeno.isaac.act3_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Intent intent = getIntent();
        Usuario u = intent.getParcelableExtra("user");

        ((TextView)findViewById(R.id.outputNombre)).setText(u.nombre);
        ((TextView)findViewById(R.id.outputPrimerApellido)).setText(u.pApellido);
        ((TextView)findViewById(R.id.outputSegundoApellido)).setText(u.sApellido);
        //((TextView)findViewById(R.id.outputEdad)).setText(u.edad);
    }
}
