package com.example.simunade_ads2021;

import android.os.Bundle;

import com.example.simunade_ads2021.ui.inicio.InicioFragment;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.example.simunade_ads2021.databinding.FragmentInicioBinding;

import com.example.simunade_ads2021.databinding.ActivityMenuMainBinding;

public class MenuMainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMenuMainBinding binding;
    private FragmentInicioBinding inicioBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMenuMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBarMenuMain.toolbar);

        inicioBinding = FragmentInicioBinding.inflate(getLayoutInflater());
        setContentView(inicioBinding.getRoot());

        DrawerLayout drawer = binding.drawerLayout;
        // area de navegação
        NavigationView navigationView = binding.navView;

        // define as configurações do navigationdrawer
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_inicio, R.id.nav_creditos, R.id.nav_sobre).setOpenableLayout(drawer).build();

        // Configura a área que vai abrir os fragments
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_menu_main);

        // exibe a parte de navegação para chamar o drawerlayout
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);

        // Responsavel por configurar a navegação, permitindo as transições
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_menu_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}