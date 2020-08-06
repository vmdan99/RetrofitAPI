package com.example.callapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.callapi.Api.ApiClient;
import com.example.callapi.Model.RequestLogin;
import com.example.callapi.Model.ResponeRegister;
import com.example.callapi.Model.ResponeUser_Active;
import com.example.callapi.Model.ResponseLogin;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logIn();
//        Register();
//        User_Active();
    }
    public void logIn(){
        Call<List<ResponseLogin>> resLogin = ApiClient.getUserService().respone_login(null,null,"gafha@gmail.com","fhahfa");
        resLogin.enqueue(new Callback<List<ResponseLogin>>() {
            @Override
            public void onResponse(Call<List<ResponseLogin>> call, Response<List<ResponseLogin>> response) {
                if(response.isSuccessful()){
                    List<ResponseLogin> responseLogins = response.body();
                }

            }

            @Override
            public void onFailure(Call<List<ResponseLogin>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }/*
     Call<List<ResponseLogin>> resLogin = ApiClient.getUserService().respone_login(null,null,"gafha@gmail.com","fhahfa");
        resLogin.enqueue(new Callback<List<ResponseLogin>>() {
            @Override
            public void onResponse(Call<List<ResponseLogin>> call, Response<List<ResponseLogin>> response) {
                if(response.isSuccessful()){
                    List<ResponseLogin> responseLogins = response.body();
                }

            }

            @Override
            public void onFailure(Call<List<ResponseLogin>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }
     Call<List<ResponseLogin>> resLogin = ApiClient.getUserService().respone_login(null,null,"gafha@gmail.com","fhahfa");
        resLogin.enqueue(new Callback<List<ResponseLogin>>() {
            @Override
            public void onResponse(Call<List<ResponseLogin>> call, Response<List<ResponseLogin>> response) {
                if(response.isSuccessful()){
                    List<ResponseLogin> responseLogins = response.body();
                }

            }

            @Override
            public void onFailure(Call<List<ResponseLogin>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }
    public void Register(){
        Call<List<ResponeRegister>> resResgis = ApiClient.getUserService().register("10","10");
        resResgis.enqueue(new Callback<List<ResponeRegister>>() {
            @Override
            public void onResponse(Call<List<ResponeRegister>> call, Response<List<ResponeRegister>> response) {
                List<ResponeRegister> responeRegisters = response.body();
            }

            @Override
            public void onFailure(Call<List<ResponeRegister>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());

            }
        });
    }
    public  void User_Active(){
        Call<List<ResponeUser_Active>> resUser_Active = ApiClient.getUserService().user_active("10","10");
        resUser_Active.enqueue(new Callback<List<ResponeUser_Active>>() {
            @Override
            public void onResponse(Call<List<ResponeUser_Active>> call, Response<List<ResponeUser_Active>> response) {
                List<ResponeUser_Active> responeUser_actives = response.body();
            }

            @Override
            public void onFailure(Call<List<ResponeUser_Active>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());

            }
        });
    }*/
}