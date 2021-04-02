package com.example.ltv2021.screens.SignUpScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ltv2021.R;
import com.example.ltv2021.databinding.ActivitySignInScreenBinding;

public class SingUpScreen extends AppCompatActivity {

    ActivitySignInScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }


}