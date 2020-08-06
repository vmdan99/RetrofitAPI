package com.example.callapi.Api;

import com.example.callapi.Model.RequestLogin;
import com.example.callapi.Model.RequestRegister;
import com.example.callapi.Model.RequestUser_Active;
import com.example.callapi.Model.ResponeRegister;
import com.example.callapi.Model.ResponeUser_Active;
import com.example.callapi.Model.ResponseLogin;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface UserService {
    @Headers({
            "accept: application/json",
            "Content-Type: application/json",
    })
    @POST("authentication/login")
    Call<ResponseLogin> respone_login (@Header("X-CnId") String cmId, @Header("X-SentTime") String timeSent, @Body RequestLogin requestLogin);

    @Headers({
            "accept: application/json",
            "Content-Type: application/json",
    })
    @PUT("authentication/register")
    Call<ResponeRegister> register (@Header("X-CnId") String cmId, @Header("X-SentTime") String timeSent, @Body RequestRegister requestRegister);

    @Headers({
            "accept: application/json",
            "Content-Type: application/json",
    })
    @POST("authentication/user-active")
    Call<ResponeUser_Active> user_active (@Header("X-CnId") String cmId, @Header("X-SentTime") String timeSent, @Body RequestUser_Active requestUser_active);


    @GET("authentication/user-info")
    Call<ResponseLogin> takeInfo (@Header("Authotization") String token, @Header("X-CnId") String cmId, @Header("X-SentTime") String timeSent);


}
