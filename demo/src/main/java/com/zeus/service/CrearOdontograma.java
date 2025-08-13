package com.zeus.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zeus.dao.Odontograma;
import com.zeus.until.HibernateUtil;

public class CrearOdontograma {
    public static void crear(Odontograma odontograma){
        
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.merge(odontograma);

        // Confirmar
        tx.commit();

        // Cerrar sesión
        session.close();
        System.out.println("odontograma creado con exito");

    }
}
