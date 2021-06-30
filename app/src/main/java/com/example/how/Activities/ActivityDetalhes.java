package com.example.how.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.how.Model.Pontos;
import com.example.how.Model.PontosTur;
import com.example.how.R;
import com.example.how.ui.home.pontosAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ActivityDetalhes extends AppCompatActivity {
    pontosAdapter pontos;

    Pontos p;
    TextView end, nome,desc;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        img = (ImageView) findViewById(R.id.imgDel);
        end = (TextView) findViewById(R.id.txtEndereco);
        nome = (TextView) findViewById(R.id.txtNome);
        desc = (TextView) findViewById(R.id.txtDesc);
        Intent telaAnterior = getIntent();

        Bundle receber = telaAnterior.getExtras();
        String name = receber.getString("Nome");
        int imagem = receber.getInt("Imagem");
        String End = receber.getString("End");
        String Desc = receber.getString("Desc");
        nome.setText(name);
        img.setImageResource(imagem);
        end.setText(End);
        desc.setText(Desc);
    }
}