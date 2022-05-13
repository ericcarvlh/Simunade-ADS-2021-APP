package com.example.simunade_ads2021.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.simunade_ads2021.R;
import com.example.simunade_ads2021.fragments.Q1Fragment;

public class QuestoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayouConteudoQuestoes, new Q1Fragment());
        transaction.commit();

    }
}