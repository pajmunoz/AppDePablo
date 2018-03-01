package com.example.dh.appdepablo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonConfirmar = findViewById(R.id.buttonConfirmar);
        final String textoBoton = botonConfirmar.getText().toString();

        botonConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditText editText = findViewById(R.id.editarTexto);
                //String textIngresado = editText.getText().toString();

                //Toast unaTostada= Toast.makeText(MainActivity.this,textIngresado,Toast.LENGTH_LONG);
                //creo toast(tostada), con el nombre unaTostada crear una tostada con los parametro de ubicacion, que se va a mostrar, y el tiempo que se va a mostrar.
                //unaTostada.show();
                Bundle unBundle = new Bundle();
                unBundle.putString("nombre", "messi");
                unBundle.putInt("edad",34);

                Intent unIntent = new Intent(MainActivity.this,SecondActivity.class);

                unIntent.putExtras(unBundle);
                startActivity(unIntent);
            }
        });
    }
}
