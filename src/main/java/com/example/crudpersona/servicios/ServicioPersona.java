package com.example.crudpersona.servicios;

import com.example.crudpersona.entidades.Persona;
import com.example.crudpersona.repositorio.InterfasRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioPersona implements InterfasServiciosPersona{

    @Autowired
    private InterfasRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarid(int id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {

    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}
