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
import com.example.simunade_ads2021.databinding.FragmentQuestao2Binding;


public class Questao2 extends Fragment {
    private FragmentQuestao2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentQuestao2Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btAnterior.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao2.this).navigate(R.id.action_questao2_to_questao1);
        });

        binding.btProx.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao2.this).navigate(R.id.action_questao2_to_questao3);
        });

        binding.btQ3.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao2.this).navigate(R.id.action_questao2_to_questao3);
        });

        binding.btQ4.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao2.this).navigate(R.id.action_questao2_to_questao4);
        });

        binding.btProxima.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao2.this).navigate(R.id.action_questao2_to_questao3);
        });
    }
}