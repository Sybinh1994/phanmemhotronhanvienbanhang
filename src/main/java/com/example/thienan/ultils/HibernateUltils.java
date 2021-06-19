package com.example.thienan.ultils;

import org.hibernate.HibernateError;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUltils {


    public static SessionFactory getSessionFactory(){

        try {
            Configuration configuration = new Configuration();

            //configuration.addAnnotatedClass(com.cnpm.example.thienan.entities.Account.class);

            configuration.configure("hibernate.cfg.xml");

            return configuration.buildSessionFactory();
        }catch (HibernateError h){

            h.getMessage();
        }

        return null;
//            Configuration configuration = new Configuration().configure();
//
//            configuration.addAnnotatedClass(com.cnpm.example.thienan.entities.AccountsEntity.class);
//
//            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
//                    .applySettings(configuration.getProperties());
//            SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
//            return sessionFactory;

    }

}
