package com.example.projeto_padrao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Log.d( "MEU_LOG",  "LOG 1");
        Log.d( "MEU_LOG",  "LOG 2");
        Log.d( "MEU_LOG",  "LOG 3");
    }

    @Override
    protected void onStart (){
        Log.d("ciclo_de_vida" , "onResume - Estado de interação com a tela");
            super.onStart();
    }
    @Override
    protected void onPause(){
        Log.d("cliclo_de_vida" , "onPause - inicio o término da activity");
            super.onPause();
    }
    @Override
    protected void onStop(){
        Log.d("cliclo_de_vida" , "onStop - A atividade não está mais visivel ao usuario");

    }
    @Override
    protected void onDestroy(){
        Log.d("cliclo_de_vida", "onDestroy - A Activity foi complemente destruida");
            super.onDestroy();
    }

}
