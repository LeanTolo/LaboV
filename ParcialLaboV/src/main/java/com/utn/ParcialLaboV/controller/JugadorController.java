package com.utn.ParcialLaboV.controller;

import com.utn.ParcialLaboV.model.Jugador;
import com.utn.ParcialLaboV.model.Persona;
import com.utn.ParcialLaboV.service.implementation.JugadorService;
import com.utn.ParcialLaboV.service.implementation.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugador")
public class JugadorController {

    private final JugadorService jugadorService;

    @Autowired
    public JugadorController(JugadorService jugadorService){
        this.jugadorService = jugadorService;
    }

    @PostMapping
    public void add(@RequestBody Jugador jugador){
        jugadorService.add(jugador);
    }

    @GetMapping
    public List<Jugador> getAll(){
        return jugadorService.getAll();
    }

    @GetMapping("/{jugadorId}")
    public Jugador getById(@PathVariable Long jugadorId){
        return jugadorService.getById(jugadorId);
    }

    @DeleteMapping("/{jugadorId}")
    public void delete(@PathVariable Long jugadorId){
        jugadorService.delete(jugadorId);
    }
}
