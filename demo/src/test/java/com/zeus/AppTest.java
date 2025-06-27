package com.zeus;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;


import com.zeus.until.HibernateUtil;

public class AppTest {

    @Test
    public void createTablesTest(){
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();


    }
}
