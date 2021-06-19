package com.example.thienan.dao;


import com.example.thienan.entities.AccountsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface LoginDAO {
    public AccountsEntity login(String user, String pass);
}
