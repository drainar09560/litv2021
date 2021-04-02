package com.example.ltv2021.screens.SignUpScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.ltv2021.R;
import com.example.ltv2021.databinding.ActivitySignInScreenBinding;
import com.example.ltv2021.databinding.ActivitySingUpScreenBinding;

public class SingUpScreen extends AppCompatActivity {

    ActivitySingUpScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySingUpScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void SignUp(View view){
        if(
                !binding.nameET.getText().toString().equals("")&&!binding.lNameET.getText().toString().equals("")&&!binding.mailET.getText().toString().equals("")&&!binding.passET.getText().toString().equals("")
        ){
            
        }
    }

}