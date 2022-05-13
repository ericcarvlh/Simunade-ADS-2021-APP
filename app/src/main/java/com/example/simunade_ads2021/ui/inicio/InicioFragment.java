package com.example.simunade_ads2021.ui.inicio;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

import com.example.simunade_ads2021.R;
import com.example.simunade_ads2021.activity.QuestoesActivity;

public class InicioFragment extends Fragment {

    Button buttonIniciarProva;
    VideoView videoViewEnade;

    public InicioFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        buttonIniciarProva = view.findViewById(R.id.buttonIniciarProva);



        buttonIniciarProva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), QuestoesActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
