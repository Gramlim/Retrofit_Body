package com.example.auth_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    EditText user;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);


    }

    public void onLogin(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://intelligent-system.online/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();                                               //объявление юрл конвертора и сборка ретрофита

        Interface api = retrofit.create(Interface.class); // указываем какой интерфейс использкем

        api.basicLogin(new User(String.valueOf(user.getText()),String.valueOf(pass.getText()))).enqueue(new Callback<User>() { // сам звонок ( Может быть несколько)
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    // код который должен исполняться при успешном ответе
                }
                else{
                    //код который должен исполнятся при неудачном ответе
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                //код который должен исполняться при ошибки программы. обычно выводится тост
            }
        });
        api.basicReg(new User(String.valueOf(user.getText()),String.valueOf(pass.getText()))).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                }
                else{
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
            }
        });


    }
}
