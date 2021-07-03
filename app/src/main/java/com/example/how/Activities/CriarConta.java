package com.example.how.Activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.how.Model.SQLite.dbOpenHelper;
import com.example.how.R;

public class CriarConta extends AppCompatActivity {
    Button btnCriar;
    EditText Nome, Email,Senha,CPF,Telefone,Nasc;
    dbOpenHelper db = new dbOpenHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        /**
         * Recebe os Ids de suas respectivas funções
         **/
        btnCriar = (Button) findViewById(R.id.btnCriar);
        Nome = (EditText) findViewById(R.id.Nome);
        Nasc = (EditText) findViewById(R.id.Data);
        Email = (EditText) findViewById(R.id.EmailC);
        Telefone = (EditText) findViewById(R.id.Telefone);
        CPF = (EditText) findViewById(R.id.CPF);
        Senha = (EditText) findViewById(R.id.SenhaC);



        btnCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /**
                 * Recebe os valores de String para inserir no banco de dados.
                 **/
                String nome = Nome.getText().toString();
                String email = Email.getText().toString();
                String telefone = Telefone.getText().toString();
                String senha = Senha.getText().toString();
                String cpf = CPF.getText().toString();
                String DataNasc= Nasc.getText().toString();
                if (nome.equals(""))
                {
                    Toast.makeText(CriarConta.this,"Verifique o Campo Nome",Toast.LENGTH_SHORT).show();
                }else if (email.equals(""))
                {
                    Toast.makeText(CriarConta.this,"b",Toast.LENGTH_SHORT).show();
                } else if (telefone.equals(""))
                {
                    Toast.makeText(CriarConta.this,"c",Toast.LENGTH_SHORT).show();
                } else if (senha.equals(""))
                {
                    Toast.makeText(CriarConta.this,"d",Toast.LENGTH_SHORT).show();
                } else if (cpf.equals(""))
                {
                    Toast.makeText(CriarConta.this,"f",Toast.LENGTH_SHORT).show();
                } else if (DataNasc.equals(""))
                {
                    Toast.makeText(CriarConta.this,"g",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    /**
                     * Se tudo estiver preenchido corretamente.
                     **/
                    Long result = db.CriarConta(email, senha, cpf, nome, telefone, DataNasc);
                    if (result > 0) {
                        Toast.makeText(CriarConta.this, "Conta criada com sucesso", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(CriarConta.this, MainActivity.class));
                    } else {
                        Toast.makeText(CriarConta.this, "Não foi possível criar a conta, tente novamente", Toast.LENGTH_SHORT).show();
                    }
                }
            }
            });


            }
        }




