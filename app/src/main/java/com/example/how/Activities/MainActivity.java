package com.example.how.Activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.how.Model.SQLite.dbOpenHelper;
import com.example.how.R;

public class MainActivity extends AppCompatActivity
{

    // Cria os botões que serão utilizados para chamar outras activities
    private Button butCriarA, butEntrar;
    EditText Email, Senha;
    dbOpenHelper db = new dbOpenHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Recebem o id do botão gerado no XML
        butCriarA = findViewById(R.id.butCreate);
        butEntrar= findViewById(R.id.butLogin);
        Email = (EditText) findViewById(R.id.Email);
        Senha = (EditText) findViewById(R.id.Senha);
        //Função chamada ao clicar no botão de criar conta
        butCriarA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CriarActivity();
            }
        });

        //Função chamada ao clicar no botão de Entrar
        butEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String email = Email.getText().toString();
                String senha = Senha.getText().toString();

                if (email.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Insira o email",Toast.LENGTH_SHORT).show();
                }else if (senha.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Insira a senha",Toast.LENGTH_SHORT).show();
                }
                else 
                {
                    String resultado = db.Autenticar(email,senha);
                    if (resultado == "Verificado")
                    {
                        Bundle bundle = new Bundle();
                        bundle.putString("Email", email);
                        Intent i = new Intent(MainActivity.this, TelaPrincipal.class);
                        i.putExtras(bundle);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,
                                "Não encontramos uma conta com essas informações",
                                Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });
    }
    /**
     * Funções utilizadas para iniciar uma segunda Activity
     **/

    private void CriarActivity()
    {
        startActivity(new Intent(MainActivity.this, CriarConta.class));
    }

}
