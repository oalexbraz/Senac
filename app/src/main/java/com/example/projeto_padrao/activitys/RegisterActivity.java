package com.example.projeto_padrao.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.projeto_padrao.R;

public class RegisterActivity extends AppCompatActivity {


    TextView registrar_text_login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar);
// --------------------------- PARA JÁ USUARIOS ------------------------- //
         registrar_text_login = (TextView) findViewById(R.id.registrar_text_login);

            registrar_text_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent( RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);

                }
            });
// ---------------------------------------------------------------------- //




    }


}
