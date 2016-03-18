package com.example.ariel.guiadohardware;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Ariel on 14/03/2016.
 */
public class Placa extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placa);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
    }
    // Função para chamar a tela principal//
    public void Menu(View v){
        Intent x = new Intent();
        x.setClass(this, MainActivity.class);
        startActivity(x);
        finish();

    }

}
