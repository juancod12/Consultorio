package com.zeus.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zeus.dao.Antecedente;
import com.zeus.until.HibernateUtil;

public class CrearAntecedente {
    public static void crear(Antecedente antecedente){
        
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.merge(antecedente);

        // Confirmar
        tx.commit();

        // Cerrar sesión
        session.close();
        System.out.println("antecedente creado con exito");

    }
}
