package com.utn.ParcialLaboV.controller;

import com.utn.ParcialLaboV.model.Persona;
import com.utn.ParcialLaboV.service.implementation.PersonaService;
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

    @PostMapping("")
    public void add(@RequestBody Persona persona){
        personaService.add(persona);
    }

    @GetMapping("")
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

    @PutMapping("/{representanteId/jugadores/{jugadorId}")
    public void addJugador(@PathVariable Long representanteId, @PathVariable Long jugadorId){
        personaService.addJugador(representanteId,jugadorId);
    }

    @GetMapping("/{representanteId}")
    public void getAllJugadoresDeRepresentante(@PathVariable Long representanteId){
        personaService.getAllJugadoresDeRepresentante(representanteId);
    }


    //PLOT TWIST, no lo probe, crucen los dedos muchachos!
}
