package com.example.projeto_padrao.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.projeto_padrao.R;
import com.example.projeto_padrao.models.Usuario;

import java.util.List;

public class RegisterActivity extends AppCompatActivity {


    TextView registrar_text_login;
    Button registrar_button_cadsastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar);
// --------------------------- PARA JÁ USUARIOS ------------------------- //
        registrar_text_login = (TextView) findViewById(R.id.registrar_text_login);

// ---------------------------------------------------------------------- //
        registrar_text_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });

    }






    }



