package com.example.crudpersona.servicios;

import com.example.crudpersona.entidades.Persona;

import java.util.List;

public interface InterfasServiciosPersona {

    public List<Persona> listar();
    public Persona listarid(int id);
    public Persona guardar(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);

}
