package com.example.thienan.dao;


import com.example.thienan.entities.AccountsEntity;
import com.example.thienan.ultils.HibernateUltils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoginDAOImpl implements LoginDAO {


    private SessionFactory sessionFactory;

    public LoginDAOImpl(){
        sessionFactory = HibernateUltils.getSessionFactory();
    }

    @Override
    public AccountsEntity login(String user, String pass) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        String hql = "FROM AccountsEntity E WHERE E.userName = :user";
        Query query = session.createQuery(hql);
        query.setParameter("user",user);

        List<AccountsEntity> list = query.list();

        transaction.commit();


        if (list.size() == 1){
            return list.get(0);
        }else{
            return null;
        }

    }
}
