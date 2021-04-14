package com.utn.ParcialLaboV.controller;

import com.utn.ParcialLaboV.exception.PersonaNotExistsException;
import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Persona;
import com.utn.ParcialLaboV.repository.IJugadorRepository;
import com.utn.ParcialLaboV.service.implementation.JugadorService;
import com.utn.ParcialLaboV.service.implementation.PersonaService;
import com.utn.ParcialLaboV.service.implementation.RepresentanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }

    @PostMapping
    public void add(@RequestBody Persona persona){
        personaService.add(persona);
    }

    @GetMapping
    public List<Persona> getAll(){
        return personaService.getAll();
    }

    @GetMapping("/{personaId}")
    public Persona getById(@PathVariable Long personaId){
        return personaService.getById(personaId);
    }

    @DeleteMapping("/{personaId}")
    public void delete(@PathVariable Long personaId){
        personaService.delete(personaId);
    }

}
