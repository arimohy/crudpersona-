package com.example.crudpersona.repositorio;

import com.example.crudpersona.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfasRepositorioPersona  extends CrudRepository<Persona, Integer> {
    //Persona findAll();
}
