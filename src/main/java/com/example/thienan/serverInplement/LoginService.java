package com.example.thienan.serverInplement;

import com.example.thienan.entities.AccountsEntity;


public interface LoginService {
    public AccountsEntity login (String username, String pass);
}
