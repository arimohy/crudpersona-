package com.example.crudpersona.controlador;

import com.example.crudpersona.entidades.Persona;
import com.example.crudpersona.servicios.InterfasServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api")
public class ControladorPersona {
    @Autowired
    private InterfasServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona>listarPersonas(){
        return servicio.listar();
    }
    @GetMapping(value = "/listarPersonas/{id}")
    public Optional<Persona> listarPersonas(@PathVariable Integer id){
        return servicio.listarid(id);
    }
    @PostMapping(value ="/guardarPersona")
    public Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }
    @DeleteMapping(value = "/eliminarPersona/{id}")
    public void eliminarPersona(@PathVariable Integer id){
        servicio.borrar(id);
    }
    @PutMapping(value = "/actualizar")
    public void actualizar(@RequestBody Persona persona){
        servicio.actualizar(persona);
    }
}

