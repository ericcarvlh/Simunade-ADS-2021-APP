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
import com.example.simunade_ads2021.databinding.FragmentQuestao6Binding;


public class Questao6 extends Fragment {
    private FragmentQuestao6Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentQuestao6Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btAnterior.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao6.this).navigate(R.id.action_questao6_to_questao5);
        });
        binding.btQ7.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao6.this).navigate(R.id.action_questao6_to_questao7);
        });
        binding.btQ8.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao6.this).navigate(R.id.action_questao6_to_questao8);
        });
        binding.btProx.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao6.this).navigate(R.id.action_questao6_to_questao7);
        });
        binding.btProxima.setOnClickListener(V->{
            NavHostFragment.findNavController(Questao6.this).navigate(R.id.action_questao6_to_questao7);
        });
    }
}