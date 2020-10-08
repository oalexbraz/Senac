package com.example.projeto_padrao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minha_tela);

        Log.d( "MEU_LOG",  "LOG 1");
        Log.d( "MEU_LOG",  "LOG 2");
        Log.d( "MEU_LOG",  "LOG 3");
    }
}
]