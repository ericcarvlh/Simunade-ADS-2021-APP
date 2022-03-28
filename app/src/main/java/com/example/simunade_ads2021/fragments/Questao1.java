package com.example.simunade_ads2021.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simunade_ads2021.R;
import com.example.simunade_ads2021.databinding.FragmentHomeBinding;
import com.example.simunade_ads2021.databinding.FragmentQuestao1Binding;


public class Questao1 extends Fragment {
    private FragmentQuestao1Binding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuestao1Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btQ2.setOnClickListener(V -> {
            NavHostFragment.findNavController(Questao1.this).navigate(R.id.action_questao1_to_questao2);
        });

        binding.btQ3.setOnClickListener(V -> {
            NavHostFragment.findNavController(Questao1.this).navigate(R.id.action_questao1_to_questao3);
        });

        binding.btProximo.setOnClickListener(V -> {
            NavHostFragment.findNavController(Questao1.this).navigate(R.id.action_questao1_to_questao2);
        });

        binding.btProxima.setOnClickListener(V -> {
            NavHostFragment.findNavController(Questao1.this).navigate(R.id.action_questao1_to_questao2);
        });
    }
}