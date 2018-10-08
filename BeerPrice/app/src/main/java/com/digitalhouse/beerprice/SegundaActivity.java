package com.digitalhouse.beerprice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();
        String resultado = pacote.getString("resultado");
        TextView resultadoNaTela = findViewById(R.id.resultado_na_tela);
        resultadoNaTela.setText(resultado);
    }


    public void voltar(View view){
        Intent intencaoVoltar = new Intent(this, BeerPriceActivity.class);
        startActivity(intencaoVoltar);
    }

}
