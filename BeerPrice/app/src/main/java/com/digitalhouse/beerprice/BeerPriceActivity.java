package com.digitalhouse.beerprice;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class BeerPriceActivity extends AppCompatActivity {


    private TextView valor1;
    private TextView valor2;
    private TextView ml1;
    private TextView ml2;
    private TextView melhorCusto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_price);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.beer_icon_bar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        valor1 = findViewById(R.id.valor_cerveja_1);
        valor2 = findViewById(R.id.valor_cerveja_2);
        ml1= findViewById(R.id.ml_cerveja_1);
        ml2 = findViewById(R.id.ml_cerveja_2);
        melhorCusto = findViewById(R.id.valor_melhor_custo);

    }



    public void calcular(View view){
       float preco100Ml1 = ((Float.parseFloat(valor1.getText().toString())/Float.parseFloat(ml1.getText().toString())*100));
       float preco100Ml2 = ((Float.parseFloat(valor2.getText().toString())/Float.parseFloat(ml2.getText().toString()))*100);
       if (preco100Ml1 > preco100Ml2){
           melhorCusto.setText("Cerveja 2") ;
       }else if (preco100Ml2 > preco100Ml1){
           melhorCusto.setText("Cerveja 1") ;
       }else {
           melhorCusto.setText("Tanto faz") ;
       }
    }

}
