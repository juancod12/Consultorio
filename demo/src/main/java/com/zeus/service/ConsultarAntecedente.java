package com.zeus.service;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zeus.dao.Antecedente;
import com.zeus.until.HibernateUtil;

public class ConsultarAntecedente {
    
    public static  Antecedente Consultar(int ID){

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Antecedente> query = session.createQuery("FROM Antecedente WHERE idAntecedente = :idAntecedente", Antecedente.class);
            query.setParameter("idAntecedente", ID); // o el valor que buscas
            return query.uniqueResult(); // porque esperas un solo resultado
        }

    }
    
    
}
