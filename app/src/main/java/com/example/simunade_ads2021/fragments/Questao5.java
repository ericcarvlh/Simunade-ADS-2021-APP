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
import com.example.simunade_ads2021.databinding.FragmentQuestao5Binding;


public class Questao5 extends Fragment {
    private FragmentQuestao5Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentQuestao5Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btAnterior.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao5.this).navigate(R.id.action_questao5_to_questao4);
        });

        binding.btQ6.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao5.this).navigate(R.id.action_questao5_to_questao6);
        });

        binding.btQ7.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao5.this).navigate(R.id.action_questao5_to_questao7);
        });
        binding.btProx.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao5.this).navigate(R.id.action_questao5_to_questao6);
        });

        binding.btProxima.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao5.this).navigate(R.id.action_questao5_to_questao6);
        });
    }
}