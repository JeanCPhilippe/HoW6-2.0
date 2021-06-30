package com.example.how.ui.home;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.how.Activities.ActivityDetalhes;
import com.example.how.Activities.MainActivity;
import com.example.how.Activities.TelaPrincipal;
import com.example.how.Model.Pontos;
import com.example.how.Model.PontosTur;
import com.example.how.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class pontosAdapter extends RecyclerView.Adapter<pontosAdapter.PontosViewHolder> {
    private List<Pontos> pontos;
    private List<Pontos> pontosall;
    private Pontos p;
    public pontosAdapter(List<Pontos> pontos)
    {
        this.pontos = pontos;
        this.pontosall = new ArrayList<>(pontos);
    }

    @NonNull
    @Override
    public PontosViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.listview,viewGroup,false);
        return new PontosViewHolder(view);
    }


    /**
     * É chamado quando se é necessário Reciclar um item.
    **/
    @Override
    public void onBindViewHolder(@NonNull pontosAdapter.PontosViewHolder pontosViewHolder, int position)
    {
        Pontos ptur = pontos.get(position);
        pontosViewHolder.bind(ptur);
    }

    /**
     * Utilizado para saber quantas linhas o ViewHolder precisará construir
    **/
    @Override
    public int getItemCount() {
        return pontos.size();
    }

    public void getItemId(String nome) {
    }

    class PontosViewHolder extends RecyclerView.ViewHolder
    {
        TextView txtNome,txtEnd;
        ImageView img;
        public PontosViewHolder(@NonNull View itemView)
        {
            super(itemView);
            txtNome = itemView.findViewById(R.id.Nome);
            txtEnd = itemView.findViewById(R.id.Endereco);
            img = itemView.findViewById(R.id.Foto);
            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) 
                {
                    Intent intent = new Intent(itemView.getContext(), ActivityDetalhes.class);
                    int pos = getAdapterPosition();
                if(pos != RecyclerView.NO_POSITION)
                {
                    Pontos rvclick = pontos.get(pos);



                    Toast.makeText(v.getContext(), "Selecionado " +
                            rvclick.getNome(), Toast.LENGTH_SHORT).show();
                    /**
                     * Código para enviar as informações necessárias após o click do usuário.
                    **/
                    String nome = rvclick.getNome();
                    String end = rvclick.getEnd();
                    String desc = rvclick.getDesc();
                    Bundle bundle = new Bundle();
                    //bundle.putInt("Imagem",img);
                    bundle.putString("Nome",nome);
                    bundle.putString("End",end);
                    bundle.putString("Desc",desc);
                    intent.putExtras(bundle);
                    itemView.getContext().startActivity(intent);
                }

                }
            });
        }

        public void bind(Pontos ptur)
        {
            txtNome.setText(ptur.getNome());
            txtEnd.setText(ptur.getEnd());
            img.setImageResource(ptur.getImg());
        }
    }
    /**
     * Código reponsável por receber a String de pesquisa e retornar os dados compátiveis.
    **/
    public Filter getFilter()
    {
        return filter;
    }
    Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Pontos> filtro = new ArrayList<>();
            if (constraint.toString().isEmpty())
            {
                filtro.addAll(pontosall);
            }
            else
            {
               for (Pontos pontos : pontosall)
               {
                   if (pontos.getNome().contains(constraint.toString()))
                   {
                       filtro.add(pontos);
                   }
               }

            }
            FilterResults results = new FilterResults();
            results.values = filtro;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            pontos.clear();
            pontos.addAll((Collection<? extends Pontos>) results.values);
            notifyDataSetChanged();
        }
    };
}

