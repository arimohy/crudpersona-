package com.example.crudpersona.controlador;

import com.example.crudpersona.entidades.Persona;
import com.example.crudpersona.servicios.InterfasServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ControladorPersona {
    @Autowired
    private InterfasServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona>listarPersonas(){
        return servicio.listar();
    }
    @PostMapping(value ="/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }
    @DeleteMapping(value = "/eliminarPersona/{id}")
    public void eliminarPersona(@PathVariable Integer id){
        servicio.borrar(id);
    }
}

