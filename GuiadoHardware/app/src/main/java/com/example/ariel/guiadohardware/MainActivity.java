package com.example.ariel.guiadohardware;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView txtRatingValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        addListenerOnRatingBar();

        //SetRequestedOrientacion(...) vai impedir que o app mude de lado com a rotação do celular//
    }
    // Vai alterar para a tela da placa mãe//
    public void ClickPla(View v){
        Intent x = new Intent();
        x.setClass(this, Placa.class);
        startActivity(x);
    }
    // Vai alterar para a tela da memória//
    public void ClickMemo(View v){
        Intent x = new Intent();
        x.setClass(this, Memoria.class);
        startActivity(x);
        finish();

    }
    //Vai alterar para a tela do processador//
    public void ClickProce(View v){
        Intent x = new Intent();
        x.setClass(this, Processador.class);
        startActivity(x);
    }
    //Vai alterar para a tela dos periféricos//
    public void ClickPeri(View v){
        Intent x = new Intent();
        x.setClass(this,Perifericos.class);
        startActivity(x);
    }
    //Vai alterar para a tela dicas//
    public void ClickDica(View v){
        Intent x = new Intent();
        x.setClass(this, Dicas.class);
        startActivity(x);
    }
    // Função para imprimir o resultado do valor selecionado no RattingBar//
    public void addListenerOnRatingBar() {

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        txtRatingValue = (TextView) findViewById(R.id.txtRatingValor);
        //se o valor de classificação é alterado,
        // Vai exibir o valor classificação atual no textview  automaticamente
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                txtRatingValue.setText(String.valueOf(rating+" estrelas"));

            }
        });
    }


}
