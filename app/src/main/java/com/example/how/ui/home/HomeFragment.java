package com.example.how.ui.home;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.how.Model.PontosTur;
import com.example.how.R;
import com.example.how.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;
    private pontosAdapter pontosAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RecyclerView rv = root.findViewById(R.id.recyclerview);
        pontosAdapter = new pontosAdapter(new ArrayList<>(PontosTur.pontosteste()));
        rv.setAdapter(pontosAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}