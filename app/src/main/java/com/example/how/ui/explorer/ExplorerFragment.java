package com.example.how.ui.explorer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.how.Activities.MainActivity;
import com.example.how.Model.Pontos;
import com.example.how.Model.PontosTur;
import com.example.how.R;
import com.example.how.databinding.FragmentExplorerBinding;
import com.example.how.ui.home.pontosAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ExplorerFragment extends Fragment {

    private ImageButton btnsearch;
    private Button btnDel;
    private FragmentExplorerBinding binding;
    pontosAdapter pontosAdapter;
    EditText search;
    private Pontos Pontos;
    private ArrayList pontos = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentExplorerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        /**
         *  Código para adicionar dados ao recyclerview
        **/
        RecyclerView rv = root.findViewById(R.id.recyclerviewex);
        pontosAdapter = new pontosAdapter(new ArrayList<>(PontosTur.pontosteste()));
        rv.setAdapter(pontosAdapter);

        /**
         * Recebem os ID's para serem utilizados
        **/
        btnsearch = (ImageButton) root.findViewById(R.id.Btnsearch);
        search = (EditText) root.findViewById(R.id.search_Bar);

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /**
                *   1) Código responsável por receber a String para filtrar os Pontos Turísticos
                *   2) Chama o método de filtro e envia o parâmetro obtido no primeiro passo
                **/
                String pesquisa = search.getText().toString();

                pontosAdapter.getFilter().filter(pesquisa);
            }
        });

        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}