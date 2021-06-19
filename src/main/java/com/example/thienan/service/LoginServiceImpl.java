package com.example.thienan.service;



import com.example.thienan.dao.LoginDAO;
import com.example.thienan.entities.AccountsEntity;
import com.example.thienan.serverInplement.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDAO loginDAO;

    @Override
    public AccountsEntity login(String user, String pass) {
        return loginDAO.login(user, pass);
    }
}
