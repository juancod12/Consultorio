package com.zeus.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zeus.dao.Odontograma;
import com.zeus.until.HibernateUtil;

public class ListarOdontogramas {
    public static  List<Odontograma> listarTodos(int ID){

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Odontograma> query = session.createQuery(
                "FROM Odontograma WHERE paciente.cedula = :cedula", Odontograma.class);
            query.setParameter("cedula", ID);
            return query.list(); // devuelve una lista de resultados
        }

    }
}
