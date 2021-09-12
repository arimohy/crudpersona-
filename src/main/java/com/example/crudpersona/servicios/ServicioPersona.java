package com.example.crudpersona.servicios;

import com.example.crudpersona.entidades.Persona;
import com.example.crudpersona.repositorio.InterfasRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioPersona implements InterfasServiciosPersona{

    @Autowired
    private InterfasRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarid(int id) {
        return  data.findById(id);
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {
        data.deleteById(id);
    }
    @Override
    public Persona actualizar(Persona persona) {
        return data.save(persona);
    }
}
