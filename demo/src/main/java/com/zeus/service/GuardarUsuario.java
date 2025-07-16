package com.zeus.service;

import com.zeus.dao.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.zeus.until.HibernateUtil;

public class GuardarUsuario {

    public boolean registrarUsuario(String nombre, String correo, String contrasena) {
        if (!validarCampos(nombre, correo, contrasena)) {
            return false;
        }

        if (usuarioYaExiste()) {
            return false; // Ya hay usuario, no dejar guardar otro
        }

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Usuario usuario = new Usuario(nombre, correo, contrasena);
            session.save(usuario);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    private boolean validarCampos(String nombre, String correo, String contrasena) {
        if (nombre == null || nombre.trim().isEmpty()) return false;
        if (correo == null || correo.trim().isEmpty()) return false;
        if (contrasena == null || contrasena.trim().isEmpty()) return false;

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return correo.matches(emailRegex);
    }

    private boolean usuarioYaExiste() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery("SELECT COUNT(u) FROM Usuario u", Long.class);
            Long count = query.uniqueResult();
            return count != null && count > 0;
        }
    }
}