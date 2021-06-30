package com.example.how.Activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.how.R;

public class CriarConta extends AppCompatActivity {
    Button btnCriar;
    String email;
    String nome;
    String telefone;
    String DataNasc;
    String cpf;
    String senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);
        Inicializar();

        btnCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(CriarConta.this,MainActivity.class));
            }
        });

    }

    public void Inicializar ()
    {
        btnCriar = (Button) findViewById(R.id.btnCriar);
        email = String.valueOf(R.id.editTextTextEmailAddress2);
        senha = String.valueOf(R.id.editTextTextPassword2);
        DataNasc = String.valueOf(R.id.editTextDate);
        telefone = String.valueOf(R.id.editTextPhone);
        cpf = String.valueOf(R.id.CPF);
        nome = String.valueOf(R.id.Nome);
    }
}