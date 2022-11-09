package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Triangulo, circulo, rectangulo;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Triangulo = (Button) findViewById(R.id.idTriangulo);
        rectangulo = (Button) findViewById(R.id.idrectangulo);
        circulo = (Button) findViewById(R.id.idcirculo);



        {
            Intent intencion = new Intent(this, areatriangulo.class);
            startActivity(intencion);


            intencion = new Intent(this, areacirculo.class);
            startActivity(intencion);

            intencion = new Intent(this, arearectangulo.class);
            startActivity(intencion);


        }


    }

}