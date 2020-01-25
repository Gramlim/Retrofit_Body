package com.example.auth_test;

import com.google.gson.annotations.SerializedName;



public class User { // класс в котором мы объявляем все элементы json объекта
    @SerializedName("username") // как в документации
    private String username;    // правильность названия особого значения не имеет
                                // Объявите все элементы сразу, что бы потом не париться
    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    @SerializedName("card")
    private String card;

    @SerializedName("id")
    private String id;

    @SerializedName("token")
    private String token;

    public User (String user, String pass){ // присваиваем значение элемента
        this.username = user;
        this.password = pass;
    }

    public User (String username, String password, String card, String email){
        this.username = username;
        this.password = password;
        this.card = card;
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCard() {
        return card;
    }
}
