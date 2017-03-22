package com.example.elfrarep.contadordapegacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button adicionar;
    private TextView contadorTextView;

    private int contador = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView contadorTextView = (TextView) findViewById(R.id.contadorTextView);
//
        final Button adicionar = (Button) findViewById(R.id.adicionarButton);

        adicionar.setOnClickListener(new View.OnClickListener(){

                                         @Override
                                         public void onClick(View v){
                                             contador++;

                                             contadorTextView.setText("" + contador);

                                         }
                                     }


        );
    }
}

