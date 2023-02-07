package com.example.tiagodefreitas.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumeros(View view){
        TextView txt_Resultado = (TextView) findViewById(R.id.txt_Resultado);

        //Sorteia um número alatório de 0 a 10
        int n1 = new Random().nextInt(10);

        txt_Resultado.setText("O número alatório é: " + n1);
    }
}
