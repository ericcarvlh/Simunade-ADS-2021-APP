package com.example.simunade_ads2021.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simunade_ads2021.R;
import com.example.simunade_ads2021.databinding.FragmentHomeBinding;


public class Home extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.prova.setOnClickListener(V ->{
            NavHostFragment.findNavController(Home.this).navigate(R.id.action_home3_to_questao1);
        });

        binding.creditos.setOnClickListener(V ->{
            NavHostFragment.findNavController(Home.this).navigate(R.id.action_home3_to_creditos2);
        });

        binding.sobre.setOnClickListener(V ->{
            NavHostFragment.findNavController(Home.this).navigate(R.id.action_home3_to_sobre2);
        });
    }
}
