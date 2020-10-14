package com.example.projeto_padrao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Struct;

public class LoginActivity extends AppCompatActivity {

    //DECLARANDO OBJETOS
    EditText login_editText_usuario;
    EditText login_editText_senha;
    Button login_button_usuario;
    TextView login_text_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
// --------------------------- ATRIBUINDO VALORES ------------------------- //
        login_text_registrar = (TextView) findViewById(R.id.login_text_registrar);
        login_button_usuario = (Button) findViewById(R.id.login_button_usuario);

// --------------------------- PARA NÃO USUARIOS ------------------------- //

        login_text_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
// ---------------------------------------------------------------------- //

        login_button_usuario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String usuario = login_editText_usuario.getText().toString();
                String senha = login_editText_senha.getText().toString();

                Log.d("autenticação", " \nUSUARIO:" + usuario + "\nSENHA:" + senha);

            }
        });

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
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        Log.d("cliclo_de_vida", "onDestroy - A Activity foi complemente destruida");
            super.onDestroy();
    }

}
