package com.example.ltv2021.screens.SignUpScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.ltv2021.R;
import com.example.ltv2021.common.AppData;
import com.example.ltv2021.common.CheckData;
import com.example.ltv2021.common.URLs;
import com.example.ltv2021.common.untity.User;
import com.example.ltv2021.databinding.ActivitySignInScreenBinding;
import com.example.ltv2021.databinding.ActivitySingUpScreenBinding;
import com.example.ltv2021.screens.SignInScreen.SignInScreen;

import org.json.JSONException;
import org.json.JSONObject;

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
                !binding.nameET.getText().toString().equals("")&&
                        !binding.lNameET.getText().toString().equals("")&&
                        !binding.mailET.getText().toString().equals("")&&
                        !binding.passET.getText().toString().equals("")
        )
        {
            if(CheckData.checkMail(binding.mailET.getText().toString())){
                if(binding.passET.getText().toString().equals(binding.repPassET.getText().toString())){
                    JSONObject user = new JSONObject();
                    try{
                        user.put(User.EMAIL, binding.mailET.getText().toString());
                        user.put(User.PASSWORD, binding.passET.getText().toString());
                        user.put(User.FIRST_NAME, binding.nameET.getText().toString());
                        user.put(User.LAST_NAME, binding.lNameET.getText().toString());

                        JsonObjectRequest signUpRequest = new JsonObjectRequest(Request.Method.POST, URLs.REGISTER, user, new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {

                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                CheckData.makeMessage("Проблема с регистрацией ошибка", SingUpScreen.this);
                            }
                        });
                        AppData.getInstance(this).queue.add(signUpRequest);
                    }
                    catch(JSONException e){
                        e.printStackTrace();
                    }
                }
                else{
                    CheckData.makeMessage("Пароли не совпадают", this);
                }
            }
            else{
                CheckData.makeMessage("Некорректный e-mail", this);
            }
        }
        else{
            CheckData.makeMessage("Есть пустые поля", this);
        }
    }

}