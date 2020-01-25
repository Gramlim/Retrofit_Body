package com.example.auth_test;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Interface { //Интрефейс. Здесь мы определяем тип звонка, методы Апи и то что отправляем (в данном случае тело)
    @POST("api/signin")
    Call<User> basicLogin (@Body User user);

    @POST("api/signup")
    Call<User> basicReg (@Body User user);

}
