package com.zeus.service;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.zeus.dao.EstadoDiente;
import com.zeus.until.HibernateUtil;

public class CrearEstadoDiente {
    public static void crear(EstadoDiente estadoDiente){
        
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.merge(estadoDiente);

        // Confirmar
        tx.commit();

        // Cerrar sesión
        session.close();
        System.out.println("estado  de diente creado con exito");

    }
}
