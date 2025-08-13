package com.zeus.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zeus.until.HibernateUtil;

import com.zeus.dao.Paciente;



public class CrearPaciente {

    public static void crear(Paciente paciente){
        
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.merge(paciente);

        // Confirmar
        tx.commit();

        // Cerrar sesión
        session.close();
        System.out.println("paciente guardado con exito");

    }
    
    
}
