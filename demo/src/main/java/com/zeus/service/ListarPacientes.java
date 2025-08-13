package com.zeus.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zeus.dao.Paciente;
import com.zeus.until.HibernateUtil;

public class ListarPacientes {
    
    public static  List<Paciente> listarTodos(){

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Paciente> query = session.createQuery("FROM Paciente", Paciente.class);
            return query.list();
        }

    }
    
}
