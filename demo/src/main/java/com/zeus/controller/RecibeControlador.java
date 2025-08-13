package com.zeus.controller;

import com.zeus.dao.Paciente;

public interface RecibeControlador<T> {
    void setControladorPrincipal(T controlador);
    void setPaciente(Paciente paciente);
}
