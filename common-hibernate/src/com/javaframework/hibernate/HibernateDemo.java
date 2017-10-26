package com.javaframework.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sessionFactory =  cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee   employee =  new Employee();

        employee.setCode("001");
        employee.setName("wangqiang");
        session.save(employee);

        transaction.commit();
        session.close();


        System.out.println("sucessed");

    }
}
