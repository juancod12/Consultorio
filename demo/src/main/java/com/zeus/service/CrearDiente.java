package com.zeus.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zeus.dao.Diente;
import com.zeus.until.HibernateUtil;

public class CrearDiente {
    public static void crear(Diente diente){
        
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.merge(diente);

        // Confirmar
        tx.commit();

        // Cerrar sesión
        session.close();
        System.out.println("diente creado con exito");

    }
}
